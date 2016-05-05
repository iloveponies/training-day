;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

(defproject training-day "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [iloveponies.tests/training-day "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]]}})
