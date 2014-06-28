(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))

(comment
  (square 7)
  (+ (* 2 3) 4)
  (+ 3 4 5 6)
  *
  (first "abrakadabra")
  ((fn [name] (str "Welcome to Rivendell mr " name)) "Paul")
  (user/clojuredocs min)
  hai
  )
