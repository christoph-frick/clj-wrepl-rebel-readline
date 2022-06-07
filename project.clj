(defproject net.ofnir/wrepl.rebel-readline "0.1.2-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.bhauman/rebel-readline "0.1.4"]
                 [integrant "0.8.0"]]
  :deploy-repositories {"releases" {:url "https://clojars.org/repo/" :creds :gpg}})
