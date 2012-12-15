class Interpretation
  attr_accessor :result,:methods,:ruby_methods,:svg,:javascript,:variables,:context
  attr_accessor :root,:tree,:nodes  # needs method interception which might not be available in debugging
end
