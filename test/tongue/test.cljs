(ns tongue.test
  (:require
    [tongue.test.core]
    [tongue.test.inst]
    [tongue.test.number]
    [cljs.test :as test :refer-macros [deftest is are testing]]))

(enable-console-print!)

(set! (.. js/process -env -TZ) "UTC")

(def *results
  (volatile! nil))

(defmethod test/report [:cljs.test/default :end-run-tests] [m]
  (vreset! *results (dissoc m :type)))

(test/run-all-tests #"tongue\.test\..*")

(js/process.exit (+ (:fail @*results) (:error @*results)))
