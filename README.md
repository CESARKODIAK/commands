# ENGLISH SCRIPT

This is English as a programming language.
The main purpose of this language is to facilitate programming computers via Voice.
The grammar is not meant to be linguistically complete, but [functionality complete](https://en.wikipedia.org/wiki/Functional_completeness) and easily extendable.

Examples
--------
Here are some of our favorite examples from the tests, **working today**:                      

`assert "first item in 'hi','you' is equal to 'hi'"`

`assert "3rd word in 'hi my friend !!!' is 'friend'"`

`assert "square of 1,2 and 3 == 1,4,9"`

`assert "add one to every odd number in 1,2,3 == 2,2,4"`

`parse "beep every three seconds"`

`parse "counter is zero; repeat three times: add 1 to counter; okay; assert that the counter is 3"`


```
While Peter is online on Skype
	make a beep
	sleep for 10 seconds
Done
```

```
How to check if someone is online on Skype
	Call java Skype.checkStaus(someone)
	Return yes If Result equals "online"
	Return no otherwise
Done
```

Language Specification
----------------------
Read the [DOSSIER](https://github.com/pannous/natural-english-script/tree/master/DOSSIER.md) for a more complete **language specification**, vision and some background.

To check out the current capabilities of this language have a look at the [TESTS](https://github.com/pannous/natural-english-script/tree/master/test/unit), at the [grammar](https://github.com/pannous/natural-english-script/blob/master/lib/english-script/english-parser.rb) and at the
[keywords](https://github.com/pannous/natural-english-script/blob/master/lib/english-script/english-tokens.rb)

EXPERIMENT
----------
Run it and see yourself!
`./install.sh`	
	
**experiment** by typing  
`./english-script.sh "xs be 2,3,7,9; xs that are smaller than 7"`  
`./english-script.sh examples/test.e`

The Ruby on rails project is really just a wrapper for the core [submodule]
(https://github.com/pannous/natural-english-script/tree/master/lib/english-script)
It will be divided into two proper projects.

This language might soon be used in our successful beloved Jeannie assistant, which has over 3 million downloads so far:
http://www.voice-actions.com

Also check out cool similar projects:
https://github.com/rzimmerman/kal
https://github.com/remixz/dogescript

For a background story behind this project also read the [DOSSIER](https://github.com/pannous/natural-english-script/tree/master/DOSSIER.md)

roadmap
-------

Package as a gem or similar.

Use [AST](https://en.wikipedia.org/wiki/Abstract_syntax_tree) not only for on-the-fly interpretation,
 but also for **compilation** to JVM byte code, or even native code!

First step: as an extension for JRuby.
Second step: as a standalone Java jar.
Third step: as native code.

So far this language runs in the Ruby runtime environment (without any Java). It would be nice if we could keep it this way, even if compiling to Java byte code will become optionally possible.
