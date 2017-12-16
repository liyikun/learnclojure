(ns clojurebase.Functions.Defn)


(defn sayHello
  [name]
  (println (str "hello " name)))


(sayHello "lyk")

(defn say-Hello
  "this is sayhell"
  [name]
  (sayHello name))

(say-Hello "lyk")
