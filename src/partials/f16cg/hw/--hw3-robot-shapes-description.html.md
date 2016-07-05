```
cacheable: false
```

## Overview

In this exercise you're going to build a robot of your own design in Three.js. For now, you don't need to add any materials or textures, and nothing needs to be animated. All you need to do are set up the shapes.

## Starter file

Use the starter file [here](/~tmullen/cg/cs315-hwk2.zip). This file has the camera in place and contains a grid floor and a first cylinder shape to get you started. You do not have to use this cylinder, but it may be a helpful reference for size and positioning of your shapes.

## Requirements

Your robot should be made up of at least five different shapes (not counting scaling). These should include at least three different primitive geometric types and at least two ExtrudeGeometry shapes. If you wish, you can replace any one of these shapes with a shape you created in another program such as Blender using one of the Three.js loaders (for example, OBJLoader).

Your robot should also have the following characteristics:

* Two (or more) legs. In a future assignment you will be animating the robot walking, so more than two legs might give you a little extra work.
* One (or more) arm(s). The arm (or arms) should be structured along the lines of the following diagram. It should be built so that it can swivel at its base and have a bending joint in the middle. It should have a clawlike grabber at the end. In a future assignment you will be animating the arm swiveling, bending, and grabbing. The specific shape of the arm and its parts is entirely up to you, as long as it allows those movements.

![Starter Image](/~tmullen/images/cg/arm.png)

Here is an example of a finished assignment. Your robot doesn't have to look anything like this one.
Be creative!

![Starter Image](/~tmullen/images/cg/robot-0.png)

## Evaluation

Completing this assignment on time to the specifications described above is worth 8 points out of a possible 10 points. Further points will be awarded on the basis of creativity, design, and/or additional complexity. If you used interesting features of Three.js that have not been discussed, or if you added something to the assignment that may not be immediately obvious to me, be sure to make a note of it in the README, so that I know what to credit you for.

## Submitting

To submit this work, upload it with all necessary files in its own subdirectory of your public_html directory so that it can be viewed in a browser. Call the subdirectory <em>hwk-2</em>.
Test it in a browser to make sure that it's working! (If it works differently in different browsers make a note of that in the README file).

After you've uploaded the work and checked it in the browser, submit the README.txt to Moodle.

# Bonus challenge assignment

If you feel ahead of the game and you'd like to go further, take a look at
[Five Hundred and Seven Mechanical Movements](https://archive.org/stream/fivehundredseven00browiala)
 or another similar resource for mechanical movements. Find one or more interesting and
  challenging mechanical movements in the book and try to model it (them)
  in Three.js. Once you've animated your robot in assignment 4, you can also work
  on animating this. For credit on this assignment, submit whatever you've managed to do
  by the same deadline as the robot assignment, in its own directory entitled <em>hw2-challenge</em>.
