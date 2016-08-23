```
cacheable: false
```

## Overview

In this exercise you're going to add some mouse-based interaction to the koosh ball scene requiring a bit of vector manipulation, enabling the user to spin the koosh ball by swiping the mouse across the canvas. It's a good example of the kind of problems that often arise in creating natural user interfaces with 3D content, and it's good practice for working with vectors in Three.js. Your reading on rotation from *3D Math Primer for Graphics* will be relevant for the concepts, and you'll need to refer to the [Three.js documentation](http://threejs.org/docs/api/math/Vector3.html) for `Vector3` objects. (You'll use `Vector3` extensively later in the term when you work on your ray tracer, so it's good to get familiar with these operations).

## Getting started

You'll start with the files in [this zip archive](/~tmullen/cg/f16/cs315-hw4.zip). Everything you need to complete the assignment is in this archive. As you can see, this is based on the koosh ball from assignment 3, but there have been some changes made. The method of rotating the cylinders is different (if you're reading ahead, you should use the method of setting the matrix directly for homework 3, rather than the quaternion approach used here), and the way the cylinders are added to the scene is different. In this example, we use an `Object3D` object to group the cylinders into a single object called `kooshball` before adding that to the scene as a unit. This will enable us to access and manipulate the whole koosh ball as a single object, which is what we need to do here. Finally, the orbit controls have been removed. We won't use the mouse to rotate the whole scene.

## Spinning the koosh ball

The objective of this assignment is to set up mouse interaction that works as shown in this movie:

<video width="320" height="240" controls>
  <source src="/~tmullen/images/cg/kooshSwipe.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

When the mouse button is pushed and the mouse moved, the ball responds to the swipe by spinning as if it has been swiped, i.e. around the axis perpendicular to the direction of the swipe. This requires that two things be set up:

* A vector representing the correct rotation axis must be created, and the kooshball object must be made to rotate around that vector.
* The speed of rotation must be set based on the speed of the swiping motion, then made to slow down and stop after a few seconds pass.

### Rotation axis

The axis of rotation is perpendicular to the direction of the swipe, like this:

![Starter Image](/~tmullen/images/cg/kooshswipe.png)

In order to find that vector, you'll first need to find a vector for the swipe itself. Much of this is done for you in the code. The function `getMousePoint` returns a vector representing the position of the mouse in 3D parallel to the view plane (specifically on the *z* = 0 plane from the camera view). As you can see in the starter code `swipeBegin` and `swipeEnd` are already in place with the values you need to find this vector. Refer to the `Vector3` API to see how to use vector subtraction to find the vector between them.

Once you've got the swipe vector, you'll need to find the perpendicular rotation vector. Recall that the vector cross product will return a vector that is orthogonal to two input vectors. You've got a second orthogonal vector in the form of the camera's view direction. Since the camera is pointing at the origin of the space, you can also use the camera's position itself for this. Once again, refer to the `Vector3` API to see how to derive cross products of vectors.

**Note:** Many methods in the `Vector3` API operate on the vector that called them. If you want to make sure that a vector is not altered by calling a method, use the `.clone()` method on the vector to make a duplicate of the vector, and call your method on that.

**Note also:** Many vector operations expect *normalized* vectors. When in doubt, make sure that your vectors are normalized unless you're sure they shouldn't be. In this case, for example, your results will not be as expected if the rotation axis is not normalized.

### Spin speed

The spin speed is derived from the speed of the swipe, and slows down gradually over time. You can get a value representing  the speed of the swipe by dividing the length of the swipe vector by the elapsed time from the `mouseDown` event (use `clock.getElapsedTime()` for this). You'll have to divide this result by a fairly large number to get reasonable radian values for the rotation.

To slow the rotation value, you can put a conditional in the `render` function that checks whether the speed is above some threshold and reduces it if so, otherwise sets it to zero.

## Extra challenge

What if, instead of spinning in the direction you drag the mouse, the ball wound up in that direction as you dragged the mouse, and then spun in the opposite direction when the mouse was released, as if on a spring trigger? Think about the way dragging works in "Angry Birds" for a reference (but rather than flying, the ball spins). If you choose to implement this, submit it as a separate project (in addition to the main assignment project) and make a note in your readme.


## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** The directory should include the completed `README.txt`, which should also be viewable in the browser.


In Moodle, add a link to your finished assignment's public URL **and a screenshot of your project displayed in a browser, with the URL visible**.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340418).
