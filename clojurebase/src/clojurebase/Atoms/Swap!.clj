(ns clojurebase.Atoms.Swap!)


(def atom-int (atom 10))

(swap! atom-int (fn [current-int]
                  (inc current-int)))

(def atom-num (atom 1000))

(defn multiple-number [current-num num]
  (* current-num num))

(swap! atom-num multiple-number 10)