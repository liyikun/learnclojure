(ns clojurebase.Promise.Promise)

(def my-promise (promise))

(def listen-and-callback (fn []
                            (println "start listen...")
                            (future (println "callback fired:" @my-promise)
                                    (println "callback 2" @my-promise))))

(defn do-time-consuming-job []
  (Thread/sleep 5000)
  (deliver my-promise "delivered value"))

(listen-and-callback) (do-time-consuming-job)

(deliver my-promise "hahs")

(do @my-promise)