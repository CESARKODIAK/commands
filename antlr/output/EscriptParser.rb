#!/usr/bin/env ruby
#
# /Users/pannous/nlp/english-script/grammar/Escript.g
# --
# Generated using ANTLR version: 3.4
# Ruby runtime library version: 
# Input grammar file: /Users/pannous/nlp/english-script/grammar/Escript.g
# Generated at: 2012-02-12 00:57:46
#

# ~~~> start load path setup
this_directory = File.expand_path( File.dirname( __FILE__ ) )
$LOAD_PATH.unshift( this_directory ) unless $LOAD_PATH.include?( this_directory )

antlr_load_failed = proc do
  load_path = $LOAD_PATH.map { |dir| '  - ' << dir }.join( $/ )
  raise LoadError, <<-END.strip!

Failed to load the ANTLR3 runtime library (version ):

Ensure the library has been installed on your system and is available
on the load path. If rubygems is available on your system, this can
be done with the command:

  gem install antlr3

Current load path:
#{ load_path }

  END
end

defined?( ANTLR3 ) or begin

  # 1: try to load the ruby antlr3 runtime library from the system path
  require 'antlr3'

rescue LoadError

  # 2: try to load rubygems if it isn't already loaded
  defined?( Gem ) or begin
    require 'rubygems'
  rescue LoadError
    antlr_load_failed.call
  end

  # 3: try to activate the antlr3 gem
  begin
    Gem.activate( 'antlr3', '~> ' )
  rescue Gem::LoadError
    antlr_load_failed.call
  end

  require 'antlr3'

end
# <~~~ end load path setup


