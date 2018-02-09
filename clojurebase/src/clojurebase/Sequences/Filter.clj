(ns clojurebase.Sequences.Filter)


(filter pos? [-1 2 3])

(filter (fn [v] (= v 2)) [-1 2 3 4 5])