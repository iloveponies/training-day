(defproject training-day "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [iloveponies.tests/training-day "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]
                             [cider/cider-nrepl "0.8.0-SNAPSHOT"]]}})
