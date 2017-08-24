```
cacheable: false
```

[Starter files](/~tmullen/secure/f17cg/cs315-hw3.zip)

# Matrices in Three.js

A 3D object's matrix is accessible via the `.matrix` property. The matrix is a 4x4 homogeneous matrix representing all translation, rotation, and scaling transformations on the object. An un-transformed object's matrix is initialized as the identity matrix. In general, Three.js provides an API for carrying out transformations (rotation, translation, scale) on an object without exposing matrix values directly. When this API is used, the matrix is automatically updated "behind the scenes". You'll make use of this API frequently throughout the course. 

However, it's also possible to turn off automatic updating of an object's matrix and set the numerical values of the matrix directly. For the first three exercises in this assignment you'll be doing that. For the last exercise, you'll use the Three.js matrix API to set matrix values a little less directly but still explicitly.

## Exercise 1: Combining Matrix Transformations

In this exercise you're going to get a bit more practice thinking about transformation matrices. As you'll see in Exercise 4 and later in the course, we can work with matrices and transformations in Three.js at various levels of abstraction using the API tools. In this exercise, we'll turn off the automatic updating and set values directly in a matrix and use that to transform our object. This exercise follows upon the exercise you did in Lab 3, and you may use the solution to Lab 3 as a reference for solving this exercise. 

The end result of the exercise is identical to the solution to Lab 3. You will be able to control rotation, location, and scaling of the object using sliders as shown in the video:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/chessKnight.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

The starter file for this exercise is slightly different from Lab 3. Instead of separate matrices for each transformation along each axis, totaling nine matrices, you will compose the transformation matrices together for all axes translation (location), scaling, and rotation, resulting in three matrices, one for each type of transformation. This means that the x, y, and z translation matrices will be multiplied together to yield a single translation matrix; the x, y, and z scaling matrices will be multiplied to yield a single scaling matrix, etc. 

Review the class slides about transformation matrices. Rotation and scaling matrices are covered in depth in Chapter 5 of *3D Math Primer* and translation is covered in section 6.4.   

Translation and scaling matrices are comparatively straightforward and intuitive to compose together. Composing rotation matrices together is a bit more painstaking and will require some attention to the process of matrix multiplication, which is covered in section 4.1 of *3D Math Primer*. 

Areas of code that need attention are marked with `TODO`. Read the comments throughout the code to understand what needs to be done and how to do it. 

### Readme question:

**Answer the following question(s) in your readme**: Is there a difference between multiplying the rotation matrix before the translation matrix and vice versa? Explain in plain english how the order of multiplication affects the result.

## Exercise 2: Skew/shear

In this exercise you'll set three matrices to carry out skew/shear transformations on the puzzle box object in the scene as shown:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/skewShear.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

Transformation A will shear the ends of the box back and forth along the X axis. Transformation B will shear the long sides of the box up and down along the Y axis. Transformation C will shear the top and bottom of the box back and forth along the Z axis. 

Review the discussion of shearing in section 5.5 of *3D Math Primer*. 

## Exercise 3: Mirror transforms

In this exercise you'll set three matrices to carry out mirror transformations across the X, Y, and Z axes, and one more matrix representing a transformation across multiple axes:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/mirrorTransforms.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

Review the discussion of what the book calls 'reflection' matrices in section 5.4 of *3D Math Primer*. The 4th matrix, using multiple axes, is a little bit different. Review the slides for discussion of mirroring across diagonals. Think about which values from the original matrix should be applied to which values in the transformed matrix.  

### Working with transformed objects

Unlike in the previous exercises, the mirror transformations in this exercise aren't operating on the original knight object itself. Instead, we make four "copy" objects using the same geometry from the knight object. Each of these objects has a different material (as you can see from the color). Those are the objects to which we must apply both the original transformations on the knight (we want the mirror objects to rotate and move along with the original object) and also their specific mirror transformation. 

### Readme question:

**Answer the following question(s) in your readme**: The materials for the copies are specified as `side: THREE.DoubleSide`. In one of the materials, for example the material for the xCopy object, comment out this line of code and see what effect it has on the mirrored object. Discuss why you think it's different and what other approaches to solving the problem you can think of. 

## Exercise 4: Koosh Ball

In this exercise you're going to create a koosh ball model in Three.js, and get a
closer look at how Three.js represents and interacts with matrices. The resulting image you'll create will look
something like this:

![Starter Image](/~tmullen/images/cg/kooshballFinal.png)

Three.js has a full set of tools for matrix and vector manipulation, and they can be useful. In this example, you'll use them to specify a rotation around an arbitrary vector axis. The readings from Chapters 4, 5 and 6 in *3D Math Primer for Graphics* will be relevant. You should have an understanding of how rotation is expressed in a matrix, and be able to recognize the identity matrix. 

### Getting started

When you unzip the directory and run the html for this exercise in a browser, you'll see something like this:

![Starter Image](/~tmullen/images/cg/kooshballStart.png)

Look over the code and read the comments in the code closely to see what's happening. You'll see that two cylinder objects are being created. One is left un-transformed, and appears in the 3D scene pointing straight up and down. Another is rotated at an angle around the x axis. The angle of rotation is based on a vector extending between the ( -1, -1, -1) point in the space and the ( 1, 1, 1) point in the space.  

### Matrix value in the starter file

Check the browser's console to see the matrix data printed out. The first one we print out is the untransformed cylinder. In the console, click the triangle next to the `THREE.Matrix4` object and then click the triangle next to the `elements` array to see the internal representation of the object.s matrix. You should see the following displayed:

![Starter Image](/~tmullen/images/cg/cylMatConsoleUntransformed.png)

Although it's represented as a 1D data structure (an array), you can see that this can be interpreted as a 4x4 matrix with the diagonal consisting of 1s and the rest of the positions occupied by 0s: i.e., the identity matrix.

Scrolling down, you'll see the output of the transformed cylinder. But before that, the numerical value of `theta`, as well as the cosine and sine of `theta` are also logged to the console. That makes it easy to see that the matrix represents the rotation around the *x* axis as you'd expect, based on what you know about rotation matrices:

![Starter Image](/~tmullen/images/cg/cylMatConsoleTransformed.png)

The reason the rotation axis is *x* is that we've set it to be using

    var rotationAxis = new THREE.Vector3(1, 0, 0);

Experiment with changing this. Try setting the rotation axis to *y* using `0, 1, 0` as arguments, or to some combination of axes by having more than one non-zero value in the arguments. See which combinations yield easily-understandable rotation matrix values.

### Creating the koosh ball

You'll create many cylinders pointing in random directions analogously to how we've set up a single rotated cylinder in the starter file. First, you'll need to have a loop to cycle through the placement of some number of cylinders. The number of cylinders you add is up to you, but it should create a ball of approximately the same density as the image at the top of this page. You can re-use the variables holding the object and mesh.  

Rather than creating a single vector between ( -1, -1, -1) and ( 1, 1, 1), you'll create vectors that span between random points and those points' inverse directly across the origin. Think about how to do this. You'll also need to create a random axis of rotation, but this can be based on the random numbers you've already generated.

Read the code and comments for further hints on how to solve this.

### Extra challenge

The main assignment asks you to put colored cylinders in random directions. Consider how you might arrange the cylinders to make patterns. Can you make a spherical variation of a checkerboard, polka-dot, or other interesting pattern? You may use more than two colors if you like. If you choose to do this for extra credit, you may incorporate the pattern directly into your main assignment project. Make sure that the pattern is visible in your screenshot and make a note about what you've done in your readme. 

## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** 

In Moodle, upload the completed `README.txt` with any necessary questions answered.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407319).