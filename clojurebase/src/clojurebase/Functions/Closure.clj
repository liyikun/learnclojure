(ns clojurebase.Functions.Closure)


(defn inner
  [name]
  (fn [] (println name)))

(def outer1 (inner "hello"))

(outer1)