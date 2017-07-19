```
cacheable: false
```

Download the necessary files [here](/~tmullen/secure/f17cg/cs315-lab5.zip).

## Spherical linear interpolation

Spherical linear interpolation (slerp) lets us use linear interpolation techniques to interpolate between 
points on a sphere. 



<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/slerp2.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

As you'll see in the homework, we can use an extension of slerp to interpolate between 3D orientations by 
regarding orientations as analogous to points on a 4-dimensional sphere (quaternions). 