// $ANTLR 3.4 T.g 2012-02-11 21:48:40

import org.antlr.runtime._

object TParser {
    val tokenNames = Array(
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "T"
    )


    val EOF = -1
    val T = 4

 

    val FOLLOW_T_in_t23 = new BitSet(Array[Long](0x0000000000000002L))

}

class TParser(input: TokenStream, state: RecognizerSharedState) extends Parser(input, state) {
    import TParser._
    // delegates
    // delegators


    def this(input: TokenStream) =
        this(input, new RecognizerSharedState())


    override def getTokenNames: Array[String] = tokenNames
    override def getGrammarFileName = "T.g"



    // $ANTLR start "t"
    // T.g:8:1: t : T ;
    @throws(classOf[RecognitionException])
    final def t(): 
    Unit
     = {
        try {
            // T.g:8:2: ( T )
            // T.g:8:3: T
            {
            `match`(input,T,FOLLOW_T_in_t23)


            }

        }
        catch {
            case re: RecognitionException =>
            reportError(re)
            recover(input,re)
        }

        finally {
        }
        return 
    }
    // $ANTLR end "t"

    // Delegated rules


}