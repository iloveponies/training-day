(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))

(+ 4 (* 2 3))

(+ (+ (+ 3 0) 5) 6)

(- 3)

(get "abrakadabra" 0)

(fn [who] (str "Hello, " who "!"))
((fn [who] (str "Hello, " who "!")) "Lucas")

((fn [name] (str "Welcome to Rivendell mr " name)) "Lucas")

(defn hello
 "Personalized string settings"
 [who]
 (str "Hello, " who "!"))

(hello "beautiful")
