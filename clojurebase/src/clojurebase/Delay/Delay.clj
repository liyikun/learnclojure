(ns clojurebase.Delay.Delay)


;(def later (do [] (println "haha") (+ 1 2)))

(def later (delay (do [] (println "haha") (+ 1 2)) 3000))


(def my-delay (delay (println "did some work") 10000))

