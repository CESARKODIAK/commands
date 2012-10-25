// $ANTLR 3.4 T.g 2012-02-11 21:17:22

var TParser = function(input, state) {
    if (!state) {
        state = new org.antlr.runtime.RecognizerSharedState();
    }

    (function(){
    }).call(this);

    TParser.superclass.constructor.call(this, input, state);



    /* @todo only create adaptor if output=AST */
    this.adaptor = new org.antlr.runtime.tree.CommonTreeAdaptor();

};

org.antlr.lang.augmentObject(TParser, {
    : ,
    : 
});

(function(){
// public class variables
var = ,
    = ;

// public instance methods/vars
org.antlr.lang.extend(TParser, org.antlr.runtime.Parser, {

    getTokenNames: function() { return TParser.tokenNames; },
    getGrammarFileName: function() { return "T.g"; }
});
org.antlr.lang.augmentObject(TParser.prototype, {


    // T.g:6:1: t : T ;
    // $ANTLR start "t"
    t: function() {
        try {
            // T.g:6:2: ( T )
            // T.g:6:3: T




        }
        catch (re) {
            if (re instanceof org.antlr.runtime.RecognitionException) {
                this.reportError(re);
                this.recover(this.input,re);
            } else {
                throw re;
            }
        }

        finally {
        }
        return 
    ;
    }

    // Delegated rules




}, true); // important to pass true to overwrite default implementations

 

// public class variables
org.antlr.lang.augmentObject(TParser, {
    tokenNames: ["<invalid>", "<EOR>", "<DOWN>", "<UP>", "T"],

});

})();