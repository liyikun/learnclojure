(ns clojurebase.Sequences.Cons)

(cons 0 '(1 2))

(def old-seq '(1 2))

(def new-seq (cons 0 old-seq))

(println old-seq)

(println new-seq)

