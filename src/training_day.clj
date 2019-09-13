(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))

answer
hai
(square 3)
(average 10 20)

;  ===============================

(+ 4 (* 2 3))
(+ 3 4 5 6)
(get "Clojure" 2)
(get "abrakadabra" 0)

((fn [who] (str "Hello, " who "!")) "Jani")

((fn [name] (str "Welcome to Rivendell mr " name)) "Toni")

; (def hello (fn [who] (str "Hello, " who "!")))
(defn                                 ; Start a function definition:
  hello                               ; name
  "Gives out personalized greetings." ; a optional docstring
  [who]                               ; parameters inside brackets
  (str "Hello, " who "!"))            ; body

(hello "beautiful")
(hello "handsome")

(use 'clojure.repl)
(doc hello)

