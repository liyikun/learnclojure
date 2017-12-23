(ns clojurebase.ControlFlow.Condp)


(defn condp-test-2
  [n]
  (condp contains? n
    [1 2 3] "have 1 2 3"
    "no in 123"))

(println (condp-test-2 2))
(println (condp-test-2 3))
(println (condp-test-2 1))
(println (condp-test-2 10))

(contains? [1 2 3 4] 4)