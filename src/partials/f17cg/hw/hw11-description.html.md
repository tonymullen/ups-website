```
cacheable: false
```

[Starter files](/~tmullen/secure/f17cg/cs315-hw11.zip)

The next several assignments comprise various exercises intended to help prepare you for writing your ray tracer. 

## Exercise 1: Barycentric coordinates

In this exercise you'll get some more practice with some of the tools you'll
eventually use to implement your ray tracer later. Specifically, you'll get some more 
practice working with THREE.Vector3 objects and with calculating the Barycentric
coordinates of a point with respect to a triangle. This is one way of determining
whether a point on a plane falls within the bounds of a triangle. For determining triangle intersection in a ray tracer, this is the second step, after initially finding the point of intersection on the plane described by the triangle. We looked at plane intersection in the lab, so this exercise follows up from that. 

![Starter Image](/~tmullen/images/cg/barycentricStart.png)

As you'll see when you
run the code in your browser, there is a triangle with vertices represented by
three colored balls. You can grab these with your mouse and move them freely
around the space, changing the dimensions of the triangle. When you do this, the
triangle's normal vector will be updated accordingly, which is illustrated as
a line extending from the center of the triangle perpendicular to its front face.

You'll also see a gray ball located at the center of the triangle's face. This ball
represents a point for which you need to calculate barycentric coordinates with
respect to the triangle. You can drag this ball around. Notice that while
the other balls can be moved freely in 3D space, altering the direction or shape of the triangle,
this ball is constrained to being co-planar with the triangle.

Also, note that when any of the other balls are moved, the gray ball jumps back
to the center of the triangle. This behavior should change in the finished assignment.

### Calculating barycentric coordinates

You will need to assign appropriate values to the variables `b1`, `b2`, `b3`,
(barycentric coordinates) and `inTriangle`, a boolean representing whether <em>p</em>
 is located on a point within the triangle. The variables are already declared,
 you just need to calculate their values. Do this in the
  `recalculateBarycentricCoords()` function, which begins on line 367 of the
  starter file script.

Use the approach described in pp 328-329 of "3D Math Primer for Graphics and
Game Development" to calculate the barycentric coordinates using vector cross
products. **Don't use the THREE.js built-in barycentric coords functionality.**
The point of this exercise is to do these by hand, and specifically to do so using
cross products and THREE.Vector3 objects.

The finished program will work as shown below. The gray ball should change color
depending on its barycentric coordinates such that as it approaches the red vertex
it becomes increasingly red, etc. When the ball is moved outside the bounds
of the triangle, it turns black and the component triangles shown in red, green,
and blue disappear. Note also that when the vertices of the triangle are altered,
the ball maintains its position with respect to its barycentric coordinates on the
triangle, and its Cartesian coordinates are updated accordingly.

Here is how the finished assignment should behave:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/barycentric.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

All of the behavior has already been implemented. All you need to do are
calculate the barycentric coordinates and set the `inTriangle` boolean.

### Extra challenge

Add two GUI sliders representing two of the three barycentric coordinates. The sliders should each range from -1.0 to 2.0. Assume the third coordinate is the difference between the sum of the first two and 1.0. Enable the user to position the ball in space by adjusting the sliders. Values of 0.333, 0.333 in the sliders should position the ball in the center of the triangle. If any of the coordinates is less than zero or greater than 1, the ball should be outside the triangle.


## Exercise 2: Triangle reflection

Once you've determined whether and where your ray hits a triangle, you need to determine what direction it bounces off. Your file contains an adjustable triangle, a "light source" (green ball) and a reflection vector (red arrow). The yellow ball represents the point of intersection between the ray and the triangle, and it is also draggable. 

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/triangleReflection.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

The red cone should be the same distance from the surface intersection point as the green ball, in the direction of reflection off the surface. Calculating the reflection vector will require normalizing certain vectors, so you'll need to remember to multiply the correct magnitude at the end. 

Refer to the class slides and to the Shirley reading for calculating the reflection vector. It is also discussed in Chapter 10.6 of *3D Math Primer*, so you may want to review that also. 

## Exercise 3: Phong reflection

In this exercise, you'll implement a simulation of the Phong reflection model. This entails several steps:
  * **Calculate the light reflection vector** This is essentially identical to what you did in lab 9 with sphere reflection. You can copy and paste most of the code from that solution with a few small adjustments. 
  * **Calculate the diffuse lighting component** The diffuse color is dark slate gray, which is the color used for the sphere object. The brightness of the diffuse component depends on the directness of the light source (assume the light source, represented by the sunshine model, is 100% white). The range of color for the diffuse component then is between 0 (black) and the full brightness of the dark slate gray color. The surface point ball material should take this color when the "diffuse" option is selected in the GUI. 
  * **Calculate the specular lighting component** The specular color is white, so the range of specular highlight values is between 0 and 1. When the "specular" lighting option is selected in the GUI the surface point ball will take the color of the specular component (black to white). Specular highlights depend upon the direction of the eye vector with respect to the reflected light vector, and so vary with the movement of the eye with respect to the surface point. 
  
The result will work like this:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/phongReflection.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>


## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** 

In Moodle, submit **only** the link to your assignment directory on the shared server containing the fully implemented assignment and readme.txt.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407327).