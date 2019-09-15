(ns training-day)

; http://iloveponies.github.io/120-hour-epic-sax-marathon/training-day.html

"
Exercise 5

Give a name answer to the answer to life the universe and everything.
This is the first exercise in which you need to modify the file src/training_day.clj.
Remember to run the tests with lein midje.

aswer ;=> 42
"
(def answer 42)

"
Exercise 6

Write the function (square x) that takes a number as a parameter and multiplies it with itself.

(square 2) ;=> 4
(square 3) ;=> 9
"
(defn square [x]
  (* x x))

"
Exercise 7

Write the function (average a b), which returns the average of its two parameters:

(average 2 4) ;=> 3
(average 1 2) ;=> 3/2
"
(defn average [a b]
  (comment
    (/ (+ a b) 2))
  (-> a (+ b) (/ 2)))
