#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w
require 'RMagick'

# Demonstrate the crop_resize method

img = Magick::Image.read('images/Flower_Hat.jpg')[0]
thumbnail = img.resize_to_fit(76, 76)
thumbnail.write("resize_to_fit.jpg")


