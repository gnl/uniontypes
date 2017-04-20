(defproject gnl/uniontypes "0.1.1-SNAPSHOT"
  :description "Union Types (ADTs) based on clojure.spec"
  :url "http://github.com/lambdaisland/uniontypes"
  :license {:name "Mozilla Public License 2.0"
            :url "https://www.mozilla.org/en-US/MPL/2.0/"}

  :dependencies [[org.clojure/clojure "1.9.0-alpha12"]
                 [org.clojure/clojurescript "1.9.229" :scope "provided"]]

  :doo {:build "test"}

  :clean-targets ^{:protect false} [:target-path :compile-path "resources/public/js/compiled"]

  :plugins [[lein-cljsbuild "1.1.4"]
            [lein-doo "0.1.6"]]

  :cljsbuild {:builds
              {:test
               {:source-paths ["src" "test"]
                :compiler
                {:output-to "resources/public/js/compiled/testable.js"
                 :output-dir "resources/public/js/compiled/out"
                 :main lambdaisland.uniontypes.test-runner
                 :optimizations :none}}}}

  :profiles {:dev {:dependencies [[org.clojure/test.check "0.9.0"]]}})
