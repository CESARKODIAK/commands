#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w

require 'RMagick'

img = Magick::Image.read('images/Flower_Hat.jpg').first
result = img.posterize
result.write('posterize.jpg')
exit
