# ENGLISH SCRIPT

This is an experimental implementation of English as a programming language.
The main purpose of this language is to facilitate programming computers via Voice.
The grammar is not meant to be complete, but easily extendable.

To check out the current capabilities of this language have a look at the [TESTS](https://github.com/pannous/natural-english-script/tree/master/test/unit), at the [grammar](https://github.com/pannous/natural-english-script/blob/master/lib/english-script/english-parser.rb) and at the
[keywords](https://github.com/pannous/natural-english-script/blob/master/lib/english-script/english-tokens.rb)

**experiment** by typing  
`./english-script.sh "xs be 2,3,7,9; xs that are smaller than 7"`  
`./english-script.sh examples/test.e`

The Ruby on rails project is really just a wrapper for the core [submodule]
(https://github.com/pannous/natural-english-script/tree/master/lib/english-script)
It will be divided into two proper projects.

This language might soon be used in our successful beloved Jeannie assistant, which has over 3 million downloads so far:
http://www.voice-actions.com

Also check out this very cool similar project:
https://github.com/rzimmerman/kal

For a background story behind this project also read the [DOSSIER](https://github.com/pannous/natural-english-script/tree/master/DOSSIER)
