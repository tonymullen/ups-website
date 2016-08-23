```
cacheable: false
```

## Overview

In this exercise you'll get some preparation with some of the tools you'll
eventually use to implement your ray tracer later. Specifically, you'll get some
practice working with THREE.Vector3 objects and with calculating the Barycentric
coordinates of a point with respect to a triangle. This is one way of determining
whether a point on a plane falls within the bounds of a triangle.

## Starter files

You'll start with the files in [this zip archive](/~tmullen/cg/cs315-hw10.zip).

![Starter Image](/~tmullen/images/cg/barycentricStart.png)

This file contains the starter code in HTML and JavaScript. As you'll see when you
run the code in your browser, there is a triangle with vertices represented by
three colored balls. You can grab these with your mouse and move them freely
around the space, changing the dimensions of the triangle. When you do this, the
triangle's normal vector will be updated accordingly, which is illustrated as
a line extending from the center of the triangle perpendicular to its front face.

You'll also see a gray ball located at the center of the triangle's face. This ball
represents a point for which you need to calculate barycentric coordinates with
respect to the triangle. You can drag this ball around. Notice that unlike
the other balls, this ball is constrained to being co-planar with the triangle.

Also, note that when any of the other balls are moved, the gray ball jumps back
to the center of the triangle.

## Calculating barycentric coordinates

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

<video width="320" height="240" controls>
  <source src="/~tmullen/images/cg/barycentric.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

All of the behavior has already been implemented. All you need to do are
calculate the barycentric coordinates and set the `inTriangle` boolean.

## Extra challenge

Add two GUI sliders representing two of the three barycentric coordinates. The sliders should each range from -1.0 to 2.0. Assume the third coordinate is the difference between the sum of the first two and 1.0. Enable the user to position the ball in space by adjusting the sliders. Values of 0.333, 0.333 in the sliders should position the ball in the center of the triangle. If any of the coordinates is less than zero or greater than 1, the ball should be outside the triangle. 


## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** The directory should include the completed `README.txt`, which should also be viewable in the browser.

In Moodle, add a link to your finished assignment's public URL **and a screenshot of your project displayed in a browser, with the URL visible**.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340424).
