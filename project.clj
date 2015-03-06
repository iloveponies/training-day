(defproject training-day/training-day "1.0.0-SNAPSHOT"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {:dev
             {:dependencies
              [[midje "1.4.0"]
               [com.stuartsierra/lazytest "1.2.3"]]}}
  :repositories {"stuart" "http://stuartsierra.com/maven2"}
  :plugins [[lein-midje "2.0.0-SNAPSHOT"]]
  :description "Training day")
