(ns repl
  (:require
    [nrepl.server :as nrepl-server]
    [cider.nrepl :refer [cider-nrepl-handler]]
    [rebel-readline.main :as rebel]
    [user :as user]))

(defn -main []
  (nrepl-server/start-server :port {{repl_port}} :handler cider-nrepl-handler)
  (rebel/-main)
  (System/exit 0))
