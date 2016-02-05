(ns training-day)

(def answer 42)
n
(def hai "O HAI!")

(defn square [x]
   (* x x))

(defn average [a b]
  (/  (+ a b) 2))


  ; Ex 1
  (+ 4 (* 2 3))

  ; Ex 2
  (+ 3 4 5 6)

  (get "saira" 2)

  (first "saira is cool")

  (clojure.string/split "saira is cool" #" ")
  (clojure.string/join "," ["saira" "is" "cool"])

  ; Ex 3
  (get "abrakadabra" 0)


  ((fn [who] (str "Hello, " who " ! ")) 'Jain)

  ; Ex 4

  ((fn [name] (str "Welcome to Riverndell mrs " name)) "syed")

  ((fn [name] (str "Welcome to Riverndell mrs" name)) "syed")

  ; Ex 5

  (def hello (fn [who] (str "Hello," who "!")))
  (hello "beautiful")

  answer
; Exercise 6

(square 4)

; Exercise 7
(average  2 4 )
(average 1 2 )