module Escript
  # TokenData defines all of the token type integer values
  # as constants, which will be included in all
  # ANTLR-generated recognizers.
  const_defined?( :TokenData ) or TokenData = ANTLR3::TokenScheme.new

  module TokenData

    # define the token constants
    define_tokens( :EOF => -1, :T__17 => 17, :T__18 => 18, :T__19 => 19, 
                   :T__20 => 20, :T__21 => 21, :T__22 => 22, :T__23 => 23, 
                   :T__24 => 24, :T__25 => 25, :T__26 => 26, :T__27 => 27, 
                   :T__28 => 28, :T__29 => 29, :T__30 => 30, :T__31 => 31, 
                   :T__32 => 32, :T__33 => 33, :T__34 => 34, :T__35 => 35, 
                   :T__36 => 36, :T__37 => 37, :T__38 => 38, :T__39 => 39, 
                   :T__40 => 40, :T__41 => 41, :T__42 => 42, :T__43 => 43, 
                   :T__44 => 44, :T__45 => 45, :T__46 => 46, :T__47 => 47, 
                   :T__48 => 48, :T__49 => 49, :T__50 => 50, :T__51 => 51, 
                   :T__52 => 52, :T__53 => 53, :T__54 => 54, :T__55 => 55, 
                   :T__56 => 56, :T__57 => 57, :T__58 => 58, :T__59 => 59, 
                   :T__60 => 60, :T__61 => 61, :T__62 => 62, :T__63 => 63, 
                   :T__64 => 64, :T__65 => 65, :T__66 => 66, :T__67 => 67, 
                   :T__68 => 68, :T__69 => 69, :T__70 => 70, :T__71 => 71, 
                   :T__72 => 72, :T__73 => 73, :T__74 => 74, :T__75 => 75, 
                   :T__76 => 76, :T__77 => 77, :T__78 => 78, :T__79 => 79, 
                   :T__80 => 80, :T__81 => 81, :T__82 => 82, :T__83 => 83, 
                   :T__84 => 84, :T__85 => 85, :T__86 => 86, :T__87 => 87, 
                   :T__88 => 88, :T__89 => 89, :T__90 => 90, :T__91 => 91, 
                   :T__92 => 92, :T__93 => 93, :T__94 => 94, :T__95 => 95, 
                   :T__96 => 96, :T__97 => 97, :T__98 => 98, :T__99 => 99, 
                   :T__100 => 100, :T__101 => 101, :T__102 => 102, :T__103 => 103, 
                   :T__104 => 104, :T__105 => 105, :T__106 => 106, :T__107 => 107, 
                   :T__108 => 108, :T__109 => 109, :T__110 => 110, :T__111 => 111, 
                   :T__112 => 112, :T__113 => 113, :T__114 => 114, :T__115 => 115, 
                   :T__116 => 116, :T__117 => 117, :T__118 => 118, :T__119 => 119, 
                   :T__120 => 120, :T__121 => 121, :T__122 => 122, :T__123 => 123, 
                   :T__124 => 124, :T__125 => 125, :T__126 => 126, :T__127 => 127, 
                   :T__128 => 128, :T__129 => 129, :T__130 => 130, :T__131 => 131, 
                   :T__132 => 132, :T__133 => 133, :T__134 => 134, :T__135 => 135, 
                   :T__136 => 136, :T__137 => 137, :T__138 => 138, :T__139 => 139, 
                   :T__140 => 140, :T__141 => 141, :T__142 => 142, :T__143 => 143, 
                   :COMMENT => 4, :DIGIT => 5, :ESC => 6, :If => 7, :Integer => 8, 
                   :LETTER => 9, :LINE_COMMENT => 10, :NL => 11, :Quote => 12, 
                   :Real => 13, :Reductions => 14, :WS => 15, :Word => 16 )


    # register the proper human-readable name or literal value
    # for each token type
    #
    # this is necessary because anonymous tokens, which are
    # created from literal values in the grammar, do not
    # have descriptive names
    register_names( "COMMENT", "DIGIT", "ESC", "If", "Integer", "LETTER", 
                    "LINE_COMMENT", "NL", "Quote", "Real", "Reductions", 
                    "WS", "Word", "':'", "':='", "'<'", "'='", "'=<'", "'=='", 
                    "'>'", "'>='", "'OK'", "'a'", "'above'", "'after'", 
                    "'against'", "'all set'", "'all'", "'alrighty'", "'an'", 
                    "'and'", "'any'", "'apart from'", "'around'", "'as long as'", 
                    "'as'", "'aside from'", "'ask'", "'at'", "'be'", "'before'", 
                    "'behind'", "'below'", "'beneath'", "'beside'", "'between'", 
                    "'bigger than'", "'but not'", "'call'", "'come'", "'considering'", 
                    "'define'", "'done'", "'drink'", "'each'", "'eat'", 
                    "'end'", "'eq'", "'equals'", "'every'", "'feel'", "'find'", 
                    "'finished'", "'from'", "'function'", "'funny'", "'get'", 
                    "'give'", "'go'", "'greater than'", "'gt'", "'had'", 
                    "'has'", "'hate'", "'have'", "'how to'", "'if'", "'in'", 
                    "'ing'", "'instead of'", "'into'", "'is'", "'joyfully'", 
                    "'know'", "'leave'", "'less than'", "'let'", "'like'", 
                    "'look'", "'lt'", "'make'", "'method for'", "'method'", 
                    "'never'", "'of'", "'often'", "'ok'", "'on'", "'once'", 
                    "'onto'", "'out of'", "'over'", "'qed'", "'s to'", "'s'", 
                    "'say'", "'see'", "'seem'", "'set'", "'since'", "'smaller than'", 
                    "'some'", "'stinky'", "'sucks'", "'take'", "'teh'", 
                    "'tell'", "'that'", "'the'", "'then'", "'these'", "'think'", 
                    "'this'", "'those'", "'through'", "'thru'", "'to'", 
                    "'until'", "'use'", "'val'", "'value of'", "'var'", 
                    "'want'", "'was'", "'where'", "'while'", "'who'", "'with'", 
                    "'without'", "'work'" )


  end


  class Parser < ANTLR3::Parser
  end # class Parser < ANTLR3::Parser

  at_exit { Parser.main( ARGV ) } if __FILE__ == $0

end

