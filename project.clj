(defproject training-day "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [iloveponies.tests/training-day "0.2.0-SNAPSHOT"]
                 [proto-repl "0.3.1"]]
  :profiles {:dev {:plugins [[lein-midje "3.2.1"]]}})
