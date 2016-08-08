(ns training-day)

(def answer ":(")

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))

+

(get "Clojure" 2)

((fn [who] (str "Hello, " who "!")) "Jani")

(def hello "Gives out personalized greetings." (fn [name] (str "Welcome to Rivendell mr " name)))

(hello "handsome")
(hello "beautiful")
(def answer 42)

(use 'clojure.repl)
(use 'training-day)

(doc +)
(doc hello)
(+)

(use 'training-day)
hai
