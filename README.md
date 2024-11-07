adaptation of [tonsky/tongue](https://github.com/macovsky/tongue) for vector translation keys:

- nested maps _won't be unpacked_ into namespaced keys in dicts (they will stay as is)
- map keys can be any arbitrary clojure data as in regular maps
- translation keys must be vectors (as for `get-in`)
- aliases must have `^:alias` or `^:->` meta and be vector paths as well
- there's additional `build-lookup` fn to get original template without interpolation
