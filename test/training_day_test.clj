(ns training-day-test
  (:use training-day
        midje.sweet))

(facts "square"
  (square 2) => 4
  (square 3) => 9)

(facts "abs"
  (abs -2) => 2
  (abs 42) => 42)

(facts "fizzbuzz"
  (fizzbuzz 45) => "gotcha!"
  (fizzbuzz 48) => "fizz"
  (fizzbuzz 70) => "buzz")

(facts "average"
  (average 2 4) => 3
  (average 1 2) => 3/2)
