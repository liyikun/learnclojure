(ns clojurebase.ControlFlow.when-let)

(when-let [pos-nums (filter pos? [ -1 -2 1 2])]
  pos-nums
  (println "one")
  (println pos-nums))


(when-let [pos-nums nil]
  pos-nums
  (println "one")
  (println pos-nums))