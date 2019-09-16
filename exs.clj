;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(+ 4 (* 2 3))

(+ 3 4 5 6)

(get "abrakadabra" 0)


(def ola (fn [name] (str "Welcome to Rivendell mr " name)))

(ola "amiguinho")

(defn mae [oi]
  (str "Ola maroto para " oi))

(mae "Mae")

(use 'clojure.repl)
(doc +)

user=> (user/clojuredocs min)