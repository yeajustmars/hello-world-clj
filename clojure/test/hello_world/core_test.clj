(ns hello-world.core-test
  (:require [clojure.test :as t :refer [deftest is testing]]
            [hello-world.core :as core]))

(deftest greet-boilermaker
  (testing "hello-world.core/greet-boilermaker"
    (let [expected "Hello, Boilermaker!"]
      (is (= expected (core/greet-boilermaker))))))

(deftest greet
  (testing "hello-world.core/greet"
    (let [expected "Hello, world!"]
      (is (= expected (core/greet "World"))))))
