(defproject capstone "0.1.0-SNAPSHOT"
  :description "Clojure bindings for the capstone disassembly framework."
  :url "http://www.github.com/aamedina/capstone"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [net.java.dev.jna/jna "4.1.0"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :source-paths ["src/main/clojure"]
  :java-source-paths ["src/main/java" "src/test/java"]
  :test-paths ["src/test/clojure"])
