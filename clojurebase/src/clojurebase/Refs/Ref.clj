(ns clojurebase.Refs.Ref)

(def my-ref (ref 0))

(deref my-ref)

(do @my-ref)
