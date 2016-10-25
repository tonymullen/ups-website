```
cacheable: false
```

## Overview

In this exercise you're going to build a robot of your own design in Three.js. For now, you don't need to add any materials or textures, and nothing needs to be animated. All you need to do is to set up the shapes. You should read chapters 5 and 6 in *Learning Three.js*.

## Starter file

Use the starter file [here](/~tmullen/cg/f16/cs315-hw7.zip). This file has the camera in place and contains a grid floor and a first cylinder shape to get you started. You do not have to use this cylinder, but it may be a helpful reference for size and positioning of your shapes.

## Requirements

Your robot should be made up of at least five different shape types. These should include at least three different Three.js primitive geometric types and at least two Three.js `ExtrudeGeometry` shapes. If you wish, you can replace any one of these shapes with a shape you created in another program such as Blender using one of the Three.js loaders (for example, OBJLoader). In that case, you should have at least two different primitive geometric types or at least one `ExtrudeGeometry` shape. Of course, you can use more shape types than this if you wish.

Your robot should also have the following characteristics:

* Two (or more) legs. In a future assignment you will be animating the robot walking, so more than two legs might give you a little extra work at that time. The legs can be any design you wish, but again, keep in mind that you will be animating them later.
* One (or more) arm(s). The arm (or arms) should be structured along the lines of the following diagram. It should be built so that it can swivel at its base and have a bending joint in the middle. It should have a clawlike grabber at the end. In a future assignment you will be animating the arm swiveling, bending, and grabbing. The specific shape of the arm and its parts is entirely up to you, as long as it allows those movements.

![Starter Image](/~tmullen/images/cg/arm.png)

Here is an example of a finished assignment. Your robot doesn't have to look anything like this one.
Be creative!

![Starter Image](/~tmullen/images/cg/robot-0.png)

## Evaluation

Completing this assignment on time to the specifications described above is worth 90 out of a possible 100 points. Further points will be awarded on the basis of creativity, design, and/or additional complexity. If you used interesting features of Three.js that have not been discussed, or if you added something to the assignment that may not be immediately obvious to me, be sure to make a note of it in the README, so that I know what to credit you for.

## Extra challenge 1

In addition to your purely Three.js robot, try modeling a robot, character, or mechanical part
in Blender and importing it. Submit as a separate project. You can continue working on animating and texturing this for extra credit on homeworks 8 and 9.

## Extra challenge 2

If you feel ahead of the game and you'd like to go further, take a look at
[Five Hundred and Seven Mechanical Movements](https://archive.org/stream/fivehundredseven00browiala)
 or another similar resource for mechanical movements. Find one or more interesting and
  challenging mechanical movements in the book and try to model it (them)
  in Three.js or Blender. Once you've animated your robot in assignment 8, you can also work
  on animating this. For credit on this assignment, submit whatever you've managed to do
  by the same deadline as the robot assignment, in its own directory entitled.

## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** The directory should include the completed `README.txt`, which should also be viewable in the browser.

In Moodle, add a link to your finished assignment's public URL **and a screenshot of your project displayed in a browser, with the URL visible**.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340421).
