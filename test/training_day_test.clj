(ns training-day-test
  (:use midje.sweet
        training-day))

(facts "answer" {:exercise 5
                 :points 1}
       answer => 42)

(facts "square" {:exercise 6
                 :points 1}
       (square 2) => 4
       (square 3) => 9)

(facts "average" {:exercise 7
                  :points 1}
       (average 2 4) => 3
       (average 1 2) => 3/2)
