(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  "square a number" (* x x))

(defn average [a b]
  "average two number" (/(+ a b) 2))

(+ 4 (* 2 3))
(+ 3 4 5 6)
+
(get "abrakadabra" 0)
((fn [who] (str "Hello, " who "!")) "Jani")
((fn [name] (str "Welcome to Rivendell mr " name)) "Adrift")
(def hello (fn [who] (str "Hello, " who "!")))
(defn
  hello
  "Gives out personalized greetings."
  [who]
  (str "Hello, " who "!"))
(use 'clojure.repl)
(doc +)
(doc hello);(user/clojuredocs min)
(use 'training-day)
hai
answer
