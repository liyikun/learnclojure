(ns clojurebase.Future.Deref)


(let [future-value (future (inc 1))]
  (println future-value))


(let [future-value (future (inc 1))]
  (println (deref future-value)))

(let [future-value (future (inc 1))]
  (println @future-value))

@(future (Thread/sleep 3000) "returned!")

(deref (future (Thread/sleep 4000) "returned hello world"))

(let [sleep-and-wait
      (map (fn [time]
             (future
               (Thread/sleep time)
               (println (str "slept" time "sec"))))
           [2000 1000])]
  (doall (map deref sleep-and-wait))
  (println "done"))