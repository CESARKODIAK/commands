class My

  def self.method_missing method, *args, &block
    user_context="Karsten"
    name=method.to_s
#    n=Node.get(:name=>name, :context=>user_context)
    n=Node.get name
    n.value=args[0] if args.length>0
    if block_given?
#      n.value=block.call rescue nil
      n.evaluate &block
      #todo: New.word{a,b,c}
    end
    return n
  end

end


class New
  def self.method_missing method, *args, &block
    user_context="Karsten"
    name=method.to_s
#    n=Node.get(:name=>name, :context=>user_context)
    n=Node.get name
    n.value=args[0] if args.length>0
    if block_given?
#      n.value=block.call rescue nil
      n.evaluate &block
      #todo: New.word{a,b,c}
    end
    return n
  end
end

