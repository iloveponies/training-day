(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))


(+ 4 (* 2 3)) ;=> 10

(+ 3 4 5 6) ;=> 18

(fn [who] (str "Hello, " who "!"))

((fn [who] (str "Hello, " who "!")) "Jani")

((fn [name] (str "Welcome to Rivendell mr " name)) "Oliver")


(def hello (fn [who] (str "Hello, " who "!")))

(hello "beautiful")
(hello "handsome")
(hello answer)
