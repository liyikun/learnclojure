(ns clojurebase.Bindings.Let)

(let [l "light"]
  (println (str "God sait let there be" l)))

(let [l "light"
      d "darkness"]
  (println (str "God said let there be" l))
  (println (str "God also said let there be" d)))