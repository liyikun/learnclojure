(ns clojurebase.Marco.Threading-Marcos)


(conj (conj (conj [] 1) 2) 3)

(-> []
    (conj 1)
    (conj 2)
    (conj 3))

(->> ["jp","cn","us"]
     (map clojure.string/upper-case)
     (map #(str "Hello " %)))