(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average
  ([] nil)
  ([& xs] 
   (/ (apply + xs) (count xs))))
