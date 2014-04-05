(ns training-day) ; declare the name space of training-day
; See how the namespace is called training-day, but the file is training_day.clj?
; This is intentional. If a namespace name has an hyphen, the corresponding file name should have an underscore.

; (use 'training-day) to import the namespace to access the names in the space
; ' is the short for (quote ) special form to prevent evaluation of the symbol being quoted.

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))
