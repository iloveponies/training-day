;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(ns indexes
  (:require [criterium.core :refer [bench]]
            [clojure.core.reducers :refer [fold]]))

(defn indexes "Transducer finding indexes of an element occuring in a sequence"
  [element]
  (keep-indexed #(when (= element %2) %1)))

(defonce long-string (clojure.string/join (repeatedly 10000 (partial rand-nth [\1 \0])) ))


(fold plus combine  (eduction (comp (indexes \1) (map #(vector % %))) long-string))

(plus [[[0 0]] [2 3]] [5 5])

(defn combine [[accepted-1 boundary-1] [accepted-2 boundary-2]]
  (let[[[a b] [c d]] [boundary-1 (first accepted-2)]]
    (if (<= b c (inc b))
      [(into (if (empty? accepted-1) [] (pop accepted-1)) (cons [a d] accepted-2))  boundary-2]
      [(into accepted-1 (cons boundary-1 accepted-2)) boundary-2])))


(concat (drop-last [[0 3] [4 4]])  [[5 10]] [[12 13] [16 16]])
(combine [[] [0 0]] [[[1 3]] [9 10]])

(defn plus
  ([] [[] nil])
  ([[accepted boundary] to-add]
   (if (nil? boundary)
     [accepted to-add]
    (let[[[a b] [c d]] [boundary to-add]]
      (if (<= b c (inc b))
        [accepted [a d]]
        [(conj accepted boundary) to-add])))))
