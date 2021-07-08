(comment
  (+ 1 1) -> appelle la fonction + (qui est une fonction)
  (get "Abrakadabra" 0) -> Récupère le premier charactère

  (fn [who] (str "Hello, " who " ! ")) <-- fn défini une fonction
                                           [who] est un paramètre
                                           (...) est ce que retourne la fonction

  ((fn [who] (str "Hello, " who " !")) "Jani") <-- Appelle la fonction en passant un nom en paramètre
                                               <-- Ce qui retourne "Hello, Jani !"

)

(ns training-day) ; Namespace

(def answer 42) ; Function

(def hai "O HAI!")

(defn square [x]
  (* x x)
)

(defn average [a b]
  (/ (+ a b) 2)
)
