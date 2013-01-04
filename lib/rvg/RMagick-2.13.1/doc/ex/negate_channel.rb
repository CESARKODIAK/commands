#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w
require 'RMagick'

# Demonstrate the Image#negate_channel method

img = Magick::Image.read('images/Flower_Hat.jpg').first
result = img.negate_channel(false, Magick::GreenChannel)
result.write('negate_channel.jpg')
exit
