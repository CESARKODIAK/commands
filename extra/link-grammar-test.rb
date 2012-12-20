#!/usr/bin/ruby

# require 'rubygems'
require 'linkparser'
dict = LinkParser::Dictionary.new( 'en' )
sent = dict.parse( "my beautiful mother loves these universal programs very very much")
 # sent = dict.parse( "People use Ruby for all kinds of nifty things." )
 # => #<LinkParser::Sentence:0xcf8eb "LEFT-WALL people use Ruby for all kinds
 #      of nifty things . RIGHT-WALL"/2 linkages/0 nulls>

 puts sent.subject        # => "people"
 puts sent.verb           # => "use"
 puts sent.object         # => "Ruby"

 puts sent.constituent_tree_string