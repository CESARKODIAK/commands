#  java org.antlr.Tool -traceParser  -verbose   -debug  Exp.g |m
# javac ANTLRDemo.java 
# java ANTLRDemo $@
 

java org.antlr.Tool -traceParser  -verbose   -debug  TJ.g |more
javac TJParser.java
echo "XText fee $@" | java TJParser "XText fee $@"

