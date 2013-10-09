(defproject training-day "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.0"]]
  :profiles {:dev
             {:dependencies [
			[midje "1.5.1"]
			[org.clojure/math.numeric-tower "0.0.2"]
			    ]
              :plugins [[lein-midje "3.0.0"]]}})
