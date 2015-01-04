(ns training-day)

(def answer
  42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))

(defn boo [x]
  (if x true false))

(defn teen? [x]
  (if (<= 13 x 19) true false))

(defn not-teen? [age] 
  (if (not (teen? age)) true false))

(defn abs [x]
  (if (< x 0) (- x) x))

(defn divides? [n d]
  (if (= (mod n d) 0) true false ))

(defn fizzbuzz [n] 
  (cond (divides? n 15) "gotcha"
        (divides? n 3) "fizz"
        (divides? n 5) "buzz"
        :else ""
        ))

(defn generic-doublificate [n]
  (cond (number? n) (* n 2)
        (empty? n) nil
        (or (list? n) (vector? n)) (* (count n) 2)
        :else true
        ))

(defn leap-year? [year]
  (if (divides? year 4)
    (if (divides? year 100)
     (if (divides? year 400)
       true
       false)
     true
    )
    false
    )
  )

