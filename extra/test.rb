#!/usr/bin/env ruby
class Object
  def blank?
    return true if self==false
    return false if self==true
    nil? or empty?
  end
  def log *x
    # puts x
  end
  def debug *x
    # puts x
  end
  
end

# https://github.com/ged/linguistics
# require 'rspec'
require 'linguistics'
Linguistics.use( :en, monkeypatch: true )
puts "goose".plural