#!/usr/bin/env ruby
# require_relative "~/english-script/english-script/english-parser.rb"

# AddHandler cgi-script .cgi .pl .rb .py  #in apache
puts "Content-Type: text/html \n\n" #wichtig
require 'cgi'
params = CGI.new
$stderr.puts "Remote Addr: #{params.remote_addr}"
query = params['q'] #simple as that!!!!!!!

puts '
<img english-script="English script.png" height=50/>
<table><tr>
<td><form><TEXTAREA rows=20 cols=100 name="q">'+query+'
</TEXTAREA><br/><input type="submit"/></form></td>
<td><svg id="svg"
 xmlns="http://www.w3.org/2000/svg"
 xmlns:xlink="http://www.w3.org/1999/xlink"
 width="300" height="300">
 <circle cx="100" cy="50" r="40" stroke="black" stroke-width="2" fill="red" id="circle"/>
 <circle r="40" stroke="black" stroke-width="2" fill="red" id="circle"/>
</svg></td></tr><table>
<script english-script=""/>
<script>
var svg=document.getElementById("svg");
var r= rect(100,100,"blue");
add(r);
animate(r);
</script>
'

begin
  # require "/Users/me/english-script/english-script/english-parser.rb"

  # puts query
  ruby="/Users/me/.rvm/wrappers/ruby-1.9.3-p125/ruby"
  parser="/Users/me/english-script/english-script/english-parser.rb"
  result=%x[#{ruby} #{parser} "#{query}"]
  puts "<div>"+result.gsub("\n","<br/>")+"</div>"
   # you   "~/english-script/english-script/english-parser.rb "+query
  # javascript=EnglishParser.new.start.javascript
  # puts EnglishParser.new.start
  # javascript='svg.style.fill="blue";'
  puts "<script>"+result+"</script>"
rescue
  puts $!
end
