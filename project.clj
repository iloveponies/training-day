(defproject training-day "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [iloveponies.tests/training-day "0.1.0-SNAPSHOT"]]
  :profiles {:dev {:dependencies [[midje "1.7.0"]]}}
  :plugins [[lein-midje "3.2-RC4"] [lein-kibit "0.1.2"]])
