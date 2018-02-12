(ns clojurebase.Debug.test1)


(defn test
  [hello]
  (let [a hello]
    (println a)
    (println "bb")))

(test "world")