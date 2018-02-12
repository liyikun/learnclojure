(ns clojurebase.Marco.Marco)

(defmacro unless [test then]
  "Evaluates then when test evaluates to be falsey"
  (list 'if (list 'not test)
        then))

(unless false (println "false!!"))

(def addtion-list (list + 1 2))

(eval (list 'def 'lucky-number (concat addtion-list [10])))

(eval 'lucky-number)


(macroexpand '(unless false (println "hi")))

(quote (+ 1 2))

'(+ 1 2)


`(+ 1 2)

'(dec (inc 1))

`(dec (inc 1))

'(+ 1 ~(inc 1))

`(+ 1 ~(inc 1))

(defmacro my-print-whoopsie
  [expression]
  (list 'let ['result expression]
        (list 'println 'result)
        'result))


;(defmacro code-critic
;  [bad good]
;  `(do (println "bad:"
;                (quote ~bad))
;       (println "good:"
;                (quote ~good))))

(defn criticize-code
  [criticism code]
  `(println ~criticism (quote ~code)))

(defmacro code-critic
  "docstring"
  [bad good]
  `(do ~@(map #(apply criticize-code %)
             [["bad:" bad]
              ["good:" good]])))

(code-critic (1 + 1) (+ 1 1))

(macroexpand `(code-critic (1 + 1) (+ 1 1)))



(defmacro without-mischief
  [& stuff-to-do]
  (let [macro-message (gensym 'message)]
    `(let [~macro-message "Oh, big deal!"]
       ~@stuff-to-do
       (println "I still need to say: " ~macro-message))))

(def message "hah")
(without-mischief
  (println "Here's how I feel about that thing you did: " message))

`(+ ~(list 1 2 3))

`(+ ~@(list 1 2 3))

(gensym 'aefe)

(when (= 1 1)
  (let [a "aaa"]
    (println "aa" a)))