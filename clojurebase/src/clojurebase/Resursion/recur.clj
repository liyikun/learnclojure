(ns clojurebase.Resursion.recur)

(defn fibo-recursive [n]
  (if (or (= n 0) (= n 1))
    n
    (+ (fibo-recursive (- n 1)) (fibo-recursive (- n 2)))))

(fibo-recursive 0)


(defn fibo-recur [iteration]
  (let [fibo (fn [one two n]
               (if (= iteration n)
                 one
                 (recur two (+ one two) (inc n))))]
    (fibo 0 1 0)))


(defn count-down [result n]
  (if (= n 0)
    result
    (recur (conj result n) (dec n))))

(count-down [] 5)




