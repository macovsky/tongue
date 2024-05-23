(ns user
  (:require
    [duti.core :as duti]))

(duti/set-dirs "src" "dev" "test")

(def reload
  duti/reload)

(defn -main [& args]
  (duti/reload {:only #"tongue\..*"})
  (apply duti/-main args))

(defn test-all []
  (duti/test #"tongue\.test\..*"))

(defn -test-main [_]
  (duti/test-exit #"tongue\.test\..*"))
