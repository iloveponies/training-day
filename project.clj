(defproject training-day "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [iloveponies.tests/training-day "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]
                             [refactor-nrepl "2.2.0"]
                             [cider/cider-nrepl "0.11.0"]]}})
