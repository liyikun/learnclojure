(ns clojurebase.Refs.Alter)

(def my-ref (ref 0))

(dosync
  (alter my-ref (fn [current_ref]
                  (inc current_ref))))


(dosync
  (alter my-ref
         (fn [_] "not int")))

(def my-ref (ref 100))

(defn multiple-by
  [current-ref num]
  (* current-ref num))

(dosync
  (alter my-ref multiple-by 10))