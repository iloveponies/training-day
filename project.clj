(defproject training-day "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0-alpha4"]
                 [iloveponies.tests/training-day "0.1.0-SNAPSHOT"]
                 [seesaw "1.4.4"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.clojure/test.check "0.6.1"]
                 [org.clojure/algo.monads "0.1.5"]
                 [criterium "0.4.3"]
                 ]
  :profiles {:dev {:plugins [[lein-midje "3.1.1"]]}})

