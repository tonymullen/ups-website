```
cacheable: false
```
## Overview

In this exercise you're going to get a little practice working with the camera. This exercise relates to what you read in the second part of Chapter 2 of *Learning Three.js*, "Different cameras for different uses". You will need to understand how the perspective camera works and what its properties represent. You'll also put your trigonometry skills to use again to animate the camera moving in a circle.

Begin by downloading the [starter file]([this zip archive](/~tmullen/cg/f16/cs315-hw5.zip). When you run the HTML code in a browser, you should see something like this:  

![Starter Image](/~tmullen/images/cg/elephant_start.png)

Clearly, there are few problems. The first one you'll notice is that portions of the scene are getting cut off and aren't being rendered at all. Rotate the scene around with your mouse a bit and see if you can get a sense of what's being excluded from rendering and why.

## Objective

Your assignment is to modify the settings of the camera and then to animate the position of the camera so that your scene displays as shown in this movie clip (your scene's camera should rotate continuously):

<video width="320" height="240" controls>
  <source src="/~tmullen/images/cg/elephant.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

### Perspective camera settings

The first thing you need to do is to get the camera settings right. Review the description of the perspective camera's behavior in *Learning Three.js* Chapter 2.

As you adjust the camera's settings, you'll see also that the camera's position is important to how the scene displays. When the field of view is wider, things will seem further away because they occupy less of the image. You will need to eyeball it a bit to get the camera's distance from the target and its field of view set to values that look like the solution video above. Note that the perspective effects are clear in the grid and the plane under the elephant. Grid squares that are further from the viewer appear considerably smaller than ones that are close to the viewer.

### Animating the camera

Most of the animation code will be inside the `render()` function. Since the movement of the camera is around the `y` axis, the `y` value won't need to change, while the others do. Loop through degrees in a circle and use the `Math.cos()` and `Math.sin()` functions to position your camera on each call of the `render()` function. Remember that the `render()` function runs in the `animate()` loop, so you won't have any need for a `for` loop. Also, don't forget that the JS trig functions want radians for arguments, so you'll need to convert the degrees of your angles to radians.

## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** The directory should include the completed `README.txt`, which should also be viewable in the browser.

In Moodle, add a link to your finished assignment's public URL.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340419).
