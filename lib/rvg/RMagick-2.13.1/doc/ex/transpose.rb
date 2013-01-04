#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w
require 'RMagick'

# Demonstrate the Image#transpose method

img = Magick::Image.read('images/Flower_Hat.jpg').first
img = img.transpose
img.write('transpose.jpg')
exit
