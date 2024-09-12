(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [& args]
  (/ (apply + args ) (count args )))
