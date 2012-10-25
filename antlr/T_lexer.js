// $ANTLR 3.4 T_lexer.g 2012-02-11 21:22:12

var T_lexer = function(input, state) {
// alternate constructor @todo
// public T_lexer(CharStream input)
// public T_lexer(CharStream input, RecognizerSharedState state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    T_lexer.superclass.constructor.call(this, input, state);

};

org.antlr.lang.augmentObject(T_lexer, {
    : ,
    : 
});

(function(){
var HIDDEN = org.antlr.runtime.Token.HIDDEN_CHANNEL,
    EOF = org.antlr.runtime.Token.EOF;
org.antlr.lang.extend(T_lexer, org.antlr.runtime.Lexer, {
     : ,
     : ,
    getGrammarFileName: function() { return "T_lexer.g"; }
});
org.antlr.lang.augmentObject(T_lexer.prototype, {
    // $ANTLR start T
    mT: function()  {
        try {
            var _type = this.T;
            var _channel = org.antlr.runtime.BaseRecognizer.DEFAULT_TOKEN_CHANNEL;
            // T_lexer.g:7:2: ( 'Test' )
            // T_lexer.g:7:3: 'Test'




            this.state.type = _type;
            this.state.channel = _channel;
        }
        finally {
        }
    },
    // $ANTLR end "T",

    mTokens: function() {
        // T_lexer.g:1:8: ( T )
        // T_lexer.g:1:10: T





    }

}, true); // important to pass true to overwrite default implementations

 
})();