(ns clojurebase.Resursion.loop)


(defn count-up [max]
  (loop [count 0]
    (if (= count max)
      (println "Done!")
      (do
        (println (str "Counting"))
        (recur (inc count))))))

(count-up 5)