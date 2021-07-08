(ns training-day)

(def answer (+ 42))

(def hai "O HAI!")

(defn                                 ; Start a function definition:
  square                               ; name
  "returns the square of the given parameter." ; a optional docstring
  [x]                                          ; parameters inside brackets
  (* x x))                            ; body

(defn                                 ; Start a function definition:
  average                               ; name
  "returns the average of the given parameters." ; a optional docstring
  [a b ]                                          ; parameters inside brackets
  (/ (+ a b) 2 ))                            ; body
