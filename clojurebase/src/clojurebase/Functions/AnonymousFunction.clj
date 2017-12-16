(ns clojurebase.Functions.AnonymousFunction)


(fn [] (println "hello world"))


(def hello-world (fn [] (println "hello world")))

(hello-world)


#(+ 1 1)

(fn [] (+ 1 1))

#(+ 1 %)

(let [plus #(+ 1 %)]
  (plus 2))

(let [plus-numbers #(+ 1 %1 %2 %3)]
  (plus-numbers 2 4 6))


(def say-hello (fn [name] (println (str "Hello, " name))))
(def say-bye (fn [name] (println (str "Good bye, " name))))
(def greeting (fn [greeting-func name] (greeting-func name)))

(say-hello "li")
(say-bye "li")
(greeting say-bye "oo")