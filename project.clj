(defproject training-day "1.0.0-SNAPSHOT"

  :plugins [[cider/cider-nrepl "0.9.0-SNAPSHOT"]]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [iloveponies.tests/training-day "0.1.0-SNAPSHOT"]
                 [org.clojure/tools.nrepl "0.2.10"]]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]]}})
