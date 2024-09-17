(ns training-day-test
  (:use iloveponies.tests.training-day)
  (:require [training-day :refer :all]
            [midje.sweet :refer :all]))

(square 2)

(facts "square"
       (square 2) => 4
       (square 3) => 9)

(average 1 3)

(facts "average"
       (average 1 3) => 2
       (average 5 5) => 5)

answer

(facts "answer"
       answer => 42)
