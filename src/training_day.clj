(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square
  "squares the value of x (* x x)"
  [x]
  (* x x))

(defn average
  [a b]
  (/ (+ a b) 2))

;;evolution of a function
;;annoymous, instantly gone
;((fn [who] (str "hello, " who "!")) "Jani")

;;define to keep annoymous around
;(def hello (fn [who] (str "Hello, " who "!")))

;;common place so we have a function for it
(defn hello
  "Gives out personalized greetings."
  [who]
  (str "Hello, " who "!"))

(square 2)
(square 3)

(average 2 4)
(average 1 2)