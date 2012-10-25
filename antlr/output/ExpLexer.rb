#!/usr/bin/env ruby
#
# /Users/pannous/nlp/english-script/grammar/Exp.g3
# --
# Generated using ANTLR version: 3.4
# Ruby runtime library version: 
# Input grammar file: /Users/pannous/nlp/english-script/grammar/Exp.g3
# Generated at: 2012-02-11 23:59:25
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


module Exp
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
                   :T__120 => 120, :COMMENT => 4, :DIGIT => 5, :ESC => 6, 
                   :If => 7, :Integer => 8, :LETTER => 9, :LINE_COMMENT => 10, 
                   :NL => 11, :Quote => 12, :Real => 13, :Reductions => 14, 
                   :WS => 15, :Word => 16 )

  end


  class Lexer < ANTLR3::Lexer
    @grammar_home = Exp
    include TokenData

    begin
      generated_using( "/Users/pannous/nlp/english-script/grammar/Exp.g3", "3.4", "" )
    rescue NoMethodError => error
      # ignore
    end

    RULE_NAMES   = [ "T__17", "T__18", "T__19", "T__20", "T__21", "T__22", 
                     "T__23", "T__24", "T__25", "T__26", "T__27", "T__28", 
                     "T__29", "T__30", "T__31", "T__32", "T__33", "T__34", 
                     "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
                     "T__41", "T__42", "T__43", "T__44", "T__45", "T__46", 
                     "T__47", "T__48", "T__49", "T__50", "T__51", "T__52", 
                     "T__53", "T__54", "T__55", "T__56", "T__57", "T__58", 
                     "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
                     "T__65", "T__66", "T__67", "T__68", "T__69", "T__70", 
                     "T__71", "T__72", "T__73", "T__74", "T__75", "T__76", 
                     "T__77", "T__78", "T__79", "T__80", "T__81", "T__82", 
                     "T__83", "T__84", "T__85", "T__86", "T__87", "T__88", 
                     "T__89", "T__90", "T__91", "T__92", "T__93", "T__94", 
                     "T__95", "T__96", "T__97", "T__98", "T__99", "T__100", 
                     "T__101", "T__102", "T__103", "T__104", "T__105", "T__106", 
                     "T__107", "T__108", "T__109", "T__110", "T__111", "T__112", 
                     "T__113", "T__114", "T__115", "T__116", "T__117", "T__118", 
                     "T__119", "T__120", "ESC", "Quote", "If", "Word", "DIGIT", 
                     "Integer", "Real", "NL", "LETTER", "COMMENT", "Reductions", 
                     "LINE_COMMENT", "WS" ].freeze
    RULE_METHODS = [ :t__17!, :t__18!, :t__19!, :t__20!, :t__21!, :t__22!, 
                     :t__23!, :t__24!, :t__25!, :t__26!, :t__27!, :t__28!, 
                     :t__29!, :t__30!, :t__31!, :t__32!, :t__33!, :t__34!, 
                     :t__35!, :t__36!, :t__37!, :t__38!, :t__39!, :t__40!, 
                     :t__41!, :t__42!, :t__43!, :t__44!, :t__45!, :t__46!, 
                     :t__47!, :t__48!, :t__49!, :t__50!, :t__51!, :t__52!, 
                     :t__53!, :t__54!, :t__55!, :t__56!, :t__57!, :t__58!, 
                     :t__59!, :t__60!, :t__61!, :t__62!, :t__63!, :t__64!, 
                     :t__65!, :t__66!, :t__67!, :t__68!, :t__69!, :t__70!, 
                     :t__71!, :t__72!, :t__73!, :t__74!, :t__75!, :t__76!, 
                     :t__77!, :t__78!, :t__79!, :t__80!, :t__81!, :t__82!, 
                     :t__83!, :t__84!, :t__85!, :t__86!, :t__87!, :t__88!, 
                     :t__89!, :t__90!, :t__91!, :t__92!, :t__93!, :t__94!, 
                     :t__95!, :t__96!, :t__97!, :t__98!, :t__99!, :t__100!, 
                     :t__101!, :t__102!, :t__103!, :t__104!, :t__105!, :t__106!, 
                     :t__107!, :t__108!, :t__109!, :t__110!, :t__111!, :t__112!, 
                     :t__113!, :t__114!, :t__115!, :t__116!, :t__117!, :t__118!, 
                     :t__119!, :t__120!, :esc!, :quote!, :if!, :word!, :digit!, 
                     :integer!, :real!, :nl!, :letter!, :comment!, :reductions!, 
                     :line_comment!, :ws! ].freeze

    def initialize( input=nil, options = {} )
      super( input, options )
    end


    # - - - - - - - - - - - lexer rules - - - - - - - - - - - -
    # lexer rule t__17! (T__17)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__17!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 1 )



      type = T__17
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 7:9: ':'
      match( 0x3a )


      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 1 )


    end

    # lexer rule t__18! (T__18)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__18!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 2 )



      type = T__18
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 8:9: ':='
      match( ":=" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 2 )


    end

    # lexer rule t__19! (T__19)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__19!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 3 )



      type = T__19
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 9:9: '<'
      match( 0x3c )


      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 3 )


    end

    # lexer rule t__20! (T__20)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__20!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 4 )



      type = T__20
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 10:9: '='
      match( 0x3d )


      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 4 )


    end

    # lexer rule t__21! (T__21)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__21!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 5 )



      type = T__21
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 11:9: '=<'
      match( "=<" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 5 )


    end

    # lexer rule t__22! (T__22)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__22!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 6 )



      type = T__22
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 12:9: '=='
      match( "==" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 6 )


    end

    # lexer rule t__23! (T__23)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__23!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 7 )



      type = T__23
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 13:9: '>'
      match( 0x3e )


      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 7 )


    end

    # lexer rule t__24! (T__24)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__24!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 8 )



      type = T__24
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 14:9: '>='
      match( ">=" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 8 )


    end

    # lexer rule t__25! (T__25)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__25!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 9 )



      type = T__25
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 15:9: 'OK'
      match( "OK" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 9 )


    end

    # lexer rule t__26! (T__26)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__26!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 10 )



      type = T__26
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 16:9: 'a'
      match( 0x61 )


      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 10 )


    end

    # lexer rule t__27! (T__27)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__27!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 11 )



      type = T__27
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 17:9: 'above'
      match( "above" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 11 )


    end

    # lexer rule t__28! (T__28)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__28!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 12 )



      type = T__28
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 18:9: 'after'
      match( "after" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 12 )


    end

    # lexer rule t__29! (T__29)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__29!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 13 )



      type = T__29
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 19:9: 'against'
      match( "against" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 13 )


    end

    # lexer rule t__30! (T__30)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__30!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 14 )



      type = T__30
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 20:9: 'all set'
      match( "all set" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 14 )


    end

    # lexer rule t__31! (T__31)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__31!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 15 )



      type = T__31
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 21:9: 'all'
      match( "all" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 15 )


    end

    # lexer rule t__32! (T__32)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__32!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 16 )



      type = T__32
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 22:9: 'alrighty'
      match( "alrighty" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 16 )


    end

    # lexer rule t__33! (T__33)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__33!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 17 )



      type = T__33
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 23:9: 'an'
      match( "an" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 17 )


    end

    # lexer rule t__34! (T__34)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__34!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 18 )



      type = T__34
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 24:9: 'and'
      match( "and" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 18 )


    end

    # lexer rule t__35! (T__35)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__35!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 19 )



      type = T__35
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 25:9: 'any'
      match( "any" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 19 )


    end

    # lexer rule t__36! (T__36)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__36!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 20 )



      type = T__36
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 26:9: 'apart from'
      match( "apart from" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 20 )


    end

    # lexer rule t__37! (T__37)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__37!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 21 )



      type = T__37
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 27:9: 'around'
      match( "around" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 21 )


    end

    # lexer rule t__38! (T__38)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__38!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 22 )



      type = T__38
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 28:9: 'as long as'
      match( "as long as" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 22 )


    end

    # lexer rule t__39! (T__39)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__39!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 23 )



      type = T__39
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 29:9: 'as'
      match( "as" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 23 )


    end

    # lexer rule t__40! (T__40)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__40!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 24 )



      type = T__40
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 30:9: 'aside from'
      match( "aside from" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 24 )


    end

    # lexer rule t__41! (T__41)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__41!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 25 )



      type = T__41
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 31:9: 'at'
      match( "at" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 25 )


    end

    # lexer rule t__42! (T__42)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__42!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 26 )



      type = T__42
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 32:9: 'be'
      match( "be" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 26 )


    end

    # lexer rule t__43! (T__43)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__43!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 27 )



      type = T__43
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 33:9: 'before'
      match( "before" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 27 )


    end

    # lexer rule t__44! (T__44)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__44!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 28 )



      type = T__44
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 34:9: 'behind'
      match( "behind" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 28 )


    end

    # lexer rule t__45! (T__45)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__45!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 29 )



      type = T__45
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 35:9: 'below'
      match( "below" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 29 )


    end

    # lexer rule t__46! (T__46)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__46!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 30 )



      type = T__46
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 36:9: 'beneath'
      match( "beneath" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 30 )


    end

    # lexer rule t__47! (T__47)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__47!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 31 )



      type = T__47
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 37:9: 'beside'
      match( "beside" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 31 )


    end

    # lexer rule t__48! (T__48)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__48!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 32 )



      type = T__48
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 38:9: 'between'
      match( "between" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 32 )


    end

    # lexer rule t__49! (T__49)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__49!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 33 )



      type = T__49
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 39:9: 'bigger than'
      match( "bigger than" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 33 )


    end

    # lexer rule t__50! (T__50)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__50!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 34 )



      type = T__50
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 40:9: 'but not'
      match( "but not" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 34 )


    end

    # lexer rule t__51! (T__51)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__51!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 35 )



      type = T__51
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 41:9: 'considering'
      match( "considering" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 35 )


    end

    # lexer rule t__52! (T__52)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__52!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 36 )



      type = T__52
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 42:9: 'define'
      match( "define" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 36 )


    end

    # lexer rule t__53! (T__53)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__53!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 37 )



      type = T__53
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 43:9: 'done'
      match( "done" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 37 )


    end

    # lexer rule t__54! (T__54)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__54!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 38 )



      type = T__54
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 44:9: 'each'
      match( "each" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 38 )


    end

    # lexer rule t__55! (T__55)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__55!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 39 )



      type = T__55
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 45:9: 'end'
      match( "end" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 39 )


    end

    # lexer rule t__56! (T__56)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__56!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 40 )



      type = T__56
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 46:9: 'eq'
      match( "eq" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 40 )


    end

    # lexer rule t__57! (T__57)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__57!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 41 )



      type = T__57
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 47:9: 'equals'
      match( "equals" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 41 )


    end

    # lexer rule t__58! (T__58)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__58!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 42 )



      type = T__58
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 48:9: 'every'
      match( "every" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 42 )


    end

    # lexer rule t__59! (T__59)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__59!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 43 )



      type = T__59
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 49:9: 'finished'
      match( "finished" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 43 )


    end

    # lexer rule t__60! (T__60)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__60!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 44 )



      type = T__60
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 50:9: 'from'
      match( "from" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 44 )


    end

    # lexer rule t__61! (T__61)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__61!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 45 )



      type = T__61
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 51:9: 'function'
      match( "function" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 45 )


    end

    # lexer rule t__62! (T__62)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__62!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 46 )



      type = T__62
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 52:9: 'funny'
      match( "funny" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 46 )


    end

    # lexer rule t__63! (T__63)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__63!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 47 )



      type = T__63
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 53:9: 'greater than'
      match( "greater than" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 47 )


    end

    # lexer rule t__64! (T__64)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__64!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 48 )



      type = T__64
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 54:9: 'gt'
      match( "gt" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 48 )


    end

    # lexer rule t__65! (T__65)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__65!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 49 )



      type = T__65
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 55:9: 'had'
      match( "had" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 49 )


    end

    # lexer rule t__66! (T__66)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__66!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 50 )



      type = T__66
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 56:9: 'has'
      match( "has" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 50 )


    end

    # lexer rule t__67! (T__67)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__67!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 51 )



      type = T__67
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 57:9: 'hate'
      match( "hate" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 51 )


    end

    # lexer rule t__68! (T__68)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__68!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 52 )



      type = T__68
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 58:9: 'have'
      match( "have" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 52 )


    end

    # lexer rule t__69! (T__69)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__69!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 53 )



      type = T__69
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 59:9: 'how to'
      match( "how to" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 53 )


    end

    # lexer rule t__70! (T__70)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__70!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 54 )



      type = T__70
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 60:9: 'if'
      match( "if" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 54 )


    end

    # lexer rule t__71! (T__71)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__71!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 55 )



      type = T__71
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 61:9: 'in'
      match( "in" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 55 )


    end

    # lexer rule t__72! (T__72)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__72!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 56 )



      type = T__72
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 62:9: 'ing'
      match( "ing" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 56 )


    end

    # lexer rule t__73! (T__73)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__73!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 57 )



      type = T__73
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 63:9: 'instead of'
      match( "instead of" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 57 )


    end

    # lexer rule t__74! (T__74)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__74!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 58 )



      type = T__74
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 64:9: 'into'
      match( "into" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 58 )


    end

    # lexer rule t__75! (T__75)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__75!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 59 )



      type = T__75
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 65:9: 'is'
      match( "is" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 59 )


    end

    # lexer rule t__76! (T__76)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__76!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 60 )



      type = T__76
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 66:9: 'joyfully'
      match( "joyfully" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 60 )


    end

    # lexer rule t__77! (T__77)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__77!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 61 )



      type = T__77
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 67:9: 'less than'
      match( "less than" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 61 )


    end

    # lexer rule t__78! (T__78)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__78!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 62 )



      type = T__78
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 68:9: 'let'
      match( "let" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 62 )


    end

    # lexer rule t__79! (T__79)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__79!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 63 )



      type = T__79
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 69:9: 'like'
      match( "like" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 63 )


    end

    # lexer rule t__80! (T__80)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__80!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 64 )



      type = T__80
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 70:9: 'lt'
      match( "lt" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 64 )


    end

    # lexer rule t__81! (T__81)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__81!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 65 )



      type = T__81
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 71:9: 'method for'
      match( "method for" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 65 )


    end

    # lexer rule t__82! (T__82)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__82!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 66 )



      type = T__82
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 72:9: 'method'
      match( "method" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 66 )


    end

    # lexer rule t__83! (T__83)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__83!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 67 )



      type = T__83
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 73:9: 'never'
      match( "never" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 67 )


    end

    # lexer rule t__84! (T__84)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__84!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 68 )



      type = T__84
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 74:9: 'of'
      match( "of" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 68 )


    end

    # lexer rule t__85! (T__85)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__85!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 69 )



      type = T__85
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 75:9: 'often'
      match( "often" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 69 )


    end

    # lexer rule t__86! (T__86)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__86!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 70 )



      type = T__86
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 76:9: 'ok'
      match( "ok" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 70 )


    end

    # lexer rule t__87! (T__87)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__87!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 71 )



      type = T__87
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 77:9: 'on'
      match( "on" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 71 )


    end

    # lexer rule t__88! (T__88)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__88!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 72 )



      type = T__88
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 78:9: 'once'
      match( "once" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 72 )


    end

    # lexer rule t__89! (T__89)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__89!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 73 )



      type = T__89
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 79:9: 'onto'
      match( "onto" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 73 )


    end

    # lexer rule t__90! (T__90)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__90!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 74 )



      type = T__90
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 80:9: 'out of'
      match( "out of" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 74 )


    end

    # lexer rule t__91! (T__91)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__91!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 75 )



      type = T__91
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 81:9: 'over'
      match( "over" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 75 )


    end

    # lexer rule t__92! (T__92)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__92!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 76 )



      type = T__92
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 82:9: 'qed'
      match( "qed" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 76 )


    end

    # lexer rule t__93! (T__93)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__93!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 77 )



      type = T__93
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 83:9: 's to'
      match( "s to" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 77 )


    end

    # lexer rule t__94! (T__94)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__94!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 78 )



      type = T__94
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 84:9: 's'
      match( 0x73 )


      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 78 )


    end

    # lexer rule t__95! (T__95)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__95!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 79 )



      type = T__95
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 85:9: 'set'
      match( "set" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 79 )


    end

    # lexer rule t__96! (T__96)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__96!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 80 )



      type = T__96
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 86:9: 'since'
      match( "since" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 80 )


    end

    # lexer rule t__97! (T__97)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__97!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 81 )



      type = T__97
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 87:9: 'smaller than'
      match( "smaller than" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 81 )


    end

    # lexer rule t__98! (T__98)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__98!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 82 )



      type = T__98
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 88:9: 'some'
      match( "some" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 82 )


    end

    # lexer rule t__99! (T__99)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__99!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 83 )



      type = T__99
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 89:9: 'stinky'
      match( "stinky" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 83 )


    end

    # lexer rule t__100! (T__100)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__100!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 84 )



      type = T__100
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 90:10: 'sucks'
      match( "sucks" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 84 )


    end

    # lexer rule t__101! (T__101)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__101!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 85 )



      type = T__101
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 91:10: 'teh'
      match( "teh" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 85 )


    end

    # lexer rule t__102! (T__102)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__102!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 86 )



      type = T__102
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 92:10: 'that'
      match( "that" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 86 )


    end

    # lexer rule t__103! (T__103)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__103!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 87 )



      type = T__103
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 93:10: 'the'
      match( "the" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 87 )


    end

    # lexer rule t__104! (T__104)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__104!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 88 )



      type = T__104
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 94:10: 'then'
      match( "then" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 88 )


    end

    # lexer rule t__105! (T__105)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__105!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 89 )



      type = T__105
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 95:10: 'these'
      match( "these" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 89 )


    end

    # lexer rule t__106! (T__106)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__106!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 90 )



      type = T__106
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 96:10: 'this'
      match( "this" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 90 )


    end

    # lexer rule t__107! (T__107)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__107!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 91 )



      type = T__107
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 97:10: 'those'
      match( "those" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 91 )


    end

    # lexer rule t__108! (T__108)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__108!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 92 )



      type = T__108
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 98:10: 'through'
      match( "through" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 92 )


    end

    # lexer rule t__109! (T__109)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__109!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 93 )



      type = T__109
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 99:10: 'thru'
      match( "thru" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 93 )


    end

    # lexer rule t__110! (T__110)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__110!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 94 )



      type = T__110
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 100:10: 'to'
      match( "to" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 94 )


    end

    # lexer rule t__111! (T__111)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__111!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 95 )



      type = T__111
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 101:10: 'val'
      match( "val" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 95 )


    end

    # lexer rule t__112! (T__112)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__112!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 96 )



      type = T__112
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 102:10: 'value of'
      match( "value of" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 96 )


    end

    # lexer rule t__113! (T__113)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__113!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 97 )



      type = T__113
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 103:10: 'var'
      match( "var" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 97 )


    end

    # lexer rule t__114! (T__114)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__114!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 98 )



      type = T__114
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 104:10: 'want'
      match( "want" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 98 )


    end

    # lexer rule t__115! (T__115)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__115!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 99 )



      type = T__115
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 105:10: 'was'
      match( "was" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 99 )


    end

    # lexer rule t__116! (T__116)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__116!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 100 )



      type = T__116
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 106:10: 'where'
      match( "where" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 100 )


    end

    # lexer rule t__117! (T__117)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__117!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 101 )



      type = T__117
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 107:10: 'while'
      match( "while" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 101 )


    end

    # lexer rule t__118! (T__118)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__118!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 102 )



      type = T__118
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 108:10: 'who'
      match( "who" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 102 )


    end

    # lexer rule t__119! (T__119)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__119!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 103 )



      type = T__119
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 109:10: 'with'
      match( "with" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 103 )


    end

    # lexer rule t__120! (T__120)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def t__120!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 104 )



      type = T__120
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 110:10: 'without'
      match( "without" )



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 104 )


    end

    # lexer rule esc! (ESC)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def esc!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 105 )



      type = ESC
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 225:17: '\\\\' ( 'n' | 'r' )
      match( 0x5c )
      if @input.peek(1) == 0x6e || @input.peek(1) == 0x72
        @input.consume
      else
        mse = MismatchedSet( nil )
        recover mse
        raise mse

      end




      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 105 )


    end

    # lexer rule quote! (Quote)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def quote!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 106 )



      type = Quote
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 226:7: ( '\"' ( options {greedy=false; } : . )* '\"' | '\\'' ( options {greedy=false; } : . )* '\\'' )
      alt_3 = 2
      look_3_0 = @input.peek( 1 )

      if ( look_3_0 == 0x22 )
        alt_3 = 1
      elsif ( look_3_0 == 0x27 )
        alt_3 = 2
      else
        raise NoViableAlternative( "", 3, 0 )

      end
      case alt_3
      when 1
        # at line 226:9: '\"' ( options {greedy=false; } : . )* '\"'
        match( 0x22 )
        # at line 226:13: ( options {greedy=false; } : . )*
        while true # decision 1
          alt_1 = 2
          look_1_0 = @input.peek( 1 )

          if ( look_1_0 == 0x22 )
            alt_1 = 2
          elsif ( look_1_0.between?( 0x0, 0x21 ) || look_1_0.between?( 0x23, 0xffff ) )
            alt_1 = 1

          end
          case alt_1
          when 1
            # at line 226:41: .
            match_any

          else
            break # out of loop for decision 1
          end
        end # loop for decision 1

        match( 0x22 )

      when 2
        # at line 226:51: '\\'' ( options {greedy=false; } : . )* '\\''
        match( 0x27 )
        # at line 226:57: ( options {greedy=false; } : . )*
        while true # decision 2
          alt_2 = 2
          look_2_0 = @input.peek( 1 )

          if ( look_2_0 == 0x27 )
            alt_2 = 2
          elsif ( look_2_0.between?( 0x0, 0x26 ) || look_2_0.between?( 0x28, 0xffff ) )
            alt_2 = 1

          end
          case alt_2
          when 1
            # at line 226:85: .
            match_any

          else
            break # out of loop for decision 2
          end
        end # loop for decision 2

        match( 0x27 )

      end

      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 106 )


    end

    # lexer rule if! (If)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def if!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 107 )



      type = If
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 231:4: ( 'unless' | 'in case that' | 'if' )
      alt_4 = 3
      look_4_0 = @input.peek( 1 )

      if ( look_4_0 == 0x75 )
        alt_4 = 1
      elsif ( look_4_0 == 0x69 )
        look_4_2 = @input.peek( 2 )

        if ( look_4_2 == 0x6e )
          alt_4 = 2
        elsif ( look_4_2 == 0x66 )
          alt_4 = 3
        else
          raise NoViableAlternative( "", 4, 2 )

        end
      else
        raise NoViableAlternative( "", 4, 0 )

      end
      case alt_4
      when 1
        # at line 231:6: 'unless'
        match( "unless" )


      when 2
        # at line 231:15: 'in case that'
        match( "in case that" )


      when 3
        # at line 231:30: 'if'
        match( "if" )


      end

      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 107 )


    end

    # lexer rule word! (Word)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def word!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 108 )



      type = Word
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 247:4: ( LETTER )+
      # at file 247:4: ( LETTER )+
      match_count_5 = 0
      while true
        alt_5 = 2
        look_5_0 = @input.peek( 1 )

        if ( look_5_0 == 0x24 || look_5_0.between?( 0x41, 0x5a ) || look_5_0 == 0x5f || look_5_0.between?( 0x61, 0x7a ) )
          alt_5 = 1

        end
        case alt_5
        when 1
          # at line 
          if @input.peek(1) == 0x24 || @input.peek( 1 ).between?( 0x41, 0x5a ) || @input.peek(1) == 0x5f || @input.peek( 1 ).between?( 0x61, 0x7a )
            @input.consume
          else
            mse = MismatchedSet( nil )
            recover mse
            raise mse

          end



        else
          match_count_5 > 0 and break
          eee = EarlyExit(5)


          raise eee
        end
        match_count_5 += 1
      end




      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 108 )


    end

    # lexer rule digit! (DIGIT)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def digit!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 109 )


    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 
      if @input.peek( 1 ).between?( 0x30, 0x39 )
        @input.consume
      else
        mse = MismatchedSet( nil )
        recover mse
        raise mse

      end



    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 109 )


    end

    # lexer rule integer! (Integer)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def integer!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 110 )



      type = Integer
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 257:13: ( DIGIT )+
      # at file 257:13: ( DIGIT )+
      match_count_6 = 0
      while true
        alt_6 = 2
        look_6_0 = @input.peek( 1 )

        if ( look_6_0.between?( 0x30, 0x39 ) )
          alt_6 = 1

        end
        case alt_6
        when 1
          # at line 
          if @input.peek( 1 ).between?( 0x30, 0x39 )
            @input.consume
          else
            mse = MismatchedSet( nil )
            recover mse
            raise mse

          end



        else
          match_count_6 > 0 and break
          eee = EarlyExit(6)


          raise eee
        end
        match_count_6 += 1
      end




      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 110 )


    end

    # lexer rule real! (Real)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def real!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 111 )



      type = Real
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 258:8: ( DIGIT )* '.' ( DIGIT )+
      # at line 258:8: ( DIGIT )*
      while true # decision 7
        alt_7 = 2
        look_7_0 = @input.peek( 1 )

        if ( look_7_0.between?( 0x30, 0x39 ) )
          alt_7 = 1

        end
        case alt_7
        when 1
          # at line 
          if @input.peek( 1 ).between?( 0x30, 0x39 )
            @input.consume
          else
            mse = MismatchedSet( nil )
            recover mse
            raise mse

          end



        else
          break # out of loop for decision 7
        end
      end # loop for decision 7

      match( 0x2e )
      # at file 258:19: ( DIGIT )+
      match_count_8 = 0
      while true
        alt_8 = 2
        look_8_0 = @input.peek( 1 )

        if ( look_8_0.between?( 0x30, 0x39 ) )
          alt_8 = 1

        end
        case alt_8
        when 1
          # at line 
          if @input.peek( 1 ).between?( 0x30, 0x39 )
            @input.consume
          else
            mse = MismatchedSet( nil )
            recover mse
            raise mse

          end



        else
          match_count_8 > 0 and break
          eee = EarlyExit(8)


          raise eee
        end
        match_count_8 += 1
      end




      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 111 )


    end

    # lexer rule nl! (NL)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def nl!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 112 )



      type = NL
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 261:2: ( '\\r' | '\\n' | '!' | '?' | ';' | '. ' )
      alt_9 = 6
      case look_9 = @input.peek( 1 )
      when 0xd then alt_9 = 1
      when 0xa then alt_9 = 2
      when 0x21 then alt_9 = 3
      when 0x3f then alt_9 = 4
      when 0x3b then alt_9 = 5
      when 0x2e then alt_9 = 6
      else
        raise NoViableAlternative( "", 9, 0 )

      end
      case alt_9
      when 1
        # at line 261:4: '\\r'
        match( 0xd )

      when 2
        # at line 261:9: '\\n'
        match( 0xa )

      when 3
        # at line 261:14: '!'
        match( 0x21 )

      when 4
        # at line 261:18: '?'
        match( 0x3f )

      when 5
        # at line 261:22: ';'
        match( 0x3b )

      when 6
        # at line 261:26: '. '
        match( ". " )


      end

      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 112 )


    end

    # lexer rule letter! (LETTER)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def letter!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 113 )


    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 
      if @input.peek(1) == 0x24 || @input.peek( 1 ).between?( 0x41, 0x5a ) || @input.peek(1) == 0x5f || @input.peek( 1 ).between?( 0x61, 0x7a )
        @input.consume
      else
        mse = MismatchedSet( nil )
        recover mse
        raise mse

      end



    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 113 )


    end

    # lexer rule comment! (COMMENT)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def comment!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 114 )



      type = COMMENT
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 273:9: '/*' ( options {greedy=false; } : . )* '*/'
      match( "/*" )

      # at line 273:14: ( options {greedy=false; } : . )*
      while true # decision 10
        alt_10 = 2
        look_10_0 = @input.peek( 1 )

        if ( look_10_0 == 0x2a )
          look_10_1 = @input.peek( 2 )

          if ( look_10_1 == 0x2f )
            alt_10 = 2
          elsif ( look_10_1.between?( 0x0, 0x2e ) || look_10_1.between?( 0x30, 0xffff ) )
            alt_10 = 1

          end
        elsif ( look_10_0.between?( 0x0, 0x29 ) || look_10_0.between?( 0x2b, 0xffff ) )
          alt_10 = 1

        end
        case alt_10
        when 1
          # at line 273:42: .
          match_any

        else
          break # out of loop for decision 10
        end
      end # loop for decision 10


      match( "*/" )


      # --> action
      System.out.println("found comment "+getText());channel=HIDDEN;
      # <-- action



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 114 )


    end

    # lexer rule reductions! (Reductions)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def reductions!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 115 )



      type = Reductions
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 278:4: ( 'here is' | 'lets see' | 'please' )
      # at line 278:4: ( 'here is' | 'lets see' | 'please' )
      alt_11 = 3
      case look_11 = @input.peek( 1 )
      when 0x68 then alt_11 = 1
      when 0x6c then alt_11 = 2
      when 0x70 then alt_11 = 3
      else
        raise NoViableAlternative( "", 11, 0 )

      end
      case alt_11
      when 1
        # at line 278:5: 'here is'
        match( "here is" )


      when 2
        # at line 278:15: 'lets see'
        match( "lets see" )


      when 3
        # at line 278:26: 'please'
        match( "please" )


      end

      # --> action
      channel=HIDDEN;
      # <-- action



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 115 )


    end

    # lexer rule line_comment! (LINE_COMMENT)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def line_comment!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 116 )



      type = LINE_COMMENT
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 281:7: ( '//' | '#' | '--' ) (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
      # at line 281:7: ( '//' | '#' | '--' )
      alt_12 = 3
      case look_12 = @input.peek( 1 )
      when 0x2f then alt_12 = 1
      when 0x23 then alt_12 = 2
      when 0x2d then alt_12 = 3
      else
        raise NoViableAlternative( "", 12, 0 )

      end
      case alt_12
      when 1
        # at line 281:8: '//'
        match( "//" )


      when 2
        # at line 281:15: '#'
        match( 0x23 )

      when 3
        # at line 281:21: '--'
        match( "--" )


      end
      # at line 281:27: (~ ( '\\n' | '\\r' ) )*
      while true # decision 13
        alt_13 = 2
        look_13_0 = @input.peek( 1 )

        if ( look_13_0.between?( 0x0, 0x9 ) || look_13_0.between?( 0xb, 0xc ) || look_13_0.between?( 0xe, 0xffff ) )
          alt_13 = 1

        end
        case alt_13
        when 1
          # at line 
          if @input.peek( 1 ).between?( 0x0, 0x9 ) || @input.peek( 1 ).between?( 0xb, 0xc ) || @input.peek( 1 ).between?( 0xe, 0xffff )
            @input.consume
          else
            mse = MismatchedSet( nil )
            recover mse
            raise mse

          end



        else
          break # out of loop for decision 13
        end
      end # loop for decision 13

      # at line 281:41: ( '\\r' )?
      alt_14 = 2
      look_14_0 = @input.peek( 1 )

      if ( look_14_0 == 0xd )
        alt_14 = 1
      end
      case alt_14
      when 1
        # at line 281:41: '\\r'
        match( 0xd )

      end
      match( 0xa )

      # --> action
      channel=HIDDEN;
      # <-- action



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 116 )


    end

    # lexer rule ws! (WS)
    # (in /Users/pannous/nlp/english-script/grammar/Exp.g3)
    def ws!
      # -> uncomment the next line to manually enable rule tracing
      # trace_in( __method__, 117 )



      type = WS
      channel = ANTLR3::DEFAULT_CHANNEL
    # - - - - label initialization - - - -


      # - - - - main rule block - - - -
      # at line 285:13: ( ' ' | '\\t' | '\\u000C' | '\\r' )
      if @input.peek(1) == 0x9 || @input.peek( 1 ).between?( 0xc, 0xd ) || @input.peek(1) == 0x20
        @input.consume
      else
        mse = MismatchedSet( nil )
        recover mse
        raise mse

      end



      # --> action
       channel=HIDDEN;
      # <-- action



      @state.type = type
      @state.channel = channel
    ensure
      # -> uncomment the next line to manually enable rule tracing
      # trace_out( __method__, 117 )


    end

    # main rule used to study the input at the current position,
    # and choose the proper lexer rule to call in order to
    # fetch the next token
    #
    # usually, you don't make direct calls to this method,
    # but instead use the next_token method, which will
    # build and emit the actual next token
    def token!
      # at line 1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | ESC | Quote | If | Word | Integer | Real | NL | COMMENT | Reductions | LINE_COMMENT | WS )
      alt_15 = 115
      alt_15 = @dfa15.predict( @input )
      case alt_15
      when 1
        # at line 1:10: T__17
        t__17!


      when 2
        # at line 1:16: T__18
        t__18!


      when 3
        # at line 1:22: T__19
        t__19!


      when 4
        # at line 1:28: T__20
        t__20!


      when 5
        # at line 1:34: T__21
        t__21!


      when 6
        # at line 1:40: T__22
        t__22!


      when 7
        # at line 1:46: T__23
        t__23!


      when 8
        # at line 1:52: T__24
        t__24!


      when 9
        # at line 1:58: T__25
        t__25!


      when 10
        # at line 1:64: T__26
        t__26!


      when 11
        # at line 1:70: T__27
        t__27!


      when 12
        # at line 1:76: T__28
        t__28!


      when 13
        # at line 1:82: T__29
        t__29!


      when 14
        # at line 1:88: T__30
        t__30!


      when 15
        # at line 1:94: T__31
        t__31!


      when 16
        # at line 1:100: T__32
        t__32!


      when 17
        # at line 1:106: T__33
        t__33!


      when 18
        # at line 1:112: T__34
        t__34!


      when 19
        # at line 1:118: T__35
        t__35!


      when 20
        # at line 1:124: T__36
        t__36!


      when 21
        # at line 1:130: T__37
        t__37!


      when 22
        # at line 1:136: T__38
        t__38!


      when 23
        # at line 1:142: T__39
        t__39!


      when 24
        # at line 1:148: T__40
        t__40!


      when 25
        # at line 1:154: T__41
        t__41!


      when 26
        # at line 1:160: T__42
        t__42!


      when 27
        # at line 1:166: T__43
        t__43!


      when 28
        # at line 1:172: T__44
        t__44!


      when 29
        # at line 1:178: T__45
        t__45!


      when 30
        # at line 1:184: T__46
        t__46!


      when 31
        # at line 1:190: T__47
        t__47!


      when 32
        # at line 1:196: T__48
        t__48!


      when 33
        # at line 1:202: T__49
        t__49!


      when 34
        # at line 1:208: T__50
        t__50!


      when 35
        # at line 1:214: T__51
        t__51!


      when 36
        # at line 1:220: T__52
        t__52!


      when 37
        # at line 1:226: T__53
        t__53!


      when 38
        # at line 1:232: T__54
        t__54!


      when 39
        # at line 1:238: T__55
        t__55!


      when 40
        # at line 1:244: T__56
        t__56!


      when 41
        # at line 1:250: T__57
        t__57!


      when 42
        # at line 1:256: T__58
        t__58!


      when 43
        # at line 1:262: T__59
        t__59!


      when 44
        # at line 1:268: T__60
        t__60!


      when 45
        # at line 1:274: T__61
        t__61!


      when 46
        # at line 1:280: T__62
        t__62!


      when 47
        # at line 1:286: T__63
        t__63!


      when 48
        # at line 1:292: T__64
        t__64!


      when 49
        # at line 1:298: T__65
        t__65!


      when 50
        # at line 1:304: T__66
        t__66!


      when 51
        # at line 1:310: T__67
        t__67!


      when 52
        # at line 1:316: T__68
        t__68!


      when 53
        # at line 1:322: T__69
        t__69!


      when 54
        # at line 1:328: T__70
        t__70!


      when 55
        # at line 1:334: T__71
        t__71!


      when 56
        # at line 1:340: T__72
        t__72!


      when 57
        # at line 1:346: T__73
        t__73!


      when 58
        # at line 1:352: T__74
        t__74!


      when 59
        # at line 1:358: T__75
        t__75!


      when 60
        # at line 1:364: T__76
        t__76!


      when 61
        # at line 1:370: T__77
        t__77!


      when 62
        # at line 1:376: T__78
        t__78!


      when 63
        # at line 1:382: T__79
        t__79!


      when 64
        # at line 1:388: T__80
        t__80!


      when 65
        # at line 1:394: T__81
        t__81!


      when 66
        # at line 1:400: T__82
        t__82!


      when 67
        # at line 1:406: T__83
        t__83!


      when 68
        # at line 1:412: T__84
        t__84!


      when 69
        # at line 1:418: T__85
        t__85!


      when 70
        # at line 1:424: T__86
        t__86!


      when 71
        # at line 1:430: T__87
        t__87!


      when 72
        # at line 1:436: T__88
        t__88!


      when 73
        # at line 1:442: T__89
        t__89!


      when 74
        # at line 1:448: T__90
        t__90!


      when 75
        # at line 1:454: T__91
        t__91!


      when 76
        # at line 1:460: T__92
        t__92!


      when 77
        # at line 1:466: T__93
        t__93!


      when 78
        # at line 1:472: T__94
        t__94!


      when 79
        # at line 1:478: T__95
        t__95!


      when 80
        # at line 1:484: T__96
        t__96!


      when 81
        # at line 1:490: T__97
        t__97!


      when 82
        # at line 1:496: T__98
        t__98!


      when 83
        # at line 1:502: T__99
        t__99!


      when 84
        # at line 1:508: T__100
        t__100!


      when 85
        # at line 1:515: T__101
        t__101!


      when 86
        # at line 1:522: T__102
        t__102!


      when 87
        # at line 1:529: T__103
        t__103!


      when 88
        # at line 1:536: T__104
        t__104!


      when 89
        # at line 1:543: T__105
        t__105!


      when 90
        # at line 1:550: T__106
        t__106!


      when 91
        # at line 1:557: T__107
        t__107!


      when 92
        # at line 1:564: T__108
        t__108!


      when 93
        # at line 1:571: T__109
        t__109!


      when 94
        # at line 1:578: T__110
        t__110!


      when 95
        # at line 1:585: T__111
        t__111!


      when 96
        # at line 1:592: T__112
        t__112!


      when 97
        # at line 1:599: T__113
        t__113!


      when 98
        # at line 1:606: T__114
        t__114!


      when 99
        # at line 1:613: T__115
        t__115!


      when 100
        # at line 1:620: T__116
        t__116!


      when 101
        # at line 1:627: T__117
        t__117!


      when 102
        # at line 1:634: T__118
        t__118!


      when 103
        # at line 1:641: T__119
        t__119!


      when 104
        # at line 1:648: T__120
        t__120!


      when 105
        # at line 1:655: ESC
        esc!


      when 106
        # at line 1:659: Quote
        quote!


      when 107
        # at line 1:665: If
        if!


      when 108
        # at line 1:668: Word
        word!


      when 109
        # at line 1:673: Integer
        integer!


      when 110
        # at line 1:681: Real
        real!


      when 111
        # at line 1:686: NL
        nl!


      when 112
        # at line 1:689: COMMENT
        comment!


      when 113
        # at line 1:697: Reductions
        reductions!


      when 114
        # at line 1:708: LINE_COMMENT
        line_comment!


      when 115
        # at line 1:721: WS
        ws!


      end
    end


    # - - - - - - - - - - DFA definitions - - - - - - - - - - -
    class DFA15 < ANTLR3::DFA
      EOT = unpack( 1, -1, 1, 38, 1, -1, 1, 41, 1, 43, 1, 34, 1, 54, 14, 
                    34, 1, 95, 3, 34, 2, -1, 2, 34, 1, 105, 14, -1, 1, 108, 
                    4, 34, 1, 116, 2, 34, 1, 121, 1, 122, 1, -1, 1, 129, 
                    7, 34, 1, 138, 5, 34, 1, 144, 3, 34, 1, 151, 1, 156, 
                    1, 157, 3, 34, 1, 162, 2, 34, 1, 166, 1, 167, 1, 170, 
                    3, 34, 1, -1, 6, 34, 1, -1, 2, 34, 1, 186, 6, 34, 4, 
                    -1, 3, 34, 1, 201, 1, 34, 1, 203, 1, 204, 1, -1, 2, 
                    34, 1, -1, 1, 34, 2, -1, 6, 34, 1, -1, 6, 34, 1, 220, 
                    1, 34, 1, -1, 5, 34, 1, -1, 1, 228, 1, 229, 4, 34, 1, 
                    -1, 1, 234, 2, 34, 3, -1, 2, 34, 1, 240, 1, 34, 1, -1, 
                    3, 34, 2, -1, 2, 34, 1, -1, 2, 34, 1, 249, 1, 250, 5, 
                    34, 1, 256, 1, 34, 1, 260, 3, 34, 1, -1, 1, 266, 1, 
                    267, 1, 34, 1, 269, 2, 34, 1, 272, 6, 34, 2, -1, 1, 
                    34, 2, -1, 10, 34, 1, -1, 2, 34, 1, 292, 1, 293, 1, 
                    -1, 3, 34, 1, 297, 3, 34, 2, -1, 1, 301, 1, 302, 1, 
                    -1, 1, 34, 1, -1, 1, 34, 1, 305, 3, 34, 1, -1, 1, 308, 
                    3, 34, 1, 312, 1, 313, 1, -1, 1, 314, 2, -1, 2, 34, 
                    1, 317, 2, 34, 1, -1, 1, 320, 1, 321, 1, 34, 1, -1, 
                    1, 323, 2, 34, 1, 326, 1, 34, 2, -1, 1, 328, 1, -1, 
                    2, 34, 1, -1, 1, 332, 2, 34, 1, 335, 1, 336, 7, 34, 
                    1, 344, 6, 34, 2, -1, 1, 34, 1, 352, 1, 34, 1, -1, 1, 
                    34, 1, 355, 1, 34, 3, -1, 1, 34, 1, -1, 1, 34, 2, -1, 
                    1, 34, 1, 360, 1, 361, 3, -1, 1, 362, 1, 34, 1, -1, 
                    1, 34, 1, 365, 2, -1, 1, 366, 1, -1, 1, 367, 1, 34, 
                    1, -1, 1, 34, 1, -1, 1, 370, 1, 371, 1, 34, 1, -1, 2, 
                    34, 2, -1, 2, 34, 1, -1, 1, 377, 1, -1, 1, 378, 1, 379, 
                    1, -1, 1, 34, 1, 381, 3, 34, 1, 385, 1, 386, 1, -1, 
                    2, 34, 1, -1, 3, 34, 1, 393, 3, -1, 1, 34, 1, 395, 3, 
                    -1, 1, 34, 3, -1, 1, 34, 1, 155, 1, -1, 1, 398, 1, 34, 
                    3, -1, 1, 400, 1, -1, 1, 401, 1, -1, 1, 34, 2, -1, 5, 
                    34, 2, -1, 1, 34, 1, -1, 1, 409, 1, 410, 1, -1, 1, 411, 
                    2, -1, 1, 34, 1, 413, 1, 414, 2, -1, 1, 415, 4, -1, 
                    1, 34, 3, -1, 1, 34, 1, 418, 1, -1 )
      EOF = unpack( 419, -1 )
      MIN = unpack( 1, 9, 1, 61, 1, -1, 1, 60, 1, 61, 1, 75, 1, 36, 1, 101, 
                    1, 111, 1, 101, 1, 97, 1, 105, 1, 114, 1, 97, 1, 102, 
                    1, 111, 3, 101, 1, 102, 1, 101, 1, 32, 1, 101, 2, 97, 
                    2, -1, 1, 110, 1, 108, 1, 46, 1, 32, 2, -1, 1, 42, 10, 
                    -1, 1, 36, 1, 111, 1, 116, 1, 97, 1, 108, 1, 36, 1, 
                    97, 1, 111, 1, 32, 1, 36, 1, -1, 1, 36, 1, 103, 1, 116, 
                    1, 110, 1, 102, 1, 110, 1, 99, 1, 100, 1, 36, 1, 101, 
                    1, 110, 1, 111, 1, 110, 1, 101, 1, 36, 1, 100, 1, 119, 
                    1, 114, 1, 36, 1, 32, 1, 36, 1, 121, 1, 115, 1, 107, 
                    1, 36, 1, 116, 1, 118, 3, 36, 1, 116, 1, 101, 1, 100, 
                    1, -1, 1, 116, 1, 110, 1, 97, 1, 109, 1, 105, 1, 99, 
                    1, -1, 1, 104, 1, 97, 1, 36, 1, 108, 1, 110, 1, 101, 
                    1, 116, 1, 108, 1, 101, 4, -1, 1, 118, 1, 101, 1, 105, 
                    1, 32, 1, 105, 2, 36, 1, -1, 1, 114, 1, 117, 1, -1, 
                    1, 100, 2, -1, 1, 111, 1, 105, 1, 111, 1, 101, 1, 105, 
                    1, 119, 1, -1, 1, 103, 1, 32, 1, 115, 1, 105, 1, 101, 
                    1, 104, 1, 36, 1, 97, 1, -1, 1, 114, 1, 105, 1, 109, 
                    1, 99, 1, 97, 1, -1, 2, 36, 2, 101, 1, 32, 1, 101, 1, 
                    -1, 1, 36, 1, 116, 1, 111, 3, -1, 1, 102, 1, 115, 1, 
                    36, 1, 101, 1, -1, 1, 104, 2, 101, 2, -1, 1, 101, 1, 
                    111, 1, -1, 1, 32, 1, 114, 2, 36, 1, 99, 1, 108, 1, 
                    101, 1, 110, 1, 107, 1, 36, 1, 116, 1, 36, 2, 115, 1, 
                    111, 1, -1, 2, 36, 1, 116, 1, 36, 1, 114, 1, 108, 1, 
                    36, 1, 104, 1, 101, 1, 97, 1, 101, 1, 114, 1, 110, 2, 
                    -1, 1, 103, 2, -1, 1, 116, 1, 110, 1, 101, 1, 114, 1, 
                    110, 1, 119, 1, 97, 1, 100, 2, 101, 1, -1, 1, 105, 1, 
                    110, 2, 36, 1, -1, 1, 108, 1, 121, 1, 115, 1, 36, 1, 
                    116, 1, 121, 1, 116, 2, -1, 2, 36, 1, -1, 1, 32, 1, 
                    -1, 1, 101, 1, 36, 1, 117, 2, 32, 1, -1, 1, 36, 1, 111, 
                    1, 114, 1, 110, 2, 36, 1, -1, 1, 36, 2, -1, 1, 101, 
                    1, 108, 1, 36, 1, 107, 1, 115, 1, -1, 2, 36, 1, 101, 
                    1, -1, 1, 36, 1, 101, 1, 117, 1, 36, 1, 101, 2, -1, 
                    1, 36, 1, -1, 2, 101, 1, -1, 1, 36, 2, 115, 2, 36, 1, 
                    115, 1, 104, 1, 32, 1, 100, 1, 32, 1, 101, 1, 100, 1, 
                    36, 1, 116, 2, 101, 1, 114, 1, 100, 1, 101, 2, -1, 1, 
                    115, 1, 36, 1, 104, 1, -1, 1, 105, 1, 36, 1, 101, 3, 
                    -1, 1, 97, 1, -1, 1, 108, 2, -1, 1, 100, 2, 36, 3, -1, 
                    1, 36, 1, 101, 1, -1, 1, 121, 1, 36, 2, -1, 1, 36, 1, 
                    -1, 1, 36, 1, 103, 1, -1, 1, 32, 1, -1, 2, 36, 1, 117, 
                    1, -1, 1, 115, 1, 101, 2, -1, 2, 116, 1, -1, 1, 36, 
                    1, -1, 2, 36, 1, -1, 1, 104, 1, 36, 1, 110, 1, 32, 1, 
                    101, 2, 36, 1, -1, 1, 101, 1, 111, 1, -1, 1, 114, 1, 
                    100, 1, 108, 1, 32, 3, -1, 1, 114, 1, 36, 3, -1, 1, 
                    104, 3, -1, 1, 116, 1, 36, 1, -1, 1, 36, 1, 121, 3, 
                    -1, 1, 36, 1, -1, 1, 36, 1, -1, 1, 114, 2, -1, 1, 100, 
                    1, 110, 2, 32, 1, 121, 2, -1, 1, 32, 1, -1, 2, 36, 1, 
                    -1, 1, 36, 2, -1, 1, 105, 2, 36, 2, -1, 1, 36, 4, -1, 
                    1, 110, 3, -1, 1, 103, 1, 36, 1, -1 )
      MAX = unpack( 1, 122, 1, 61, 1, -1, 2, 61, 1, 75, 1, 122, 1, 117, 
                    2, 111, 1, 118, 1, 117, 1, 116, 1, 111, 1, 115, 1, 111, 
                    1, 116, 2, 101, 1, 118, 1, 101, 1, 122, 1, 111, 1, 97, 
                    1, 105, 2, -1, 1, 110, 1, 108, 2, 57, 2, -1, 1, 47, 
                    10, -1, 1, 122, 1, 111, 1, 116, 1, 97, 1, 114, 1, 122, 
                    1, 97, 1, 111, 2, 122, 1, -1, 1, 122, 1, 103, 1, 116, 
                    1, 110, 1, 102, 1, 110, 1, 99, 1, 100, 1, 122, 1, 101, 
                    1, 110, 1, 111, 1, 110, 1, 101, 1, 122, 1, 118, 1, 119, 
                    1, 114, 3, 122, 1, 121, 1, 116, 1, 107, 1, 122, 1, 116, 
                    1, 118, 3, 122, 1, 116, 1, 101, 1, 100, 1, -1, 1, 116, 
                    1, 110, 1, 97, 1, 109, 1, 105, 1, 99, 1, -1, 1, 104, 
                    1, 114, 1, 122, 1, 114, 1, 115, 1, 111, 1, 116, 1, 108, 
                    1, 101, 4, -1, 1, 118, 1, 101, 1, 105, 1, 122, 1, 105, 
                    2, 122, 1, -1, 1, 114, 1, 117, 1, -1, 1, 100, 2, -1, 
                    1, 111, 1, 105, 1, 111, 1, 101, 1, 105, 1, 119, 1, -1, 
                    1, 103, 1, 32, 1, 115, 1, 105, 1, 101, 1, 104, 1, 122, 
                    1, 97, 1, -1, 1, 114, 1, 105, 1, 109, 1, 110, 1, 97, 
                    1, -1, 2, 122, 2, 101, 1, 32, 1, 101, 1, -1, 1, 122, 
                    1, 116, 1, 111, 3, -1, 1, 102, 1, 115, 1, 122, 1, 101, 
                    1, -1, 1, 104, 2, 101, 2, -1, 1, 101, 1, 111, 1, -1, 
                    1, 32, 1, 114, 2, 122, 1, 99, 1, 108, 1, 101, 1, 110, 
                    1, 107, 1, 122, 1, 116, 1, 122, 2, 115, 1, 117, 1, -1, 
                    2, 122, 1, 116, 1, 122, 1, 114, 1, 108, 1, 122, 1, 104, 
                    1, 101, 1, 97, 1, 101, 1, 114, 1, 110, 2, -1, 1, 103, 
                    2, -1, 1, 116, 1, 110, 1, 101, 1, 114, 1, 110, 1, 119, 
                    1, 97, 1, 100, 2, 101, 1, -1, 1, 105, 1, 110, 2, 122, 
                    1, -1, 1, 108, 1, 121, 1, 115, 1, 122, 1, 116, 1, 121, 
                    1, 116, 2, -1, 2, 122, 1, -1, 1, 32, 1, -1, 1, 101, 
                    1, 122, 1, 117, 2, 32, 1, -1, 1, 122, 1, 111, 1, 114, 
                    1, 110, 2, 122, 1, -1, 1, 122, 2, -1, 1, 101, 1, 108, 
                    1, 122, 1, 107, 1, 115, 1, -1, 2, 122, 1, 101, 1, -1, 
                    1, 122, 1, 101, 1, 117, 1, 122, 1, 101, 2, -1, 1, 122, 
                    1, -1, 2, 101, 1, -1, 1, 122, 2, 115, 2, 122, 1, 115, 
                    1, 104, 1, 32, 1, 100, 1, 32, 1, 101, 1, 100, 1, 122, 
                    1, 116, 2, 101, 1, 114, 1, 100, 1, 101, 2, -1, 1, 115, 
                    1, 122, 1, 104, 1, -1, 1, 105, 1, 122, 1, 101, 3, -1, 
                    1, 97, 1, -1, 1, 108, 2, -1, 1, 100, 2, 122, 3, -1, 
                    1, 122, 1, 101, 1, -1, 1, 121, 1, 122, 2, -1, 1, 122, 
                    1, -1, 1, 122, 1, 103, 1, -1, 1, 32, 1, -1, 2, 122, 
                    1, 117, 1, -1, 1, 115, 1, 101, 2, -1, 2, 116, 1, -1, 
                    1, 122, 1, -1, 2, 122, 1, -1, 1, 104, 1, 122, 1, 110, 
                    1, 32, 1, 101, 2, 122, 1, -1, 1, 101, 1, 111, 1, -1, 
                    1, 114, 1, 100, 1, 108, 1, 122, 3, -1, 1, 114, 1, 122, 
                    3, -1, 1, 104, 3, -1, 1, 116, 1, 122, 1, -1, 1, 122, 
                    1, 121, 3, -1, 1, 122, 1, -1, 1, 122, 1, -1, 1, 114, 
                    2, -1, 1, 100, 1, 110, 2, 32, 1, 121, 2, -1, 1, 32, 
                    1, -1, 2, 122, 1, -1, 1, 122, 2, -1, 1, 105, 2, 122, 
                    2, -1, 1, 122, 4, -1, 1, 110, 3, -1, 1, 103, 1, 122, 
                    1, -1 )
      ACCEPT = unpack( 2, -1, 1, 3, 22, -1, 1, 105, 1, 106, 4, -1, 2, 111, 
                       1, -1, 1, 108, 1, 114, 1, 115, 1, 2, 1, 1, 1, 5, 
                       1, 6, 1, 4, 1, 8, 1, 7, 10, -1, 1, 10, 33, -1, 1, 
                       77, 6, -1, 1, 78, 9, -1, 1, 109, 1, 110, 1, 112, 
                       1, 9, 7, -1, 1, 17, 2, -1, 1, 22, 1, -1, 1, 23, 1, 
                       25, 6, -1, 1, 26, 8, -1, 1, 40, 5, -1, 1, 48, 6, 
                       -1, 1, 54, 3, -1, 1, 107, 1, 55, 1, 59, 4, -1, 1, 
                       64, 3, -1, 1, 68, 1, 70, 2, -1, 1, 71, 15, -1, 1, 
                       94, 13, -1, 1, 14, 1, 15, 1, -1, 1, 18, 1, 19, 10, 
                       -1, 1, 34, 4, -1, 1, 39, 7, -1, 1, 49, 1, 50, 2, 
                       -1, 1, 53, 1, -1, 1, 56, 5, -1, 1, 62, 6, -1, 1, 
                       74, 1, -1, 1, 76, 1, 79, 5, -1, 1, 85, 3, -1, 1, 
                       87, 5, -1, 1, 95, 1, 97, 1, -1, 1, 99, 2, -1, 1, 
                       102, 19, -1, 1, 37, 1, 38, 3, -1, 1, 44, 3, -1, 1, 
                       51, 1, 52, 1, 113, 1, -1, 1, 58, 1, -1, 1, 61, 1, 
                       63, 3, -1, 1, 72, 1, 73, 1, 75, 2, -1, 1, 82, 2, 
                       -1, 1, 86, 1, 88, 1, -1, 1, 90, 2, -1, 1, 93, 1, 
                       -1, 1, 98, 3, -1, 1, 103, 2, -1, 1, 11, 1, 12, 2, 
                       -1, 1, 20, 1, -1, 1, 24, 2, -1, 1, 29, 7, -1, 1, 
                       42, 2, -1, 1, 46, 4, -1, 1, 67, 1, 69, 1, 80, 2, 
                       -1, 1, 84, 1, 89, 1, 91, 1, -1, 1, 96, 1, 100, 1, 
                       101, 2, -1, 1, 108, 2, -1, 1, 21, 1, 27, 1, 28, 1, 
                       -1, 1, 31, 1, -1, 1, 33, 1, -1, 1, 36, 1, 41, 5, 
                       -1, 1, 65, 1, 66, 1, -1, 1, 83, 2, -1, 1, 13, 1, 
                       -1, 1, 30, 1, 32, 3, -1, 1, 47, 1, 57, 1, -1, 1, 
                       81, 1, 92, 1, 104, 1, 16, 1, -1, 1, 43, 1, 45, 1, 
                       60, 2, -1, 1, 35 )
      SPECIAL = unpack( 419, -1 )
      TRANSITION = [
        unpack( 1, 36, 1, 32, 1, -1, 1, 36, 1, 31, 18, -1, 1, 36, 1, 32, 
                1, 26, 1, 35, 1, 34, 2, -1, 1, 26, 5, -1, 1, 35, 1, 30, 
                1, 33, 10, 29, 1, 1, 1, 32, 1, 2, 1, 3, 1, 4, 1, 32, 1, 
                -1, 14, 34, 1, 5, 11, 34, 1, -1, 1, 25, 2, -1, 1, 34, 1, 
                -1, 1, 6, 1, 7, 1, 8, 1, 9, 1, 10, 1, 11, 1, 12, 1, 13, 
                1, 14, 1, 15, 1, 34, 1, 16, 1, 17, 1, 18, 1, 19, 1, 28, 
                1, 20, 1, 34, 1, 21, 1, 22, 1, 27, 1, 23, 1, 24, 3, 34 ),
        unpack( 1, 37 ),
        unpack(  ),
        unpack( 1, 39, 1, 40 ),
        unpack( 1, 42 ),
        unpack( 1, 44 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 1, 34, 1, 45, 
                 3, 34, 1, 46, 1, 47, 4, 34, 1, 48, 1, 34, 1, 49, 1, 34, 
                 1, 50, 1, 34, 1, 51, 1, 52, 1, 53, 6, 34 ),
        unpack( 1, 55, 3, -1, 1, 56, 11, -1, 1, 57 ),
        unpack( 1, 58 ),
        unpack( 1, 59, 9, -1, 1, 60 ),
        unpack( 1, 61, 12, -1, 1, 62, 2, -1, 1, 63, 4, -1, 1, 64 ),
        unpack( 1, 65, 8, -1, 1, 66, 2, -1, 1, 67 ),
        unpack( 1, 68, 1, -1, 1, 69 ),
        unpack( 1, 70, 3, -1, 1, 72, 9, -1, 1, 71 ),
        unpack( 1, 73, 7, -1, 1, 74, 4, -1, 1, 75 ),
        unpack( 1, 76 ),
        unpack( 1, 77, 3, -1, 1, 78, 10, -1, 1, 79 ),
        unpack( 1, 80 ),
        unpack( 1, 81 ),
        unpack( 1, 82, 4, -1, 1, 83, 2, -1, 1, 84, 6, -1, 1, 85, 1, 86 ),
        unpack( 1, 87 ),
        unpack( 1, 88, 3, -1, 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 
                 4, 34, 1, 89, 3, 34, 1, 90, 3, 34, 1, 91, 1, 34, 1, 92, 
                 4, 34, 1, 93, 1, 94, 5, 34 ),
        unpack( 1, 96, 2, -1, 1, 97, 6, -1, 1, 98 ),
        unpack( 1, 99 ),
        unpack( 1, 100, 6, -1, 1, 101, 1, 102 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 103 ),
        unpack( 1, 104 ),
        unpack( 1, 106, 1, -1, 10, 29 ),
        unpack( 1, 32, 15, -1, 10, 106 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 107, 4, -1, 1, 35 ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 109 ),
        unpack( 1, 110 ),
        unpack( 1, 111 ),
        unpack( 1, 112, 5, -1, 1, 113 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 3, 34, 1, 114, 
                 20, 34, 1, 115, 1, 34 ),
        unpack( 1, 117 ),
        unpack( 1, 118 ),
        unpack( 1, 119, 3, -1, 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, 
                 -1, 8, 34, 1, 120, 17, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 5, 34, 1, 123, 
                 1, 34, 1, 124, 3, 34, 1, 125, 1, 34, 1, 126, 4, 34, 1, 
                 127, 1, 128, 6, 34 ),
        unpack( 1, 130 ),
        unpack( 1, 131 ),
        unpack( 1, 132 ),
        unpack( 1, 133 ),
        unpack( 1, 134 ),
        unpack( 1, 135 ),
        unpack( 1, 136 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 20, 34, 1, 
                 137, 5, 34 ),
        unpack( 1, 139 ),
        unpack( 1, 140 ),
        unpack( 1, 141 ),
        unpack( 1, 142 ),
        unpack( 1, 143 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 145, 14, -1, 1, 146, 1, 147, 1, -1, 1, 148 ),
        unpack( 1, 149 ),
        unpack( 1, 150 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 155, 3, -1, 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, 
                 -1, 6, 34, 1, 152, 11, 34, 1, 153, 1, 154, 6, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 158 ),
        unpack( 1, 159, 1, 160 ),
        unpack( 1, 161 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 163 ),
        unpack( 1, 164 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 19, 34, 1, 
                 165, 6, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 2, 34, 1, 168, 
                 16, 34, 1, 169, 6, 34 ),
        unpack( 1, 171 ),
        unpack( 1, 172 ),
        unpack( 1, 173 ),
        unpack(  ),
        unpack( 1, 174 ),
        unpack( 1, 175 ),
        unpack( 1, 176 ),
        unpack( 1, 177 ),
        unpack( 1, 178 ),
        unpack( 1, 179 ),
        unpack(  ),
        unpack( 1, 180 ),
        unpack( 1, 181, 3, -1, 1, 182, 3, -1, 1, 183, 5, -1, 1, 184, 2, 
                 -1, 1, 185 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 187, 5, -1, 1, 188 ),
        unpack( 1, 189, 4, -1, 1, 190 ),
        unpack( 1, 191, 3, -1, 1, 192, 5, -1, 1, 193 ),
        unpack( 1, 194 ),
        unpack( 1, 195 ),
        unpack( 1, 196 ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 197 ),
        unpack( 1, 198 ),
        unpack( 1, 199 ),
        unpack( 1, 200, 3, -1, 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, 
                 -1, 26, 34 ),
        unpack( 1, 202 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 205 ),
        unpack( 1, 206 ),
        unpack(  ),
        unpack( 1, 207 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 208 ),
        unpack( 1, 209 ),
        unpack( 1, 210 ),
        unpack( 1, 211 ),
        unpack( 1, 212 ),
        unpack( 1, 213 ),
        unpack(  ),
        unpack( 1, 214 ),
        unpack( 1, 215 ),
        unpack( 1, 216 ),
        unpack( 1, 217 ),
        unpack( 1, 218 ),
        unpack( 1, 219 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 221 ),
        unpack(  ),
        unpack( 1, 222 ),
        unpack( 1, 223 ),
        unpack( 1, 224 ),
        unpack( 1, 225, 10, -1, 1, 226 ),
        unpack( 1, 227 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 230 ),
        unpack( 1, 231 ),
        unpack( 1, 232 ),
        unpack( 1, 233 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 235 ),
        unpack( 1, 236 ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 237 ),
        unpack( 1, 238 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 18, 34, 1, 
                 239, 7, 34 ),
        unpack( 1, 241 ),
        unpack(  ),
        unpack( 1, 242 ),
        unpack( 1, 243 ),
        unpack( 1, 244 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 245 ),
        unpack( 1, 246 ),
        unpack(  ),
        unpack( 1, 247 ),
        unpack( 1, 248 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 251 ),
        unpack( 1, 252 ),
        unpack( 1, 253 ),
        unpack( 1, 254 ),
        unpack( 1, 255 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 257 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 13, 34, 1, 
                 258, 4, 34, 1, 259, 7, 34 ),
        unpack( 1, 261 ),
        unpack( 1, 262 ),
        unpack( 1, 263, 5, -1, 1, 264 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 20, 34, 1, 
                 265, 5, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 268 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 270 ),
        unpack( 1, 271 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 273 ),
        unpack( 1, 274 ),
        unpack( 1, 275 ),
        unpack( 1, 276 ),
        unpack( 1, 277 ),
        unpack( 1, 278 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 279 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 280 ),
        unpack( 1, 281 ),
        unpack( 1, 282 ),
        unpack( 1, 283 ),
        unpack( 1, 284 ),
        unpack( 1, 285 ),
        unpack( 1, 286 ),
        unpack( 1, 287 ),
        unpack( 1, 288 ),
        unpack( 1, 289 ),
        unpack(  ),
        unpack( 1, 290 ),
        unpack( 1, 291 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 294 ),
        unpack( 1, 295 ),
        unpack( 1, 296 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 298 ),
        unpack( 1, 299 ),
        unpack( 1, 300 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 303 ),
        unpack(  ),
        unpack( 1, 304 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 306 ),
        unpack( 1, 307 ),
        unpack( 1, 303 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 309 ),
        unpack( 1, 310 ),
        unpack( 1, 311 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 315 ),
        unpack( 1, 316 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 318 ),
        unpack( 1, 319 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 322 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 324 ),
        unpack( 1, 325 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 327 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 329 ),
        unpack( 1, 330 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 14, 34, 1, 
                 331, 11, 34 ),
        unpack( 1, 333 ),
        unpack( 1, 334 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 337 ),
        unpack( 1, 338 ),
        unpack( 1, 339 ),
        unpack( 1, 340 ),
        unpack( 1, 341 ),
        unpack( 1, 342 ),
        unpack( 1, 343 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 345 ),
        unpack( 1, 346 ),
        unpack( 1, 347 ),
        unpack( 1, 348 ),
        unpack( 1, 349 ),
        unpack( 1, 350 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 351 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 353 ),
        unpack(  ),
        unpack( 1, 354 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 356 ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 357 ),
        unpack(  ),
        unpack( 1, 358 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 359 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 363 ),
        unpack(  ),
        unpack( 1, 364 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 368 ),
        unpack(  ),
        unpack( 1, 369 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 372 ),
        unpack(  ),
        unpack( 1, 373 ),
        unpack( 1, 374 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 375 ),
        unpack( 1, 376 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 380 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 382 ),
        unpack( 1, 383 ),
        unpack( 1, 384 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 387 ),
        unpack( 1, 388 ),
        unpack(  ),
        unpack( 1, 389 ),
        unpack( 1, 390 ),
        unpack( 1, 391 ),
        unpack( 1, 392, 3, -1, 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, 
                 -1, 26, 34 ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 394 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 396 ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 397 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 399 ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 402 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 403 ),
        unpack( 1, 404 ),
        unpack( 1, 405 ),
        unpack( 1, 406 ),
        unpack( 1, 407 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 408 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 412 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 416 ),
        unpack(  ),
        unpack(  ),
        unpack(  ),
        unpack( 1, 417 ),
        unpack( 1, 34, 28, -1, 26, 34, 4, -1, 1, 34, 1, -1, 26, 34 ),
        unpack(  )
      ].freeze

      ( 0 ... MIN.length ).zip( MIN, MAX ) do | i, a, z |
        if a > 0 and z < 0
          MAX[ i ] %= 0x10000
        end
      end

      @decision = 15


      def description
        <<-'__dfa_description__'.strip!
          1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | ESC | Quote | If | Word | Integer | Real | NL | COMMENT | Reductions | LINE_COMMENT | WS );
        __dfa_description__
      end

    end


    private

    def initialize_dfas
      super rescue nil
      @dfa15 = DFA15.new( self, 15 )


    end

  end # class Lexer < ANTLR3::Lexer

  at_exit { Lexer.main( ARGV ) } if __FILE__ == $0

end

