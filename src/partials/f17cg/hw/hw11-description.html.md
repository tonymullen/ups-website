```
cacheable: false
```

[Starter files](/~tmullen/secure/f17cg/cs315-hw11.zip)

The next two assignments comprise various exercises intended to help prepare you for writing your ray tracer. 

## Exercise 1: Image plane calculation

In your ray tracer starter code, you'll have vector representing the "eye" point (center of projection), an "up" direction vector, and a "look at" vector representing the direction that your camera is pointing. From these vectors, you'll need to determine a rectangular image plane through which to cast your rays. 

This exercise covers the positioning of an image plane in front of a look at vector. The red arrow represents the camera's direction vector, and the Yoda image is positioned orthogonally in front of it, as shown in the video:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/imagePlane.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

There are a number of ways to achieve this effect visually in Three.js, but you'll need to calculate the positions of each vertex of the image plane using cross products between the look-at and the up vectors. Do not use `Object3D` parenting.

Remember that the cross product yields a vector that is orthogonal to the two input vectors. So a cross product between "up" and "look at" will yield a vector that extends orthogonally to one side of the "look at" vector. In turn, the cross product between that orthogonal vector and the "look at" vector will yield a vector pointing in the "local up" direction of the camera. If these direction vectors are all normalized, you can use scalar multiplication and vector addition to position each of the four vertices for the image plane. 


## Exercise 2: Sphere intersection

Another important component of ray tracing is calculating intersection. Begin here with sphere intersection. Refer to the appendix in *3D Math Primer* covering ray-sphere intersection and implement the following behavior:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/sphereIntersection.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>


## Exercise 3: Sphere intersection with matrix transforms

Intersecting a sphere is relatively straightforward, but what if the sphere has been stretched out or rotated by a transformation matrix? It's not much more complicated if you think of transforming the intersection points *along with* the sphere. But simply transforming the intersection points would pull them all out of line with the original segment. To correct this, you first transform the original segment by the *inverse* of the transformation matrix. 

The result you're after is as shown:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/sphereIntersectionMatrix.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

Read the comments and code in the starter file, and read the Three.js online documentation for [Matrix4](https://threejs.org/docs/#api/math/Matrix4) for hints about how to do this.

## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** 

In Moodle, upload the completed `README.txt` with any necessary questions answered.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340294).