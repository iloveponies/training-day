(require '[clojure.test.check.generators :as gen])
(import java.util.Comparator)

(def ACTIONS
  {:create-new-user #{}
   :edit-user #{:create-new-user}
   :create-new-board #{:create-new-user}
   :edit-board #{:create-new-board}
   :create-new-anonymous-comment #{:create-new-board}
   :create-new-signed-comment #{:create-new-board}
   :edit-comment-text #{:create-new-anonymous-comment :create-new-signed-comment}
   :edit-comment-text-and-flip-anonymity #{:create-new-anonymous-comment :create-new-signed-comment}
   :flip-anonymity #{:create-new-anonymous-comment :create-new-signed-comment}
   :vote-comment-up #{:create-new-anonymous-comment :create-new-signed-comment}
   :vote-comment-down #{:create-new-anonymous-comment :create-new-signed-comment}})

(defn- find-minimal "Find a minimal element of a poset."
  [poset]
  (let[minimal (first (filter (comp empty? val) poset))]
    (when minimal (key minimal))))

(defn- remove-element "Remove an element from a poset and all links to it."
  [poset element]
  (let[filtered (filter #(not= element (key %)) poset)]
    (zipmap
     (keys filtered)
     (map #(disj % element) (vals filtered)))))

(defn- order-poset
  "Given a poset described as a map from keywords to prerequisite keywords,
  defines a total ordering."
  [poset]
  (loop [poset poset ordering {} counter 0]
   (let[min-element (find-minimal poset)]
     (if (empty? poset)
       ordering
       (recur (remove-element poset min-element) (assoc ordering min-element counter) (inc counter))
       ))))

(defn make-comparator "Implements a comparator for totally ordering a poset"
  [poset]
  (let[ordering (order-poset poset)]
    (reify Comparator
      (compare [this a b] (- (get ordering a) (get ordering b)))
      )))

(def action-sorter (make-comparator ACTIONS))


(defn actionlist []
  )

(def actions (->> ACTIONS keys vec gen/elements gen/vector (gen/fmap filter-into-logical-order)))

(->> (gen/sample actions 10000)
     (map count)
     frequencies)



(defn valid-sequence?
  "Tests whether a sequence of actions is valid."
  [action-seq]
  (last (reduce
         (fn [[seen needed satisfied] action]
           (let[seen (conj seen action)
                needed (clojure.set/union needed (get ACTIONS action))]
             [seen needed (and satisfied (every? (partial contains? seen) needed))]))
         [#{} #{} true]
         action-seq)))

(defn filter-into-logical-order [as]
  (last (reduce
         (fn [[seen accepted-as] action]
           (let[needed (get ACTIONS action)]
             (if (or (empty? needed) (some seen needed))
               [(conj seen action) (conj accepted-as action)]
               [seen accepted-as]))
           )
         [#{} []]
         as)))
