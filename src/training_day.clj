(ns training-day
  (:use [clojure.repl]))


(def answer 42)

(def hai "O HAI!!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))

;"(2*3)+4"
(+ (* 2 3) 4)

;"3+4+5+63+4+5+6"
(+ 3 4 5 6 3 4 5 6)

(get "Clojure" 0)

;; "Write a Clojure expression in the REPL that, using get, gets the first character in the string 'abrakadabra'."
(get "abrakadabra" 0)

(def hello (fn [who] (str "Hello, " who "!")))

(hello "Topi")

(def nimi "Topi")

;; hello
(defn hello [who]
  (str "Hello, " who "!"))

(hello nimi)

(defn foo [stuff]
  (take 5 (cycle stuff)))

(foo ["1", "2", "3"])

(defn foo [stuff]
  (take 5 (cycle stuff)))
