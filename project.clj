(defproject practice-leiningen "0.1.0-SNAPSHOT"
  :description "For practicing Leiningen"
  :url "https://github.com/ags799/practice-leiningen"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot practice-leiningen.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
