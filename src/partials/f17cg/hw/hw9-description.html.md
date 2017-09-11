```
cacheable: false
```

[Starter files](/~tmullen/secure/f17cg/cs315-hw9.zip)


## Exercise 1: Cubic Bezier interpolation

In this exercise you'll implement cubic Bezier interpolation. Your task will be to position the green ball so that it interpolates along the Bezier curve as shown:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/bezier.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

The Bezier curve line itself is in the starter file; it uses the Three.js CubicBezierCurve3 object. Placing the green ball according to the t parameter will require reviewing the definition of cubic Bezier curves, which can be found in lecture slides and in your *3D Math Primer* textbook. 


## Exercise 2: Quadratic Bezier interpolation

In this exercise you're going to get a little more practice with Bezier curves, interpolation, vectors, and setting up a scene in Three.js. The exercise is similar to the cubic Bezier curve exercise from previously, except for a few alterations. First, the curve is a quadratic curve, so the polynomial used to interpolate the curve is different. Secondly, you are to add two more balls indicating the linear interpolations between control points, shown in yellow in the video, as well as a yellow line joining them. Finally, there is a lot less starter code to work from, so you'll need to review the previous assignment's starter code (and/or Three.js online documentation) and add much of the necessary content from scratch.  

Your scene should behave as shown here:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/quadraticBezier.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

## Exercise 3: Sphere normals

A *normal* is a vector that extends from a surface perpendicular to the surface. Normals distinguish the front from the back of a surface and are used for a variety of purposes. Most importantly for this course, normals are used to calculate how light reflects from a surface. 

For triangles, normals are calculated by using the cross product of vectors representing two of the triangle's edges. For spheres, the normal of a surface point is collinear with the line that passes through the point and the center of the sphere. A normal is always of unit length. 

In this exercise, you'll place a cone such that it indicates the direction of the normal extending from the point represented by the purple ball on the surface of the sphere. The ball can be moved around with your mouse, and the arrow should always point in the direction of the normal at that point. 

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/sphereNormal.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

Although the normal vector itself is always a unit vector, we can draw it longer to make it visible in the display. In this exercise, the display length of the arrow will correspond to the 'Normal Display' slider. The slider should represent the distance between the surface point and the cone. This distance should remain constant regardless of how the sphere is scaled. 


## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla (this should be a separate directory from Hws 7 and 8. Duplicate the files from  Hw 8 to work on this one). Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** 

In Moodle, submit **only** the link to your assignment directory on the shared server containing the fully implemented assignment and readme.txt.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407325).