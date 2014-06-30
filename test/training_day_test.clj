(ns training-day-test
  (:use iloveponies.tests.training-day midje.sweet training-day))

  (facts "square" {:exercise 6
                  :points 1}
    (square 2) => 4
    (square 1) => 1
    (square 3) => 9)

  (fact "average"
    (average 3 4) => 7/2)



