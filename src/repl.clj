(+ 4 (* 2 3))

(+ 3 4 5 6)

(get "abrakadabra" 0)

(fn [who] (str "Hello, " who "!"))

((fn [who] (str "Hello, " who "!")) "Jani")

((fn [name] (str "Welcome to Rivendell mr " name)) "Bilbo Baggings")

(def hello (fn [who] (str "Hello, " who "!")))

(hello "Bilbo")

(doc +)

(use 'clojure.repl)
(doc hello)
