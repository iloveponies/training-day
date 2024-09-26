(ns training-day)

(defn                                 ; Start a function definition:
  hello                               ; name
  "Gives out personalized greetings." ; a optional docstring
  [who]                               ; parameters inside brackets
  (str "Hello, " who "!"))            ; body

(def
  answer
  42)

(def
  hai
  "O HAI!")

(defn
  square
  "Returns the square of the parameter."
  [x]
  (* x x))

(defn
  average
  "Returns the average of two parameters."
  [a b]
  (/ (+ a b) 2))


