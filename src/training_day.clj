(ns training-day)

;(+ 3 5)
;(* 2 5)
;(- 2 5 5)
;(str "Muokataan " 1 ". merkkijono")
;(take 10 (cycle ["anton" "moroz"]))
;(def hai "O HAI!")
;hai ; metodin suoritus ilman sulkeita

;Eka harjoitus
(+ 4 (* 2 3))
;Toka harjoitus
(+ 3 4 5 6)
;Kolmas harjoitus
(get "abrakadabra" 0)
;Neljäs harjoitus
((fn [nimi] (str "Welcome to Rivendell mr " nimi)) "Anton")
;OmaMoikkaus
((fn [vuosi] (str "Anton on syntynyt vuonna " vuosi)) 1993)

;Rivendell-muokkaus
(def RivendellHello (fn [nimi] (str "Welcome to Rivendell mr " nimi)))
RivendellHello


;Viides harjoitus (palautettava)
(def answer 42)
answer

(def hai "O HAI!")

(defn
  square
  "Tulostaa annetun luvun neliön"
  [x]
  (* x x))

(defn
  average
  "Laskee kahden luvun keskiarvon"
  [a b]
  (/ (+ a b) 2))

