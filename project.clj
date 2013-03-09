(defproject training-day "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.0"]]
  :profiles {:dev
             {:dependencies
              [[midje "1.5-RC1"]]}}
  :plugins [[lein-midje "3.0-RC1"]])