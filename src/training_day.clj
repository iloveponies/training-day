(ns training-day)

(def answer 42)

(def hai "O HAI!")



;; Files and Namespaces

;; Code in Clojure projects is structured into namespaces defined in files.
;; Usually each file corresponds to one namespace identified by the file's path.


;; See how the namespace is called 'training-day', but the file is training_day.clj?
;; This is intentional.  If a namespace name has a hyphen, the corresponding file
;; nmae should have an underscore.


;; (use 'training-day)

;; What 'use' did was that it looked inside the namespace 'training-day' and
;; brought with it all the names defined in that namespace. The name 'hai' was one
;; of them.


(defn square [number]
  "square takes a number and returns the square value"
  (* number number))

(defn average [num-1 num-2]
  "takes two number and returns the average"
  (/ (+ num-1 num-2) 2))
