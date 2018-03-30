# clj-wrepl-rebel-readline

`read` implementiation for [clj-wrepl](https://github.com/christoph-frick/clj-wrepl) using [rebel-readline](https://github.com/bhauman/rebel-readline)

## Setup

Add in your *wrepl* config (from `rebel-readline` will be passed):

```clojure
{:wrepl/repl #ig/ref :wrepl.rebel-readline/repl 
 :wrepl.rebel-readline/repl {:key-map :viins
                             :key-bindings {:viins [["^M" :clojure-force-accept-line]]}}}
```
