(ns clojurebase.Atoms.Reset!)

(def atom-reset (atom 53))

(do @atom-reset)

(reset! atom-reset 30)