(ns training-day
    (:require [clojure.math.numeric-tower :as math]))

(def answer 
    42)

(def hai "O HAI!")

(defn square [x]
    (math/expt x 2))

(defn average [a b]
    (/ (+ a b) 2))
