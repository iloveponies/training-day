(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))

(defn boolean [x]
  (if x true false))

(defn teen? [age]
  (< 12 age 20))

(defn abs [n]
  (if (< n 0)
    (- n)
    n ))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false
    )
  )

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
    )
  )

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true
    )
  )

(defn not-teen? [age]
  (not (teen? age))
  )

(defn leap-year? [year]
  (if (or ((== (mod year 4) 0) (not (== (mod year 100) 0))) (== (mod year 400) )))
  )
