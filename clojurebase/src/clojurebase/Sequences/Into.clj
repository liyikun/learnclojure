(ns clojurebase.Sequences.Into)


(into [1 2 3] (list 4 5 6))

(into (list) [1 2 3])


(into #{} [1 2 3])

(into [] #{1 2 3})

(into {} [[:a 1] [:b 2] [:c 3]])

(into {} [{:a 1} {:b 2}])