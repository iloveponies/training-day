
(ns training-day) ; ns = namespace

(def answer 42)

(defn                                 ; Start a function definition:
  hello                               ; name
  "Gives out personalized greetings." ; a optional docstring
  [who]                               ; parameters inside brackets
  (str "Hello, " who "!"))            ; body. Note there is no 'return' keyword

;to get the functions doc: write (use 'clojure.repl);... (doc functionName)

(def hai "O HAI!")
(defn square [x]
  (* x x))


(defn average [a b]
  (/(+ a b) 2))

(defn hellowho [who]
  (println(str "Hello " who)))
