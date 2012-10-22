class Parser
def aa
  puts "aa"
end
def bb
  raise NotMatching.new(test)
  #throw NotMatching.new NOT rescued!!!
end
def cc
  puts "cc"
  return "cc"
end
def dd
  puts "dd"
  throw "dd"
end

def test_any
  @@string="a b c d"
  one :aa,:bb,:cc
  any{
    try{puts "a"}
    try{puts "b"}
    try{raise NotMatching.new}
    try{puts "c"}
    try{throw "b"}
    try{puts "b"}
  }

end


def test_action
  @@string="eat a sandwich; done"
  #@@string="bash 'ls'"
  #verb and nod
  action
  assert(!@@string.match("sandwich"))
end

def test_method
  @@string="how to print: eat a sandwich; done"
  x=method_definition
  puts x
  #any{method_definition}
end

def test_expression
  @@string="eat a sandwich;"
  x=action
  puts x
end

def raise_test
  raise "test"
end


def test_setter2
  @@string="var x = 8;"
  setter
end

def test_setter
  @@string="let the initial value of I be x"
  setter
end

def test_looper
  @@string="while i is smaller or less then y do\nyawn\nend"
  looper
end

  def test
    begin
    test_setter2
    #  test_looper
    puts "PARSED successfully!"
      show_tree rescue puts "no tree"
    rescue => e
      error e
    end
  end


# grammar : 'hello' QUESTION ('does'| QUESTION)* 'the world'? VERB
  def test_root
    #token "hello"
    #question
    #star{
    #  try{token 'does'} || try{question}
    #}
    #_? 'the world'
    #verb
    puts "Parsed successfully!"
  end

end
