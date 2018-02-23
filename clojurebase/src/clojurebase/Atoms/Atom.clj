(ns clojurebase.Atoms.Atom)


(def atom-str (atom "hello"))

(def atom-vector (atom [1 2 3]))

(def atom-map (atom {:a "aa" :b "bb"}))

(def atom-int (atom 3))

(deref atom-int)

(do @atom-int)

