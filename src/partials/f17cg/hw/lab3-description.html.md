```
cacheable: false
```

Download the starter files [here](/~tmullen/secure/f17cg/cs315-lab3.zip).

## Matrix transformations

In this exercise you'll work directly with 3D transformation matrices. Normally, in Three.js, you'd use API functions to set or alter the location, rotation, and scale of an object, and let Three.js handle the matrix behind the scenes. But in this exercise we've turned off auto updating for the knight object's matrix and we'll set the matrix values manually. The result should behave as shown in the video:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/chessKnight.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

You'll set values for nine different matrices, each representing a single transformation (translation, scaling, rotation) on a single axis (x, y, z). You'll use the `params` object values to base the transformations on the GUI sliders. 

Rotation and scaling matrices are covered in depth in Chapter 5 of *3D Math Primer* and translation is covered in section 6.4. You should also find most of what you need in recent lecture slides. 
