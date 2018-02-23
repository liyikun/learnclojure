(ns clojurebase.Atoms.threadsafe)

(def x 0)

(repeatedly 10
            (fn []
              (def x (inc x))))

(do x)

(repeatedly 10
            (fn []
              (future (def x (inc x)))))

(def x (atom 0))

(repeatedly 10
            (fn []
              (future (swap! x inc))))

(deref x)
