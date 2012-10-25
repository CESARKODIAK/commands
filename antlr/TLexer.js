// $ANTLR 3.4 T.g 2012-02-11 21:17:22

var TLexer = function(input, state) {
// alternate constructor @todo
// public TLexer(CharStream input)
// public TLexer(CharStream input, RecognizerSharedState state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    TLexer.superclass.constructor.call(this, input, state);

};

org.antlr.lang.augmentObject(TLexer, {
    : ,
    : 
});

(function(){
var HIDDEN = org.antlr.runtime.Token.HIDDEN_CHANNEL,
    EOF = org.antlr.runtime.Token.EOF;
org.antlr.lang.extend(TLexer, org.antlr.runtime.Lexer, {
     : ,
     : ,
    getGrammarFileName: function() { return "T.g"; }
});
org.antlr.lang.augmentObject(TLexer.prototype, {
    // $ANTLR start T
    mT: function()  {
        try {
            var _type = this.T;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // T.g:7:2: ( 'Test' )
            // T.g:7:3: 'Test'




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T",

    mTokens: function() {
        // T.g:1:8: ( T )
        // T.g:1:10: T





    }

}, true); // important to pass true to overwrite default implementations

 
})();