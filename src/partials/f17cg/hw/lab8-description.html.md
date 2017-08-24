```
cacheable: false
```

Download the necessary files [here](/~tmullen/secure/f17cg/cs315-lab8.zip).

## Textured plane

In this exercise you'll get acquainted with UV mapping in Three.js. You'll use similar tools and techniques in assignment 10.

UV mapping is a way to associate a 2D texture with geometric positions (vertices) on the surface of a 3D object. By changing the mapping, we can alter the way the texture appears on a surface. You should read about UV mapping in *3D Math Primer*, section 10.5 and about working with UV textures in Three.js in Chapter 10 of *Learning Three.js*, in particular UV mappings in *Advanced Uses of Textures*. Also, read the Three.js online documentation for [Geometry](https://threejs.org/docs/#api/core/Geometry) and experiment with the `faceVertexUvs` array.

In this lab, you'll be mimicking a zoom effect by altering the UV mapping of an image on a plane, as shown here:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/texturePlane.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

Read the code and docs to determine how to use the `params.zoom` value to alter the texture mapping to get this effect. 