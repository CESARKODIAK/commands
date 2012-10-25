// $ANTLR 3.4 T.g 2012-02-11 21:30:20

import org.antlr.runtime._

object TLexer {
    val EOF = -1
    val T = 4

 
}

class TLexer(input: CharStream, state: RecognizerSharedState) extends Lexer(input, state) {
    import TLexer._

    // delegates
    // delegators


    def this(input: CharStream) =
        this(input, new RecognizerSharedState())


    override def getGrammarFileName = "T.g"

    // $ANTLR start "T"
    @throws(classOf[RecognitionException])
    final def mT(): Unit = {
        try {
            var _type = T
            var _channel = BaseRecognizer.DEFAULT_TOKEN_CHANNEL
            try // T.g:9:2: ( 'Test' )
    // T.g:9:3: 'Test'
    {
    `match`("Test")




    }

            state.`type` = _type
            state.channel = _channel
        }
        finally {
        }
    }
    // $ANTLR end "T"

    @throws(classOf[RecognitionException])
    def mTokens(): Unit = {
        // T.g:1:8: ( T )
        // T.g:1:10: T
        {
        mT()


        }


    }

}