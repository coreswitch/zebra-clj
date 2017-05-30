(defproject zebra-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [kovacnica/clojure.network.ip "0.1.1"]
                 [io.grpc/grpc-core "1.3.0"]
                 [io.grpc/grpc-netty "1.3.0" :exclusions [io.grpc/grpc-core]]
                 [io.grpc/grpc-protobuf "1.3.0"]
                 [io.grpc/grpc-stub "1.3.0"]
                 [org.clojure/data.json "0.2.6"]]
  :main ^:skip-aot zebra-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
