(ns wrepl.rebel-readline.read
  (:require [integrant.core :as ig]
            [rebel-readline.core]
            [rebel-readline.service.impl.local-clojure-service]))


(defmethod ig/init-key :wrepl.rebel-readline/prompt
  [_ options]
  (fn []))


(defmethod ig/init-key :wrepl.rebel-readline/read
  [_ options]
  (rebel-readline.core/clj-repl-read
   (rebel-readline.core/line-reader
    (rebel-readline.service.impl.local-clojure-service/create options))))
