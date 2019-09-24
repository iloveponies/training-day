(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square
  [x]
  (* x x))

(defn average
  [a b]
  (/ (+ a b) 2)
  )

;(+ (* 5 5) 43)

;(take 20 (cycle ["asdf" "fdsa"]))

;(+ (* 2 3 ) 4)

;(+ 3 4 5 6)


;(get "abrakadabra" 1)


(def tervehdi (fn [kuka] (str "Hello, " kuka "!!!")))

(tervehdi "asdfasd")

answer

(use 'training-day)
hai

(square 6)

(average 1 4)
