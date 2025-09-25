(ns user
  #_:clj-kondo/ignore
  (:require
    [clojure.java.io :as io]
    [clojure.tools.namespace.repl :as ns-repl]
    [clojure.repl :refer [dir doc]]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; file watcher

(def dirs (.list (io/file "src/{{project}}")))

(apply ns-repl/set-refresh-dirs dirs)

(defn r [] (ns-repl/refresh))
(def reload r)

(def ORANGE "\033[0;33m")
(def PURPLE "\033[0;35m")
(def NC     "\033[0m")

(defn print-init-msg []
  (println (format "REPL started at %slocalhost%s:%s{{repl_port}}%s"
                   PURPLE NC ORANGE NC)))
