lexer grammar T2;

T:'Test';

WS      :   (' ' | '\t' | '\u000C' |'\r'|'\n') { $channel=HIDDEN;} ;