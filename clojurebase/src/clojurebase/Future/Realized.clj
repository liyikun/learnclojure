(ns clojurebase.Future.Realized)


(def my-future (future (Thread/sleep 5000)))

(repeatedly 6
            (fn []
              (println (realized? my-future))
              (Thread/sleep 1000)))