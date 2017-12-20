(ns clojurebase.Namespaces.Use)

;(use 'clojurebase.by.example)
(use ‘[clojurebase.by.example :only (favorite-language)])
(favorite-language)