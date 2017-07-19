```
cacheable: false
```

[Starter files](/~tmullen/secure/f17cg/cs315-hw10.zip)

## Exercise 1: Texture Mapping

In this exercise, you'll animate the texture on four planes by manually setting the UV mapping of their faces. Read about UV mapping in *3D Math Primer*, section 10.5 and about working with UV textures in Three.js in Chapte 10 of *Learning Three.js*, in particular UV mappings in *Advanced Uses of Textures*. Also, read the Three.js online documentation for [Geometry](https://threejs.org/docs/#api/core/Geometry) and experiment with the `faceVertexUvs` array.

The UV mapping values will depend on the slider parameter, resulting in the effect in the video:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/textureMap.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

## Exercise 2: Procedural textures

In this exercise, you'll explore procedural textures. Three.js doesn't support procedural textures on its own, but [TexGen.js](https://github.com/mrdoob/texgen.js/) is a closely-related project by the same lead developer which is easy to incorporate into Three.js. 

There's very little explicit documentation available for this library, unfortunately but there is a good collection of example textures included in the starter files download. Take a look at `examples.html` and `noise.html` in your browser to see how those textures are built up by carrying out arithmetical operators on layers of checkerboard, sine functions, XOR and OR operators (on the y and x values of pixels), noise generators, and so forth. 

For this exercise, you will write 5 procedural textures. For the first four, you should try to emulate what you see in the four corner cubes in the image below. There are some hints in the starter code on how to do this. For the the fifth (middle) cube, you should make up your own original texture. Use at least three components or functions not used in the others, and try to make an interesting and appealing design.

<img src="/~tmullen/images/cg/proceduralTexture.png" width="480" height="360" ></img> 

## Exercise 3: Animated procedural texture

The TexGen.js library also enables animated textures. In the downloads for this exercise, you'll find a file called `animated.html` with examples. For this exercise, you will modify an existing rainbow texture so that it moves, as shown here:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/animatedTexture.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

Read the notes in the code for hints on how to do this. 

## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** 

In Moodle, upload the completed `README.txt` with any necessary questions answered.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340294).
