(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))

(defn boolean [a]
  (if (= a nil) false (if (= a false) false true))
)

(defn teen? [a_number]
  (if (<= 13 a_number 19) true false))

(defn abs [a_number]
  (if (<= 0 a_number) a_number (if (< a_number 0) (- a_number))))

(defn divides? [divisor a_number]
  (if (== (mod a_number divisor) 0) true false))

(defn fizzbuzz [a_number]
  (cond
    (== (mod a_number 15) 0) "gotcha!"
    (== (mod a_number 3) 0) "fizz"
    (== (mod a_number 5) 0) "buzz"
    :else ""
    ))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (or (list? x) (vector? x)) (if (empty? x) nil?
                                 (* (count x) 2))
    :else true
    )
  )

(defn not-teen? [a_number]
  (not (teen? a_number)))

(defn leap-year? [a_year]
  (if
    (== (mod a_year 4) 0) ;Potential leap year
    (if (== (mod a_year 100) 0) ;Make sure it isn't divisible by 100
      (if (== (mod a_year 400) 0)
        true  ;A leap year if divisible by 400
        false) ;Divisible by 100 but not by 400 so not a leap year
      true ;Divisible by 4 but not by 100
      )
    false)
  )