(ns clojurebase.Sequences.Reduce)

(reduce + [2 3 4 5])


(reduce inc [1 2 3 4])

(reduce + -10 [1 2 3 4])

(reduce (fn [res val] (+ res val)) [1 2 3 4])