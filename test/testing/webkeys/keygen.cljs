;; Copyright © 2016 Dynamic Object Language Labs Inc.
;;
;; This software is licensed under the terms of the
;; Apache License, Version 2.0 which can be found in
;; the file LICENSE at the root of this distribution.

(ns testing.webkeys.keygen
  (:require [clojure.string :as string]
            [cljs.test :as test :refer-macros [deftest testing is]]
            [webkeys.keys :as keys]
            [webkeys.keygen :as keygen]))

(deftest test-keygen
  (testing "test keygen"
    (is (= keys/key-translation (keygen/gen-key-translation)))))
