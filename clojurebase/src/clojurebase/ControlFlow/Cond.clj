(ns clojurebase.ControlFlow.Cond)


(defn test-cond-1
  [n]
  (cond
    (= n 1) "n == 1"
    (and (> n 3) (< n 10)) "10> n >3"
    :else "n ??"))

(println (test-cond-1 1))
(println (test-cond-1 6))
(println (test-cond-1 -1))