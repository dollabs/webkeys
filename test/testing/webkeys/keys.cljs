;; Copyright © 2016 Dynamic Object Language Labs Inc.
;;
;; This software is licensed under the terms of the
;; Apache License, Version 2.0 which can be found in
;; the file LICENSE at the root of this distribution.

(ns testing.webkeys.keys
  (:require [clojure.string :as string]
            [cljs.test :as test :refer-macros [deftest testing is]]
            [webkeys.keys :as keys]))

(deftest test-keys
  (testing "test keys"
    (is (= 16 keys/SHIFT_KEY))))
