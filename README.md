# clj-wrepl-rebel-readline

`read` implementiation for [clj-wrepl](https://github.com/christoph-frick/clj-wrepl) using [rebel-readline](https://github.com/bhauman/rebel-readline)

## Setup

Add in your *wrepl* config (from `rebel-readline` will be passed):

```clojure
{:wrepl/prompt #ig/ref :wrepl.rebel-readline/prompt
 :wrepl/read #ig/ref :wrepl.rebel-readline/read
 :wrepl.rebel-readline/prompt {}
 :wrepl.rebel-readline/read {:indent false}}
```
