
(ns training-day) ; ns = namespace

(defn                                 ; Start a function definition:
  hello                               ; name
  "Gives out personalized greetings." ; a optional docstring
  [who]                               ; parameters inside brackets
  (str "Hello, " who "!"))            ; body. Note there is no 'return' keyword

;to get the functions doc: write (use 'clojure.repl);... (doc functionName)

(def answer ":(")

(def hai "O HAI!")

(defn square [x]
  (* x x))


(defn average [a b]
  (/(+ a b) 2))
(defn hellowho [who]
  (println(str "Hello " who)))

;this is comment
; 4 + (2*3)
(println (+ 4 (* 2 3)))
(println (square 5))
(println (average 2 9.5))
(println (str hai " " 2100 "!"))
(println (take 20(cycle ["fi" "ba"])))
(println (str "say the n:th letter from 'heppa' " (get "heppa" 2)))
(hellowho "Joona")
;Anonymous function
(def kotoisin (str ((fn [city] (str "Olen kotoisin " city ":sta")) "Helsinki")))

(println (str "Olen kotoisin " kaupunki ":sta"))
