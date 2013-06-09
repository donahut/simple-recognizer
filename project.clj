(defproject simple-recognizer "1.0"
  :description "Simple Speech Recognizer for Tufts COMP 150 NLD"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [edu.cmu.sphinx/sphinx4 "1.0-beta6"]
                 [org.clojure/math.numeric-tower "0.0.1"]]
  :repositories [["nexus" {:url "http://repository.ow2.org/nexus/content/groups/public"}]
                 ["sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"}]]
  :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options"]
  :profiles {:dev {:plugins [[lein-midje "2.0.4"]]}}
  :main simple-recognizer.core)
