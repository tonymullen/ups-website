```
cacheable: false
```

## Overview

For this assignment you'll work through the example in Chapter 1 of *Learning Three.js*, making some changes of your own. This will give you a general introduction to how scenes, objects, lights, geometry, and animation work in Three.js. You'll see all of these things in more detail later in the course.

## Getting started

Start by ensuring that the `js` directory and `images` directory have each been downloaded and unzipped into your http root directory (and uploaded to your `public_html` directory for the purposes of submitting the assignment). These are necessary dependencies for many of the assignments. Your `public_html` directory (and any local http directory you use) should be organized as shown [here](/~tmullen/hw/f17cg/directory-structure).

Download the [starter file](/~tmullen/secure/f17cg/cs315-hw1.zip) for this assignment. Everything you need to complete the assignment is in this directory and in the `js` directory, including three.js itself (Ordinarily these would be found somewhere in the `three.js-master` package.) If your http directory is set up right, the starter file should work in your browser. 

Look at the file `index.html`. This file will be where you'll write your code. As you can see, the starter file contains most of the code from Chapter 1 of *Learning Three.js*, with some areas marked `TODO:`. **This will save you some typing, but you'll need to read the chapter and the code to complete the assignment.**

You should place the entire unzipped directory on a web server such as a node.js `http-server` instance (alternately, you can read it in Chrome from the filesystem by running Chrome without security features as described in Chapter 1 of the book). When you do this and view the directory name in a browser, you should see a scene like this:

![Starter Image](/~tmullen/images/cg/assignment1-start.png)

## Completing the Chapter 1 code

The scene above is almost the finished scene from Chapter 1, but it's missing animation, some GUI controls. The first thing you need to do is to get those in place. Read all of Chapter 1 with reference to the code in the starter file. Add the code from Chapter 1 that I left out. There are a few minor changes I've made to make the code work with the latest version of Three.js, but these won't affect what you need to add. **You will not need to delete anything from the starter file.**  

The result will be a similar scene, but with cast shadows, animations, and two GUI sliders to control the speed of the cone's rotation and the sphere's bouncing.

## Adding more objects

Now that you know how to create, position, and animate objects, you'll add a few more to the scene. Specifically, you'll make the following changes:

* Extend the gray plane so as to accommodate the positioning of the cone you will add next.

* Add a cone 4 units wide, 10 units high, and 32 segments around. The cone should be of Lambert material and should be some shade of green. Use [hex color codes](http://htmlcolorcodes.com/) to determine the color of your material. The cone should cast shadows. Position the cone at -20 along the x axis and position it on the y axis in such a way that it appears to sit atop the gray plane.

* Animate the cone such that it bounces up and down a distance of 10 units. Control the speed of the cone's bounce using a GUI slider. This will be done exactly as described for the sphere in Chapter 1, but the cone's movement should be independent of the sphere's movement.

* Add a second sphere with a 5 unit radius and 8 horizontal and vertical segments using a black wireframe material. Position the sphere 20 units directly above the center of the scene. You do not need to animate the wireframe sphere.

Documentation for the cone and sphere geometries can be found at [http://threejs.org/docs/](http://threejs.org/docs/) under `Extras/Geometries`. You'll use `ConeGeometry` for the cone and `SphereGeometry` for the sphere.

When you've finished, your scene should look something like this:

![Finished Scene](/~tmullen/images/cg/assignment1.png)

## **Important:** clearing the cache and developer tools

It is common for your browser to cache scripts. When this happens, reloading your web page may not show changes you've made to your script. This can lead to a lot of frustration if you're not aware of it!

In Chrome, the refresh button has extra options available *if the developer tools window is open*, as shown in the image below:

<img src="/~tmullen/images/cg/emptyCacheReload.png" width="100%"></img>

When doing web development, you should always have your console/developer tools open to see error messages and other output. How to open the developer tools window and how to clear the cache when reloading the page differs by browser and operating system. Make sure you know how to do these things for your operating system and preferred browser. 

## Submitting your work

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** The directory should include the completed `README.txt`, which should also be viewable in the browser.

The URL for the destination directory is `http://cs315.pugetsound.edu/`. There, you'll see a directory with your username. Your homework assignments should all be uploaded as described above and [here](/~tmullen/hw/directory-structure).

In order to upload the file to the server, you must be either on campus or connected to the campus network via VPN. Instructions for accessing the campus network via VPN can be found [here](http://www.pugetsound.edu/about/offices-services/technology-services/help-support/self-help/vpn/).

Using FileZilla, enter `sftp://cs315.pugetsound.edu` in the Host field, your username in the Username field, and your password in the Password field, then click connect. You should be able to drag and drop files and directories from your filesystem in the window on the left to the remote filesystem in the window on the right of the FileZilla interface.  

In Moodle, upload a copy of your `README.txt` with the fields filled out. 
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407317).
