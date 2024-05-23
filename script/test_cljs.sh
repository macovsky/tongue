#!/bin/bash
set -o errexit -o nounset -o pipefail
cd "`dirname $0`/.."

clojure -M:cljs --main cljs.main --target node --output-to out/main.js --compile tongue.test
node out/main.js
