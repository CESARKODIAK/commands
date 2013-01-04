#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w
require 'RMagick'

# Demonstrate the Image#frame method

img = Magick::Image.read('images/Flower_Hat.jpg').first

img.matte_color="gray75"
img = img.frame

img.write('frame.jpg')
exit
