(ns training-day)

(def answer 42)

(def hai "O HAI!")

(defn square [x]
	(* x x))

(defn average [a b]
	(/ (+ a b) 2))


(defn hello1 [who] "Hello again, " who "!")
(defn hello2 [who] "Hello hello, " who "!")

(defn
	hello
	"Gives out personalized greetings."
	[who]
	(str "Hello, " who "!"))