(ns training-day-test
  (:use training-day
        midje.sweet))

(facts
  (square 2) => 4
  (square 3) => 9)

(facts
  (abs -2) => 2
  (abs 42) => 42)

(facts
  (fizzbuzz 45) => "gotcha!"
  (fizzbuzz 48) => "fizz"
  (fizzbuzz 70) => "buzz")
