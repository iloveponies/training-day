(ns training-day
    (:gen-class))

(def answer  42)

(def hai "O HAI!")

(defn square
  "square"
  [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) (count [a b]))
  )
