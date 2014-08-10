(ns training-day)

(def answer 42)

(defn square [x]
  (* x x))

(defn average [a b]
  (comment
    (/ (+ a b) 2))
  (-> a (+ b) (/ 2)))
