#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w
require 'RMagick'

img = Magick::Image.read('images/Flower_Hat.jpg').first

img = img.roll(img.columns/4, img.rows/4)

img.write('roll.jpg')
exit
