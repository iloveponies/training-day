(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average
  ;([a] a)
  ;([a b] (/ (+ a b) 2)))
  ([& args] (/ (reduce + args) (count args))))

