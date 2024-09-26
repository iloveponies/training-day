(ns training-day)

(def answer 42)                                             ;=> 42

(def hai "O HAI!")

(defn                                                       ; Start a function definition
  square                                                    ; name
  "Calculates the square of given value [x]"                ; an optional docstring
  [x]                                                       ; parameters inside brackets
  (* x x))                                                  ; body

(defn
  average
  "Calculates the average of the given two parameters [x, y]"
  [x y]
  (/ (+ x y) 2))
