#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w
require 'RMagick'

# Demonstrate Image#shade

img = Magick::Image.read('images/Flower_Hat.jpg').first

img = img.shade(true, 50, 50)

img.write('shade.jpg')
exit
