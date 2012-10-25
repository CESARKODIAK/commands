#  java org.antlr.Tool -traceParser  -verbose   -debug  Exp.g |m
alias antlr="java org.antlr.Tool"
export CLASSPATH=/Users/pannous/dev/resources/antlr-3.4/antlr-3.4-complete.jar
java org.antlr.Tool Escript.g
javac -nowarn -Xmaxerrs 4 EscriptParser.java
echo "$@" | java EscriptParser
# java org.antlr.Tool Exp.g
# javac ExpLexer.java 
# javac ExpParser.java 
# echo java ExpParser x=7;
# java ExpParser "$@"
# javac ANTLRDemo.java 
# java ANTLRDemo $@
 

