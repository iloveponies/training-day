(ns training-day)

(def answer 42)


(def hai (fn [] (str "O HAI!")))
(hai)

(defn square [x]
  (* x x))
(square 2)
(square 3)

(defn average [a b]
  (/ (+ a b) 2))
  (average 2 4)
  (average 1 2)
