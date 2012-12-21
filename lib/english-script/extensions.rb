class Object
  def log *x
    puts x
  end

  def debug *x
    puts x
  end
end

class Nil
  def blank?
      return true
  end
end

class Hash
  def contains key
     keys.contains key
  end
end

class Array
  #EVIL!!
  def blank?
    nil? or empty?
  end
  def contains x
    index x
  end
end

class TrueClass
  def blank?
    false
  end
end

class FalseClass
  def blank?
    true
  end
end

class String

  def is_noun
    not synsets(:noun).empty?
  end
  def is_verb
    not synsets(:verb).empty?
  end
  def is_adverb
    not synsets(:adverb).empty?
  end
  def is_adjective
    not synsets(:adjective).empty?
  end

  def examples
    synsets.flatten.map(&:hyponyms).flatten.map(&:words).flatten.uniq.map &:to_s
  end

  def blank?
    nil? or empty?
  end

  def lowercase
    downcase
  end

  def lowercase!
    downcase!
  end

  def replace_numerals
    gsub!(/([a-z])-([a-z])/,"\\1+\\2")
    gsub!("a couple of","2")
    gsub!("a dozen","12")
    gsub!("ten"     ,"10")
    gsub!("twenty"  ,"20")
    gsub!("thirty"  ,"30")
    gsub!("forty"   ,"40")
    gsub!("fifty"   ,"50")
    gsub!("sixty"   ,"60")
    gsub!("seventy" ,"70")
    gsub!("eighty"  ,"80")
    gsub!("ninety"  ,"90")
    gsub!("ten","10")
    gsub!("eleven","11")
    gsub!("twelve"  ,"12")
    gsub!("thirteen","13")
    gsub!("fourteen","14")
    gsub!("fifteen" ,"15")
    gsub!("sixteen" ,"16")
    gsub!("seventeen","17")
	gsub!("eighteen","18")
	gsub!("nineteen","19")
	gsub!("tenth","10")
	gsub!("ninth","9")
	gsub!("eighth","8")
	gsub!("seventh","7")
	gsub!("sixth","6")
	gsub!("fifth","5")
	gsub!("fourth","4")
	gsub!("third","3")
	gsub!("second","2")
	gsub!("first","1")
	gsub!("ten","10")
	gsub!("nine","9")
	gsub!("eight","8")
	gsub!("seven","7")
	gsub!("six","6")
	gsub!("five","5")
	gsub!("four","4")
	gsub!("three","3")
	gsub!("two","2")
	gsub!("one","1")
	gsub!("dozen","12")
	gsub!("couple","2")
	gsub!(" hundred thousand"," 100000")
	gsub!(" hundred"," 100")
	gsub!(" thousand"," 1000")
	gsub!(" million"," 1000000")
	gsub!(" billion"," 1000000000")
	gsub!("hundred thousand","*100000")
	gsub!("hundred ","*100")
	gsub!("thousand ","*1000")
	gsub!("million ","*1000000")
	gsub!("billion ","*1000000000")
    end


    def parse_integer
      replace_numerals
      eval(self).to_i
    end

end

#return true if self==false
#return false if self==true
