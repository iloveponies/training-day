(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square
  "Squares the given number"
  [x]
  (* x x))

(defn average
  "Averages 2 numbers"
  [a b]
  (/ (+ a b) 2)
  )

;;Exercizes from the lesson:
;Ex 1
(+ 4 (* 2 3))
;Ex 2
(+ 3 4 5 6)
;Ex 3
(get "abracadabra" 0)
;Ex 4
(defn Isendgard! [name] (str "Mr. " name ", we're taking the hobbits to Isendgard!"))

(Isendgard! "Gabe")

hai


(Isendgard! "Biggelsworth")

(square 2)
