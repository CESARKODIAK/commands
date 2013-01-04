#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w

require 'RMagick'

img = Magick::Image.read('images/Flower_Hat.jpg').first
sepiatone = img.sepiatone(Magick::QuantumRange * 0.8)
sepiatone.write('sepiatone.jpg')

