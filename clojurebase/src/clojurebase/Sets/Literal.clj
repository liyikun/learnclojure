(ns clojurebase.Sets.Literal)

#{1 2 3}

#{1 2 3 3}

(conj #{1 2 3} 4)

(conj (conj #{1 2 3} 4) 4)

(disj #{1 2 3} 4)

(disj #{1 2 3} 2)

(sort #{1 2 3})

(sort (conj #{1 2 3} 4))

(contains? #{1 2 3} 1)

(clojure.set/subset? #{1 2} #{1 2 3 4})

(clojure.set/superset? #{1 2 3 4} #{1 2})