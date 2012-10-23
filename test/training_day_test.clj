(ns training-day-test
  (:use training-day
        midje.sweet))

(facts "square"
  (square 2) => 4
  (square 3) => 9)

(facts "average"
  (average 2 4) => 3
  (average 1 2) => 3/2)
