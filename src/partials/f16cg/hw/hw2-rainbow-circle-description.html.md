```
cacheable: false
```

## Overview

In this exercise you're going to create the following image in Three.js:

![Starter Image](/~tmullen/images/cg/rainbowCircle.png)

## Getting started

This exercise is based on functionality described in chapter 2 of *Learning Three.js*, particularly the use of the `THREE.Geometry` constructor to create mesh objects using arrays of vertices. In the exercise, you'll build the mesh programmatically by using a `for` loop to `push` vertices onto an array, creating triangular faces as you go from triples of vertices.

You'll start with the files in [this zip archive](/~tmullen/cg/f16/cs315-hw2.zip). Everything you need to complete the assignment is in this archive, including the Three.js library.

When you run the starter code in the browser, you'll see the following triangle:

![Starter Image](/~tmullen/images/cg/rainbowCircleStart.png)

Read the code and take particular note of how the vertex objects are being pushed onto the `triangleGeometry.vertices` array, how triples of vertices are being pushed to the `triangleGeometry.faces` array and how vertex colors are being added to correspond to the vertices of faces.

Your assignment is to adapt this code by adding vertices and faces in the appropriate position, order, and material. You will not need to use any Three.js objects or functions that are not already used in the starter code. However, you will need to use `for` loops, `if` statements, and a little bit of trigonometry.

## Building the mesh

In order to position the vertices, you'll loop over angles in a circle, adding vertices at each angle radiating outward like spokes in a wheel. The first spoke you create won't have any other spoke with which to create triangles, but starting with the second spoke, you'll be able to make triangular faces with the previous spoke. This figure shows the ordering of the vertices representing the first two spokes in the `vertices` array, with their vertex colors and the triangle faces that they should form:

![Starter Image](/~tmullen/images/cg/rainbowverts.png)

The underlying structure of the circle, viewed using a wireframe material, looks like this:

![Starter Image](/~tmullen/images/cg/rainbowCircleWire.png)

You don't need to use a wireframe material on yours. This is just to let you know how the mesh should be structured.

## Positioning vertices

As you loop through the angles of the circle, each spoke will be made up of 9 vertices, radiating out from the center. The *x* and *y* coordinates of each vertex will be multiples of the cosine and sine of the angle of the spoke. Multiplying the cosine and sine by increasing values will position each vertex further away from the center.

## JS basics

A `for` loop in JavaScript looks like this:

    for(var i = 0; i > 10; i = i + 1){
      ...
    }


An `if` statement in JavaScript looks like this:

    if(i >= 10){
      ...
    }

The JavaScript `Math` object is where you'll get the math functionality you need. You can see a list including all the functions and constants you will need for this task here:

[http://www.w3schools.com/js/js_math.asp](http://www.w3schools.com/js/js_math.asp)

## Hint file

If you get stuck, you can refer to the hint file contained in the starter file download directory, which will put you considerably further down the track to completing this assignment. Try to solve the assignment first without looking at the hint file, and mention in your README whether or not you looked at the hint file. You will *not* be graded down for looking at the hint file, but I would like to know how difficult people found this assignment.

## Extra challenge

If you find this assignment easy, consider how you might use similar techniques (adding
  vertices and faces one by one) to create a rainbow-colored 3D sphere. For extra credit, you may submit a *separate* project (in addition to the main assignment) for a sphere. Refer to Homework 1 and your Three.js book for ideas on how to position the camera and lights to make it look nice. The specific rainbow pattern appearance on the sphere is up to you.

## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** The directory should include the completed `README.txt`, which should also be viewable in the browser.

In Moodle, add a link to your finished assignment's public URL **and a screenshot of your project displayed in a browser, with the URL visible**.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340416).
