class Object
  def blank?
    return true if self==false
    return false if self==true
    nil? or empty?
  end
end
