#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w
require 'RMagick'

# Demonstrate the Image#normalize method

img = Magick::Image.read('images/Hot_Air_Balloons.jpg').first

img = img.normalize

img.write('normalize.jpg')
exit
