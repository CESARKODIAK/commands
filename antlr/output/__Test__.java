import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        EscriptLexer lex = new EscriptLexer(new ANTLRFileStream("/Users/pannous/nlp/english-script/grammar/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        EscriptParser g = new EscriptParser(tokens, 49100, null);
        try {
            g.parse();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}