```
cacheable: false
```

## Overview

In this exercise you're going to create a koosh ball model in Three.js by manipulating the
matrices of 3D objects a bit more directly than usual. Along the way you're going to get a
closer look at how Three.js represents matrices. The resulting image you'll create will look
something like this:

![Starter Image](/~tmullen/images/cg/kooshballFinal.png)

For this exercise, we're going to take a short break from the *Learning Three.js* book, because
that book doesn't really deal much with matrix manipulation. The reason for this is that most of the time, manipulating the matrix directly in Three.js isn't necessary. A higher-level API exists to carry out most transformations, and for most of the rest of your Three.js work, you'll use that. However, Three.js has a full set of tools for matrix and vector manipulation, and they can be useful. In this example, you'll use them to specify a rotation around an arbitrary vector axis. The readings from Chapters 4, 5 and 6 in *3D Math Primer for Graphics* will be relevant. You should have an understanding of how rotation is expressed in a matrix, and be able to recognize the identity matrix.

## Getting started

You'll start with the files in [this zip archive](/~tmullen/cg/f16/cs315-hw3.zip). Everything you need to complete the assignment is in this archive. When you unzip the directory and run the html in a browser, you'll see something like this:

![Starter Image](/~tmullen/images/cg/kooshballStart.png)

Look over the code and read the comments in the code closely to see what's happening. You'll see that two cylinder objects are being created. One is left un-transformed, and appears in the 3D scene pointing straight up and down. Another is rotated at an angle around the x axis. The angle of rotation is based on a vector extending between the ( -1, -1, -1) point in the space and the ( 1, 1, 1) point in the space.  

## Matrices in Three.js

A 3D object's matrix is accessible via the `.matrix` property. The matrix is a 4x4 homogeneous matrix representing all translation, rotation, and scaling transformations on the object. An un-transformed object's matrix is initialized as the identity matrix.

Check the browser's console to see the matrix data printed out. The first one we print out is the untransformed cylinder. In the console, click the triangle next to the `THREE.Matrix4` object and then click the triangle next to the `elements` array to see the internal representation of the object.s matrix. You should see the following displayed:

![Starter Image](/~tmullen/images/cg/cylMatConsoleUntransformed.png)

Although it's represented as a 1D data structure (an array), you can see that this can be interpreted as a 4x4 matrix with the diagonal consisting of 1s and the rest of the positions occupied by 0s: i.e., the identity matrix.

Scrolling down, you'll see the output of the transformed cylinder. But before that, the numerical value of `theta`, as well as the cosine and sine of `theta` are also logged to the console. That makes it easy to see that the matrix represents the rotation around the *x* axis as you'd expect, based on what you know about rotation matrices:

![Starter Image](/~tmullen/images/cg/cylMatConsoleTransformed.png)

The reason the rotation axis is *x* is that we've set it to be using

    var rotationAxis = new THREE.Vector3(1, 0, 0);

Experiment with changing this. Try setting the rotation axis to *y* using `0, 1, 0` as arguments, or to some combination of axes by having more than one non-zero value in the arguments. See which combinations yield easily-understandable rotation matrix values.

## Creating the koosh ball

You'll create many cylinders pointing in random directions analogously to how we've set up a single rotated cylinder in the starter file. First, you'll need to have a loop to cycle through the placement of some number of cylinders. The number of cylinders you add is up to you, but it should create a ball of approximately the same density as the image at the top of this page. You can re-use the variables holding the object and mesh.  

Rather than creating a single vector between ( -1, -1, -1) and ( 1, 1, 1), you'll create vectors that span between random points and those points' inverse directly across the origin. Think about how to do this. You'll also need to create a random axis of rotation, but this can be based on the random numbers you've already generated.

Read the code and comments for further hints on how to solve this.

## Extra challenge

The main assignment asks you to put colored cylinders in random directions. Consider how you might arrange the cylinders to make patterns. Can you make a spherical variation of a checkerboard, polka-dot, or other interesting pattern? You may use more than two colors if you like. If you choose to do this for extra credit, you may incorporate the pattern directly into your main assignment project. Make sure that the pattern is visible in your screenshot and make a note about what you've done in your readme. 

## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** The directory should include the completed `README.txt`, which should also be viewable in the browser.

In Moodle, add a link to your finished assignment's public URL **and a screenshot of your project displayed in a browser, with the URL visible**.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340417).
