#!/Users/me/.rvm/rubies/ruby-1.9.3-p125/bin/ruby -w
require 'RMagick'

# Demonstrate the Image#add_noise method
NOISE_TYPES = [Magick::UniformNoise, Magick::GaussianNoise,
               Magick::MultiplicativeGaussianNoise,
               Magick::ImpulseNoise, Magick::LaplacianNoise,
               Magick::PoissonNoise]

img = Magick::Image.read('images/Flower_Hat.jpg').first

NOISE_TYPES.each do |noise|
    copy = img.add_noise(noise)
    copy.write "add_noise_#{noise.to_s}.jpg"

end
exit
