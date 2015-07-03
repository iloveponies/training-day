(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average "Supa'-bad averager!" [& nums]
  (/ (reduce + nums) (count nums)))
