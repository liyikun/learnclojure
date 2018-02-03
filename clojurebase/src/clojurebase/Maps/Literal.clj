(ns clojurebase.Maps.Literal)


(def a {"aa" "bb" "cc" "dd"})


(get a "aa")

(get a "dd")


(:apple {:apple "mac" :ms  "windows"})


(assoc {"aa", "bb"} "cc" "dd")

(merge {:apple "mac" :ms "windows"} {:1 2})

(keys a)

(vals a)