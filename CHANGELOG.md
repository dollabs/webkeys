# Change Log

All notable changes to this project will be documented in this file. This change log follows the conventions of [keepachangelog.com](http://keepachangelog.com/).

### [Unreleased]

Changed
- Updated dependencies
- Update CLJS REPL support

### [0.4.1] - 2016-12-01

Changed
- Removed cider references from build.boot
- Updated dependencies

### [0.4.0] - 2016-11-11

Changed
* Update dependencies
* Add gh-pages and API docs
* Moving keygen.cljc to the future/ directory as the
    key-translation table has been edited manually.
* Remove testing for now (as it's not functional).
* Updated signature for key-fn's to be [key id e] where:
  - key is the transformed key
  - id is the keyword of the DOM element id
  - e is the event
* Disabled META_KEY (problematic on Mac OS X)


### [0.2.0] - 2016-04-12

Changed
* Initial publication on github

### 0.1.0

Added
*  Initial version

[0.2.0]: https://github.com/dollabs/webkeys/compare/0.1.0...0.2.0
[0.4.0]: https://github.com/dollabs/webkeys/compare/0.2.0...0.4.0
[0.4.1]: https://github.com/dollabs/webkeys/compare/0.4.0...0.4.1
[Unreleased]: https://github.com/dollabs/webkeys/compare/0.4.1...HEAD
