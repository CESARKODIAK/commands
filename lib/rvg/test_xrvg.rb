require 'xrvg'
include XRVG

render = SVGRender[ :filename, "sample.svg",:imagesize,"600px",:background, Color.white ]

palette  = Palette[ :colorlist, [ 0.0, Color.blue,   0.25,  Color.orange,  
                                  0.5, Color.yellow, 0.75,  Color.green,
                                  1.0, Color.blue] ]

point0=V2D::O #V2D[2.0,2.0]
radius0=1.0
# circle=Circle[]
circle=Circle[ :center, point0, :radius, radius0]
SyncS[circle, palette, (0.1..0.04).random()].samples(25) do |point, color, radius|
  render.add( Circle[ :center, point, :radius, radius ], Style[ :fill, color ])
end

render.end
