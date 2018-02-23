(ns clojurebase.Refs.Dosync)

(def my-ref (ref 0))

(dosync
  (ref-set my-ref 1)
  (ref-set my-ref 2))

(deref my-ref)

(ref-set my-ref 3)
