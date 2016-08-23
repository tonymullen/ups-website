```
cacheable: false
```
## Overview

In this exercise you'll get some practice setting up lights. Specifically, you'll add some colored spotlights to a scene and animate their position and direction using GUI sliders. You should have read Chapter 3 in *Learning Three.js* to be sure you understand the differences between light types and the specifics of the `THREE.SpotLight` object. This assignment will also give you a hands-on introduction to how colored light mixes.  

Begin by downloading the [starter file]([this zip archive](/~tmullen/cg/f16/cs315-hw6.zip). When you run the HTML code in a browser, you should see something like this:  

![Starter Image](/~tmullen/images/cg/elephantLightStart.png)

You can rotate the scene with your mouse. As you can see, the elephant is lit by a single white spot light. Read the code for the specifics of how the spot light is set up, and make sure you understand what the various parameters are doing.

## Objective

Your assignment is to modify the scene such that rather than being lit by a single white spot light, the elephant is lit by three colored spotlights: red, green, and blue. The three spotlights' positions should be controlled by a slider with the label `lightSeparation`. When the slider value is 0, the three lights are positioned together, resulting in the appearance of a white light (red, green, and blue light combine to make white). When the slider value goes to one, the three colors separate, illuminating the elephant from the left, right, and front in three different colors, as shown in the video here:

<video width="320" height="240" controls>
  <source src="/~tmullen/images/cg/elephantLights.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

In addition, you should also set up the spot lights' target objects, and have the targets controllable with a separate slider. This controls where the spot lights point. As you can see in the video, when the slider is at its maximum, the spot lights are directed over the top of the elephant, when it is at its minimum, they are directed at the zero point of the 3D space.


### Setting up spot lights and targets

The first thing you need to do is to set up the lights appropriately. You should make your own decisions about the positioning of the lights to get an effect as close to the video above as you can. The current position of the white spot light should be a good guide for getting started. The three colored lights will be added to the scene in a very similar way to the white spotlight in the starter (you don't want a white light in the final scene, so you will either get rid of or alter the initial white spot light).

Every spot light has an attribute called `target` which represents an actual 3D object toward which the spot light points. To use this object, it must be added to the scene. Read the comments in the starter file for more on this.

### Animating the lights

Once again, the main part of the animation code will occur within the `render` function. The `gui` object has already been set up for you, along with one of the controls, `lightSeparation` in the `controls` object. You'll need to add the second control `target`. Both controls should range from 0.0 to 1.0 and act as factors for whatever displacement you choose for your target or light positions.


### Extra challenge

Try to do something comparable with area light objects. AreaLights are not standard in Three.js, but they are discussed in Chapter 3 of "Learning Three.js". Read the instructions for using area lights and set up a scene that uses them in place of spotlights. You won't get identical effects, but experiment with what can and can't be done with area lights. For extra credit, turn in the area light project in addition to the main assignment project. 

## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** The directory should include the completed `README.txt`, which should also be viewable in the browser.

In Moodle, add a link to your finished assignment's public URL **and a screenshot of your project displayed in a browser, with the URL visible**.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340420).
