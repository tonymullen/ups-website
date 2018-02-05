```
cacheable: false
```

[Starter files](/~tmullen/secure/f17cg/cs315-hw7.zip)

## Overview

In this exercise you're going to build a robot of your own design in Three.js. Nothing needs to be animated, for now all you need to do is to set up the shapes and the materials (later, you may need to reposition some objects to prepare them for animation). You should read chapters 5 and 6 in *Learning Three.js*.

## Starter file

Use the starter file [here](/~tmullen/cg/f16/cs315-hw7.zip). This file has the camera in place and contains a grid floor and a first cylinder shape to get you started. You do not have to use this cylinder, but it may be a helpful reference for size and positioning of your shapes.

## Requirements

Your robot should be made up of at least five different shape types. These should include at least three different Three.js primitive geometric types and at least two Three.js `ExtrudeGeometry` shapes. If you wish, you can replace one or more of these shapes with shapes you created in another program such as Blender using one of the Three.js loaders (for example, OBJLoader), but there should be a total of five different shapes. Of course, you can use more shape types than this if you wish.

Your robot should also have the following characteristics:

* Two (or more) legs. In a future assignment you will be animating the robot walking, so more than two legs might give you a little extra work at that time. The legs can be any design you wish, but again, keep in mind that you will be animating them later.
* One (or more) arm(s). The arm (or arms) should be structured along the lines of the following diagram. It should be built so that it can swivel at its base and have a bending joint in the middle. It should have a clawlike grabber at the end. In a future assignment you will be animating the arm swiveling, bending, and grabbing. The specific shape of the arm and its parts is entirely up to you, as long as it allows those movements.
    ![Starter Image](/~tmullen/images/cg/arm.png)
* The robot should use at least five materials, among which should be at least one diffuse (matte/non-shiny) material and at least one highly specular (shiny) material. Also, there should be at least one transparent material like glass, and at least one environment-mapped reflective material (it's okay to have materials with both, but there should be at least two materials in total to correspond with these characteristics).


Finally, include a sky box to help make transparent materials more interesting (by giving them something to see through to). Documentation for creating a sky box in Three.js can be found [here](https://threejs.org/docs/#api/loaders/CubeTextureLoader).

I've provided a set of sky box images you can use [here](/~tmullen/cg/airport_images.zip). If you want to create your own, there are some instructions for doing that in Blender [here](http://25x8.blogspot.com/2013/04/rendering-skybox-for-unity-using-blender.html).

Here is an example of a finished assignment:


<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/robot-refl.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>


## Evaluation

Completing this assignment on time to the specifications described above is worth 90 out of a possible 100 points. Further points will be awarded on the basis of creativity, design, and/or additional complexity. If you used interesting features of Three.js that have not been discussed, or if you added something to the assignment that may not be immediately obvious to me, be sure to make a note of it in the README, so that I know what to credit you for.

## Extra challenge 1

In addition to your purely Three.js robot, try modeling a robot, character, or mechanical part
in Blender and importing it. Make sure to make a note in your readme that you've done this, and submit the .blend file along with your assignment (just place it in the public_html directory with your assignment). You can continue working on animating this for extra credit on homework 8.

## Extra challenge 2

If you feel ahead of the game and you'd like to go further, take a look at
[Five Hundred and Seven Mechanical Movements](https://archive.org/stream/fivehundredseven00browiala)
 or another similar resource for mechanical movements. Find one or more interesting and
  challenging mechanical movements in the book and try to model it (them)
  in Three.js or Blender. Once you've animated your robot in assignment 8, you can also work
  on animating this. For credit on this assignment, submit whatever you've managed to do
  by the same deadline as the robot assignment, in its own directory within the assignment directory.

## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** 

In Moodle, submit **only** the link to your assignment directory on the shared server containing the fully implemented assignment and readme.txt.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407323).
