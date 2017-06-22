(ns training-day)


;; Ex 5
;; Give a name answer to the answer to life the universe and everything. This is the first exercise in which you need to modify the file src/training_day.clj.
;; Remember to run the tests with lein midje.

(def answer 42)

(def hai "O HAI!")


;; Ex 6
;; Write the function (square x) that takes a number as a parameter and multiplies it with itself.

(defn square [x]
  (* x x))


;; Ex 7
;; Write the function (average a b), which returns the average of its two parameters:

(defn average [a b]
  (/ (+ a b) 2))

