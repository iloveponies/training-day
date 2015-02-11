(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square
  "Multiply argument by itself"
  [x]
  (* x x)
  )

(defn average
  "Compute average of several arguments"
  ([]      0)
  ([a]     a)
  ([a b]   (/ (+ a b) 2))
  ([a b & more] (/ (apply + a b more) (+ 2 (count more)))))
