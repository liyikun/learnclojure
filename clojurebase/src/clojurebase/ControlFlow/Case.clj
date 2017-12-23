(ns clojurebase.ControlFlow.Case)



(defn case-test-1
  [n]
  (case n
    1 "this is 1"
    2 "this is 2"
    "hello world"))

(println (case-test-1 1))
(println (case-test-1 2))
(println (case-test-1 3))