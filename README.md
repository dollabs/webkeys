# webkeys

Cross browser key event mangement in ClojureScript

As this is a pre-release version **webkeys** has not been
published to [Clojars](https://clojars.org/). You can still clone it and install
it locally.

Check out the [CHANGELOG](CHANGELOG.md)

The motivation for **webkeys** is to implement a cross browser
approach to keyboard events that provides simple string based
keybindings (including chording meta keys). This might not be
necessary if [KeyboardEvent.key](https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/key) was handled consistently by browsers.

## Documentation

The **webkeys** library was developed to support the [PAMELA](https://github.com/dollabs/pamela) suite of tools.

See the [API docs](http://dollabs.github.io/webkeys/doc/api/)

## Building

The **webkeys** library uses [boot](http://boot-clj.com/) as a build tool.

Check [here for more information on setting up boot](https://github.com/dollabs/plan-schema#building).

You can install **webkeys** locally with `boot local`.

You can get help for all available boot tasks with `boot -h`.

## Usage

*TBD*


## Development status and Contributing

Please see [CONTRIBUTING](CONTRIBUTING.md) for details on
how to make a contribution.

*NOTE* The tests are (obviously) incomplete!

## Copyright and license

Copyright © 2016 Dynamic Object Language Labs Inc.

Licensed under the [Apache License 2.0](http://opensource.org/licenses/Apache-2.0) [LICENSE](LICENSE)

## Acknowledgement and Disclaimer

This work was supported by Contract FA8650-11-C-7191 with the US
Defense Advanced Research Projects Agency (DARPA) and the Air Force
Research Laboratory.  The views expressed are those of the authors and
do not reflect the official policy or position of the Department of
Defense or the U.S. Government.
