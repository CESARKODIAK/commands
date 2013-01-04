#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w
require 'RMagick'

# Demonstrate the Image#blur_image method

img = Magick::Image.read('images/Flower_Hat.jpg').first

img = img.motion_blur(0,7,180)

img.write('motion_blur.jpg')
exit
