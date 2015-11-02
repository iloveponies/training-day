(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (+ (quot a 2) (quot b 2) (/ (+ (mod a 2) (mod b 2)) 2)))
