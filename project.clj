(defproject training-day "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [iloveponies.tests/training-day "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[midje "1.6.0" :exclusions [org.clojure/clojure]]]
                  :plugins [[lein-midje "3.1.3"]]}})

