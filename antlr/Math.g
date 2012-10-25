grammar Math;
/*https://wincent.com/wiki/ANTLR_lexers_in_depth*/
/*http://www.antlr.org/wiki/display/ANTLR3/How+to+remove+global+backtracking+from+your+grammar */
eval returns [double value]	
    :    exp=additionExp {$value = $exp.value;}
    ;
// EOF ?


additionExp returns [double value]
    :    m1=multiplyExp       {$value =  $m1.value;} 
         ( '+' m2=multiplyExp {$value += $m2.value;} 
         | '-' m2=multiplyExp {$value -= $m2.value;}
         )* 
    ;

multiplyExp returns [double value]
    :    a1=atomExp       {$value =  $a1.value;}
         ( '*' a2=atomExp {$value *= $a2.value;} 
         | '/' a2=atomExp {$value /= $a2.value;}
         )* 
    ;

atomExp returns [double value]
    :    n=number                {$value = Double.parseDouble($n.text);}
    |    '(' exp=additionExp ')' {$value = $exp.value;}
    ;


	Number: '32423415';// TEST!
	atom
	  :  low  {System.out.println("low  = " + $low.text);}
	  |  high {System.out.println("high = " + $high.text);}
	  ;
	low
	  :  {Integer.valueOf(input.LT(1).getText()) <= 500}? Number;
	// disambiguating !! favorite
	high
	  :  Number;
	// catch the rest!