#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w
require 'RMagick'

# Demonstrate the Image#adaptive_threshold method

img = Magick::Image.read("images/Flower_Hat.jpg").first
result = img.adaptive_threshold
result.write("adaptive_threshold.jpg")
exit

