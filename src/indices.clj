(ns indices
  (:require [criterium.core :refer [bench]]
            [clojure.core.reducers :refer [fold]]))

(defn indices "Transducer finding indices of an element occuring in a sequence"
  [element]
  (keep-indexed #(when (= element %2) %1)))

(defn combine
  ([] [[] nil])
  ([[acc-a bnd-a] [acc-b bnd-b]]
   (let[ [[a b] [c d]] [bnd-a (first acc-b)] ]
     (if (<= b c (inc b))
       [(into acc-a (concat [[a d]] (pop acc-b) )) bnd-b]
       [(into acc-a (concat [bnd-a] acc-b)) bnd-b]))))

(defn plus
  ([] [[] nil])
  ([[accepted boundary] to-add]
   (if (nil? boundary)
     [accepted to-add]
    (let[[[a b] [c d]] [boundary to-add]]
      (if (<= b c (inc b))
        [accepted [a d]]
        [(conj accepted boundary) to-add])))))

(defn printable-indices [element the-seq]
  (let[glommed (clojure.core.reducers/fold combine plus (eduction (comp (indices \1) (map #(vector % %))) the-seq))
       fixed-up (conj (first glommed) (last glommed))];;Because the reduction is done, the last boundary is now accepted.
    (clojure.string/join ", " (map (fn [[a b]](if (= a b) (str a) (str a \- b))) fixed-up))))
