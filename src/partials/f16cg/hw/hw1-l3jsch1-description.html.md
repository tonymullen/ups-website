```
cacheable: false
```

## Overview

For this assignment you'll work through the example in Chapter 1 of *Learning Three.js*, making some changes of your own. This will give you a general introduction to how scenes, objects, lights, geometry, and animation work in Three.js. You'll see all of these things in more detail later in the course.

## Getting started

Download the [starter file](/~tmullen/cg/f16/cs315-hw1.zip) for this assignment. Everything you need to complete the assignment is in this directory, including the Three.js library and other modules that the file depends on. (Ordinarily these would be found somewhere in the `three.js-master` package.)

Look at the file `hw1.html`. This file will be where you'll write your code. As you can see, the starter file contains most of the code from Chapter 1 of *Learning Three.js*, with some areas marked `TODO:`. **This will save you some typing, but you'll need to read the chapter and the code to complete the assignment.**

You should place the entire unzipped directory on a web server (alternately, you can read it in Chrome from the filesystem by running Chrome without security features as described in Chapter 1 of the book). When you do this and view `hw1.html` in a browser, you should see a scene like this:

![Starter Image](/~tmullen/images/cg/assignment1-start.png)

## Completing the Chapter 1 code

The scene above is almost the finished scene from Chapter 1, but it's missing animation, some GUI controls. The first thing you need to do is to get those in place. Read all of Chapter 1 with reference to the code in the starter file. Add the code from Chapter 1 that I left out. There are a few minor changes I've made to make the code work with the latest version of Three.js, but these won't affect what you need to add. **You will not need to delete anything from the starter file.**  

The result will be a similar scene, but with cast shadows, animations, and two GUI sliders to control the speed of the cone's rotation and the sphere's bouncing.

## Adding more objects

Now that you know how to create, position, and animate objects, you'll add a few more to the scene. Specifically, you'll make the following changes:

* Extend the gray plane so as to accommodate the positioning of the cone you will add next.

* Add a cone 4 units wide, 10 units high, and 32 segments around. The cone should be of Lambert material and should be some shade of green. Use [hex color codes](http://htmlcolorcodes.com/) to determine the color of your material. The cone should cast shadows. Position the code at -20 along the x axis and position it on the y axis in such a way that it appears to sit atop the gray plane.

* Animate the cone such that it bounces up and down a distance of 10 units. Control the speed of the cone's bounce using a GUI slider. This will be done exactly as described for the sphere in Chapter 1, but the cone's movement should be independent of the sphere's movement.

* Add a second sphere with a 5 unit radius and 8 horizontal and vertical segments using a black wireframe material. Position the sphere 20 units directly above the center of the scene. You do not need to animate the wireframe sphere.

Documentation for the cone and sphere geometries can be found at [http://threejs.org/docs/](http://threejs.org/docs/) under `Extras/Geometries`. You'll use `ConeGeometry` for the cone and `SphereGeometry` for the sphere.

When you've finished, your scene should look something like this:

![Finished Scene](/~tmullen/images/cg/assignment1.png)

## Submitting your work

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** The directory should include the completed `README.txt`, which should also be viewable in the browser. 

In Moodle, add a link to your finished assignment's public URL.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340294).
