#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w

require 'RMagick'

img = Magick::Image.read("images/Flower_Hat.jpg").first
preview = img.preview(Magick::SolarizePreview)
preview.minify.write('preview.jpg')
exit

