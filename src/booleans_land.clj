(ns training-day)


(defn
  boolean
  "Alike implemention for build-in boolean function"
  [param]
  (if param true false))


(defn
  teen?
  "Returns true if age is between 13 and 19, inclusive."
  [age]
  (if (<= 13 age 19) true false))


(defn
  abs
  "Returns the absolute value of n"
  [n]
  (if (< n 0) (* n -1) n))


(defn
  divides?
  "Returns true if divisor divides n and false otherwise"
  [divisor n]
  (if (== (mod n divisor) 0) true false))


(defn
  generic-doublificate
  "Takes one argument and:
    - doubles it if it is a number,
    - returns nil if it is an empty collection,
    - if it is a list or a vector, returns two times the length of it
    - returns true otherwise.
    Functions available:
    - (number? n) returns true if n is a number.
    - (empty? coll) returns true if coll is empty.
    - (list? coll) and (vector? coll) and (map? coll) test if coll is a list, a vector or a map.
    - (count coll) returns the length of a list or a vector."
  [x]
  (cond
     (number? x) (* 2 x)
     (or (list? x)
         (vector? x)
         (map? x)) (cond
                     (empty? x) nil
                     :else      (* 2 (count x)))
     :else     true))


(defn
  not-teen?
  "Returns true when teen? returns false and false otherwise."
  [age]
  (not (teen? age)))


(defn
  leap-year?
  "Returns true if year is a leap year, otherwise false.
   A year is a leap year if it is divisible by 4, except
   if it is divisible by 100, in which case it still is
   a leap year if it is divisible by 400."
  [year]
  (cond
     (divides? 4 year) (cond
                          (divides? 100 year) (cond
                                                (divides? 400 year) true
                                                :else               false)
                          :else true)
     :else false))
