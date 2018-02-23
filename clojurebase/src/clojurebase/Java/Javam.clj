(ns clojurebase.Java.Javam)

(new java.util.Date)

(java.util.Date.)

(let [current-date (new java.util.Date)]
  (println current-date))

(Math/pow 2 3)

(let [current_date (new java.util.Date)]
  (.toString current_date))

(let [current_date (new java.util.Date)]
  (. current_date toString))

(let [date1 (new java.util.Date)
      data2 (new java.util.Date)]
  (.equals date1 data2))


