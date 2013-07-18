(ns grading-emitter
  (:require [midje.emission.plugins.util :as util]
            [midje.data.fact :as fact]
            [midje.emission.plugins.silence :as silence]
            [midje.emission.state :as state]))

(def failures (atom 0))
(def points-counter (atom 0))

(defn starting-to-check-top-level-fact [fact]
  (swap! failures (constantly (state/output-counters:midje-failures))))

(defn finishing-top-level-fact [fact]
  (let [points (:points (meta fact))
        exercise (:exercise (meta fact))]
    (if (= (state/output-counters:midje-failures) @failures)
      (do (util/emit-one-line (format "%d points from exercise %d"
                                      points
                                      exercise))
          (swap! points-counter (partial + points)))
      (util/emit-one-line (format "no points from exercise %d" exercise)))))

(defn starting-fact-stream []
  (swap! points-counter (constantly 0)))

(defn finishing-fact-stream
  ([])
  ([_ _]
     (util/emit-one-line (format "%d points in total" @points-counter))))

(state/install-emission-map (assoc silence/emission-map
                              :finishing-top-level-fact finishing-top-level-fact
                              :starting-fact-stream starting-fact-stream
                              :finishing-fact-stream finishing-fact-stream))
