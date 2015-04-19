(ns training-day-test
  (:use iloveponies.tests.training-day))
(import 'javax.swing.JFrame)
(def frame (JFrame. "Hello Frame"))
(.setSize frame 200 200)
(.setVisible frame true)
