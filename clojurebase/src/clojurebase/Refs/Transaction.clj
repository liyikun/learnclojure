(ns clojurebase.Refs.Transaction)

(def user (ref {}))

(dosync
  (alter user merge {:name "Kim"})
  (throw (Exception. "something wrong happens!"))
  (alter user merge {:age 32}))

(deref user)

(def user-record (atom {}))

(do
  (swap! user-record merge {:name "Kim"})
  (throw (Exception. "something wrong happens!"))
  (swap! user-record merge {:age 32}))

(deref user-record)
