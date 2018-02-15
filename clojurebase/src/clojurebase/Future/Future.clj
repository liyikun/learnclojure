(ns clojurebase.Future.Future)


(do
  (Thread/sleep 3000)
  (println "hello"))

(do
  (future
    (Thread/sleep 3000)
    (println "hello1"))
  (println "end"))

