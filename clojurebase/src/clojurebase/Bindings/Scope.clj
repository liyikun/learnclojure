(ns clojurebase.Bindings.Scope)


(let [aa "aa"]
  (println aa))

(let [aa "aa"]
  (let [aa "bb"]
    (println aa)))

(let [aa "aaa"]
  (let [aa "bbb"]
    (println aa))
  (println aa))

(let [aa "aaa"]
  (let []
    (println aa)))
