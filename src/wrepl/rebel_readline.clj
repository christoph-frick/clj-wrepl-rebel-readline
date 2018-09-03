(ns wrepl.rebel-readline
  (:require [integrant.core :as ig]
            [clojure.main]
            [rebel-readline.core]
            [rebel-readline.clojure.main]
            [rebel-readline.clojure.line-reader]
            [rebel-readline.clojure.service.local]))


(defmethod ig/init-key :wrepl.rebel-readline/repl
  [_ options]
  (fn [& args]
    (rebel-readline.core/with-readline-in
      (rebel-readline.clojure.line-reader/create
        (rebel-readline.clojure.service.local/create options))
      (apply clojure.main/repl
             (into [] cat 
                   (assoc (apply hash-map args)
                          :prompt (fn [])))))))


(defmethod ig/init-key :wrepl.rebel-readline/prompt
  [_ options]
  rebel-readline.clojure.line-reader/default-prompt-fn)
