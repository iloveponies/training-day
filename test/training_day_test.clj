(ns training-day-test
  (:use training-day
        midje.sweet))

(facts "5 answer"
       answer => 42)

(facts "6 square"
  (square 2) => 4
  (square 3) => 9)

(facts " 7 average"
  (average 2 4) => 3
  (average 1 2) => 3/2)
