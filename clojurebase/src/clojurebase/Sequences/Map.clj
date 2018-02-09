(ns clojurebase.Sequences.Map)

(map inc [1 2 3])

(map (fn [x] (inc (val x))) {:a 1 :b 2 :c 3})

(map val {:a 1 :b 2 :c  3})

(map-indexed (fn [index item] (println index "" item)) [1 2 3 4 5])