(defproject training-day "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [midje "1.9.6" :scope "test"]
   [marick/suchwow "6.0.2" :scope "test" :exclusions [[org.clojure/clojure] [org.clojure/clojurescript]]]
     [com.rpl/specter "0.13.0" :scope "test" :exclusions [[org.clojure/clojure] [org.clojure/clojurescript]]]
                 [iloveponies.tests/training-day "0.1.0-SNAPSHOT"]]

  )
