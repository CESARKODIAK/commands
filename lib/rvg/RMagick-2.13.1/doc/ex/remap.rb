#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w
require 'RMagick'

img = Magick::Image.read("images/Flower_Hat.jpg").first
rose = Magick::Image.read("images/Yellow_Rose.miff").first
begin
   img.affinity(rose)
rescue NotImplementedError
   img = Magick::Image.read("images/notimplemented.gif").first
end
img.write("remap.jpg")

