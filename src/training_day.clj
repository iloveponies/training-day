(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
  (* x x))

(defn average [a b]
  (/ (+ a b) 2))

(comment
  (+ 1 2)
  (str 1337)

  (+ (* 2 3) 4)
  (+ 3 4 5 6)
  (+ 1)
  +
  (get "Clojure" 2)
  (get "abrakadabra" 0)

  ((fn [who] (str "Hello, " who "!")) "Jani")

  ((fn [name] (str "Welcome to Rivendell mr " name)) "Lynch")

  (def hello (fn [who] (str "Hello, " who "!")))

  (hello "beautiful")
   
  (defn hello 
    "Gives out personalized greetings."
    [who]
    (str "Hello, " who "!")
  )
  )
