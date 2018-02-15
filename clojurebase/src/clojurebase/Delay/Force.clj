(ns clojurebase.Delay.Force)

(def later (delay (do [] (prn "Adding") (+ 1 2))))

(force later)