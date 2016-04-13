;; Copyright © 2016 Dynamic Object Language Labs Inc.
;;
;; This software is licensed under the terms of the
;; Apache License, Version 2.0 which can be found in
;; the file LICENSE at the root of this distribution.

(ns webkeys.keygen
  "Generate key-translation for webkeys"
  (:require [webkeys.keys :as keys
             :refer [SHIFT_OFFSET CTRL_OFFSET ALT_OFFSET META_OFFSET]]))

(defn gen-key-translation []
  (let [kt (atom (sorted-map-by <))
        add-c-s {8 "Backspace"
                 9 "Tab"
                 12 "Clear"
                 13 "Enter"
                 19 "Pause"
                 27 "Escape"
                 32 " "
                 33 "PageUp"
                 34 "PageDown"
                 35 "End"
                 36 "Home"
                 37 "ArrowLeft"
                 38 "ArrowUp"
                 39 "ArrowRight"
                 40 "ArrowDown"
                 42 "PrintScreen"
                 45 "Insert"
                 46 "Delete"
                 91 "Windows"
                 112 "F1"
                 113 "F2"
                 114 "F3"
                 115 "F4"
                 116 "F5"
                 117 "F6"
                 118 "F7"
                 119 "F8"
                 120 "F9"
                 121 "F10"
                 122 "F11"
                 123 "F12"}
        add-c {59 ";" ;; firefox
               61 "=" ;; firefox (and chrome?)
               173 "-" ;; firefox
               186 ";" ;; chrome
               188 ","
               189 "-" ;; chrome
               190 "."
               191 "/"
               192 "`"
               219 "["
               220 "\\"
               221 "]"
               222 "'"
               304 ")" ;; firefox
               305 "!"
               306 "@"
               307 "#"
               308 "$"
               309 "%"
               310 "^"
               311 "&"
               312 "*"
               313 "("
               314 ")" ;; chrome
               315 ":" ;; firefox
               317 "+" ;; firefox (and chrome?)
               429 "_" ;; firefox
               442 ":"
               444 "<"
               445 "_" ;; chrome
               446 ">"
               447 "?"
               448 "~"
               475 "{"
               476 "|"
               477 "}"
               478 "\""}]
    ;; add A-C-S
    (doseq [[k v] add-c-s]
      (swap! kt assoc
        k v
        (+ k SHIFT_OFFSET) (str "S-" v)
        (+ k CTRL_OFFSET) (str "C-" v)
        (+ k CTRL_OFFSET SHIFT_OFFSET) (str "C-S-" v)
        (+ k ALT_OFFSET) (str "A-" v)
        (+ k ALT_OFFSET SHIFT_OFFSET) (str "A-S-" v)
        (+ k ALT_OFFSET CTRL_OFFSET) (str "A-C-" v)
        (+ k ALT_OFFSET CTRL_OFFSET SHIFT_OFFSET) (str "A-C-S-" v)
        ))
    ;; ;; add A-C
    (doseq [[k v] add-c]
      (swap! kt assoc
        k v
        (+ k CTRL_OFFSET) (str "C-" v)
        (+ k ALT_OFFSET) (str "A-" v)
        (+ k ALT_OFFSET CTRL_OFFSET) (str "A-C-" v)
        ))
    ;; digits add A-C
    (doseq [c (range 10)]
      (swap! kt assoc
        (+ c 48) (str (char (+ c 48)))
        (+ c 48 CTRL_OFFSET) (str "C-" (char (+ c 48)))
        (+ c 48 ALT_OFFSET) (str "A-" (char (+ c 48)))
        (+ c 48 ALT_OFFSET CTRL_OFFSET) (str "A-C-" (char (+ c 48)))
        ))
    ;; letters - add A-C-S
    (doseq [c (range 26)]
      (let [upper (str (char (+ c 65)))
            lower (str (char (+ c 97)))]
        (swap! kt assoc
          (+ c 65) lower
          (+ c 65 SHIFT_OFFSET) upper
          (+ c 65 CTRL_OFFSET) (str "C-" lower)
          (+ c 65 CTRL_OFFSET SHIFT_OFFSET) (str "C-" upper)
          (+ c 65 ALT_OFFSET) (str "A-" lower)
          (+ c 65 ALT_OFFSET SHIFT_OFFSET) (str "A-" upper)
          (+ c 65 ALT_OFFSET CTRL_OFFSET) (str "A-C-" lower)
          (+ c 65 ALT_OFFSET CTRL_OFFSET SHIFT_OFFSET) (str "A-C-" upper)
          )))
    @kt))
