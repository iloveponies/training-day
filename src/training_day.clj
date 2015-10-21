(ns training-day)

; exercise-1
(+ 4 (* 2 3))

; exercise-2
(+ 3 4 5 6)

; exercise-3
(get "abrakadabra" 0)

; exercise-4
((fn [name] (str "Welcome to Rivendell mr " name)) "Jani")

; exercise-5
(def answer 42)

; exercise-6
(defn square [x]
  (* x x))

(square 2)
(square 3)

; exercise-7
(defn average [a b]
  (/ (+ a b) 2))

(average 2 4)
(average 1 2)
