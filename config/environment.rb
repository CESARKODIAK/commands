# Load the rails application
require File.expand_path('../application', __FILE__)

# Initialize the rails application
EnglishScript::Application.initialize!

Mime::Type.register "image/svg+xml", :svg
