(defproject cljminders "0.1.0-SNAPSHOT"
  :description "Clojure app to keep track of reminders"
  :url "TODO put github here"
  :license {:name "GNU GENERAL PUBLIC LICENSE v2"
            :url "https://www.gnu.org/licenses/gpl-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.8.0"] [korma "0.4.3"], [org.xerial/sqlite-jdbc "3.7.15-M1"]]
  :main ^:skip-aot cljminders.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
