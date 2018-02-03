(ns clojurebase.Integers.Calculate)


(+ 10 3)

(- 5 3)


(* 10 2)

(/ 4 3)

(/ 4 2)


(mod 3 2)

(max 1 2 3 4 5 6)

(min 1 2 3 4 5)

(repeat 2 3)

(defn power [x n]
  (reduce * (repeat n x)))

(power 2 4)

(+ (bigint Long/MAX_VALUE) 10)