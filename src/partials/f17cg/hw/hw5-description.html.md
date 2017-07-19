```
cacheable: false
```

Download the [starter files](/~tmullen/secure/f17cg/cs315-hw5.zip).

In these exercises you're going to get some practice with vectors and rotations. Your reading on rotation from *3D Math Primer for Graphics* will be relevant for the concepts, and you'll need to refer to the [Three.js documentation](http://threejs.org/docs/api/math/Vector3.html) for `Vector3` objects. (You'll use `Vector3` extensively in this course, and you'll need strong intuitions about it when you work on your ray tracer, so it's good to get familiar with these operations).


## Exercise 1: Fidget Spinner

The goal in this exercise is to implement mouse interaction for this fidget spinner, so that when the user swipes across the canvas the spinner spins accordingly, as shown in this video:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/fidgetSpinner.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

The spinner should spin in the intuitive direction of the swipe, which means that both the direction of the swipe vector and the location of the swipe is relevant to the spin direction (consider a left to right swipe *above* the middle of the spinner as opposed to a left to right swipe *below* the middle of the spinner, which would result in opposing directions of spin).

Read the comments and code in the starter file for hints on how to implement this. Areas of code that need attention are indicated by `TODO:` labels.  

**Hint:** Use a cross product to determine the sign of the spin speed. Think about which vectors you should use to derive this cross product.

## Exercise 2: Soccer Ball

In this exercise you're going to take things a step further than the fidget spinner exercise, enabling the user to spin the soccer ball by swiping the mouse across the canvas. It's a good example of the kind of problems that often arise in creating natural user interfaces with 3D content, and it's more good practice for working with vectors in Three.js. 

The objective of this assignment is to set up mouse interaction that works as shown in this movie:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/soccerBall.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

When the mouse button is pressed and the mouse dragged over the ball, the ball responds to the swipe by spinning as if it has been swiped, i.e. around the axis perpendicular to the direction of the swipe. The ball should rotate freely in any direction, like an idealized version of the way a ball would behave if it were spun while floating in water.  

This requires that two things be set up:

* A vector representing the correct rotation axis must be created, and the soccer ball object must be made to rotate around that vector.
* The speed of rotation must be set based on the speed of the swiping motion, then made to slow down and stop after a few seconds pass.

A further complication in this exercise is that the camera view can be adjusted using the mouse also. When the mouse is dragged while *not* over the ball, the camera view changes. This requires that the code that spins the ball must interact with the Three.js raytracer which determines whether the mouse is over the ball. This also means that calculating the rotation vector will need to take the location of the camera into consideration.

### Rotation axis

The axis of rotation is perpendicular to the direction of the swipe, like this:

![Starter Image](/~tmullen/images/cg/soccerBallVectors.png)

In order to find that vector, you'll first need to find a vector for the swipe itself. Much of this is done for you in the code. The function `getMousePoint` returns a vector representing the position of the mouse in 3D parallel to the view plane (specifically on the *z* = 0 plane from the camera view). As you can see in the starter code `swipeBegin` and `swipeEnd` are already in place with the values you need to find this vector. Refer to the `Vector3` API to see how to use vector subtraction to find the vector between them.

Once you've got the swipe vector, you'll need to find the perpendicular rotation vector. Recall that the vector cross product will return a vector that is orthogonal to two input vectors. You've got a second orthogonal vector in the form of the camera's view direction. Since the camera is pointing at the origin of the space, you can also use the camera's position itself for this. Once again, refer to the `Vector3` API to see how to derive cross products of vectors.

**Note:** Many methods in the `Vector3` API operate on the vector that called them. If you want to make sure that a vector is not altered by calling a method, use the `.clone()` method on the vector to make a duplicate of the vector, and call your method on that.

**Note also:** Many vector operations expect *normalized* vectors. In this case, for example, your results will not be as expected if the rotation axis is not normalized.

### Spin speed

The spin speed is derived from the speed of the swipe, and slows down gradually over time. You can get a value representing  the speed of the swipe by dividing the length of the swipe vector by the elapsed time from the `mouseDown` event (use `clock.getElapsedTime()` for this). You'll have to divide this result by a fairly large number to get reasonable radian values for the rotation.

To slow the rotation value, you can put a conditional in the `render` function that checks whether the speed is above some threshold and reduces it if so, otherwise sets it to zero.

## Exercise 3: Quaternion Slerp

This exercise is related to lab 5, where you looked at spherical linear interpolation (slerp), which enables smooth interpolation over the surface of a sphere (a 2D circle in the lab exercise, but straightforward to extend to 3D). 

Slerp can be used to interpolate between points on a 3D sphere, but what about *orientations* in 3D space? Orientations cannot be represented just with a 3D vector. They need a 3D vector (axis) and a rotation around that axis (twist, or roll). 

In order to use slerp to smoothly interpolate between two orientations in 3D space, we use quaternions, which compactly represent both a 3D vector interpreted as an axis of rotation *and* a rotation around that vector. One of the neat things about (unit) quaternions is that they also behave like points on the surface of a 4 dimensional sphere, and thus can be interpolated between using a version of slerp. 

In the exercise, you'll use quaternion slerp to interpolate the rotation of a pointer between the rotations of two pucks on the surface of a sphere, as shown in this video:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/quaternionSlerp.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

The pucks each have a position, which you can adjust by simply dragging them along the surface of the sphere with your mouse. They also each have a twist rotation, which you can adjust using a GUI slider. When the slerp is correctly implemented, the pointer will line up with the puck with the black dot when t is equal to 0, and line up with the puck with the white dot when t is equal to 1. 

To implement quaternion slerp in this exercise, you should read the Three.js documentation about how to access the quaternions for each of the pucks, and then implement your own quaternion slerp function based on the description and code sample in your textbook. **Don't use the built-in Three.js quaternion slerp function. This is handy to have, but it takes the fun out of implementing it yourself!**

## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** 

In Moodle, upload the completed `README.txt` with any necessary questions answered.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340294).
