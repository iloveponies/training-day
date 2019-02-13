(defproject training-day "1.0.0-SNAPSHOT"
  :managed-dependencies [[midje "1.9.6"]]
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [iloveponies.tests/training-day "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:depdendencies [[midje "1.9.6"]]
                   :plugins [[lein-midje "3.2.1"]
                             [lein-ancient "0.6.15"]]}})
