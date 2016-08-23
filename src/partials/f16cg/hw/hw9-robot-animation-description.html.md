```
cacheable: false
```
## Overview

In this exercise you're going to finish the robot project by adding animation and interactivity.

There is no starter file. Once again, you'll **duplicate** the previous assignment where you left off and continue from that point. As in the previous case, this assignment must be uploaded **separately** from the previous assignment, so be sure to duplicate the entire directory, including your previous solution and necessary dependencies. You are of course welcome to make changes or tweaks to the model or materials as you like. This is a completely separate assignment from the previous two. **If you have not done assignments 7 or 8, you will need to build a robot according to the instructions in assignments 7 and 8 in order to complete this assignment, even if it is too late to get credit for those assignments.**

## Requirements

The robot's arm should be controllable. Use the dat.GUI library to add three sliders, as you see below. One of the sliders should control swivel at the base of the robot's arm, enabling it to rotate 180 degrees in either direction. The next slider should control the joing of the robot's arm, enabling it to bend 90 degrees in either direction. The third slider should control the robot's claw, enabling it to open and close, as in the example below.

Next, the robot should be able to walk. Use the W key to make the robot walk forward, the A key to make the robot turn left, and the S key to make the robot turn right. Make the robot's legs move when any of these keys are being pressed, and make them stop when the keys are released.

The leg movement won't be perfect. As you can see in the example below, the legs appear to slide on the ground. This is an issue that is beyond the scope of this assignment. For now, it is enough to have the legs move back and forth continuously at a roughly decent looking speed.

Finally, make some characteristic of your robot move continuously. In the example below, the eye parts meet this criteria.

<video width="320" height="240" controls>
  <source src="/~tmullen/images/cg/robot-anim.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>


## Object hierarchies in Three.js

To animate your robot's limbs, you'll use object hierarchies (also known as groups or complex objects, and closely related to the concept of parenting Blender). These are described in Chapter 8 of "Learning Three.js". In short, rather than adding objects to a scene individually, it is possible to add them to a complex object of type `THREE.Object3D`, which itself may be added to the scene. The benefit of this is that sub-objects of an Object3D object inherit the "parent" object's transformations. For example, if you had an `arm` mesh object, you could add it to a `torso` Object3D object, and the arm would move with the torso in a natural way. The arm could also be rotated, but it would rotate with respect to the frame of reference of the torso. You could create a `body` Object3D object and add the torso to that, so that when the body moved, all of its component parts moved with it. The method for adding is the same as it is to add objects to a scene, i.e. `add()`.

The book "Learning Three.js" makes reference to the `THREE.Group` object type also, which behaves the same as `THREE.Object3D`. This appears to be an addition made to support the terminology of "groups".

## Repositioning objects

Your robot so far will probably need to be somewhat rebuilt for the purposes of animation. At the moment, each geometric object that makes up the robot has been positioned with respect to the world coordinates. However, if you add an object (such as an arm) to a parent object (such as an object representing the torso), the zero point for the child object is set to the location of the parent object. This means that any offsets will have to be adjusted to account for the new frame of reference.

Also remember that objects always rotate around their centers. Thus, if you want a mesh to rotate around one end of the mesh, for example (as in the case of an arm, which rotates around the shoulder-end of its length) you will need to create an Object3D object to rotate, and then offset the child object such that the desired pivot point is at the parent's center point. When the parent object rotates (around its center) the child object will inherit the rotation and rotate around its appropriate pivot point.

## Extra challenge 1

Add other animated characteristics or more mechanically complex movements to your model.

## Extra challenge 2

In addition to the purely Three.js robot, create and animate a robot part or other mechanical part in Blender, using armature animation. Export the animated mesh and import it into Three.js with slider controls. For example, a tripod that folds and unfolds based on a slider value, or a robotic hand that clenches and unclenches.


## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla (this should be a separate directory from Hws 7 and 8. Duplicate the files from  Hw 8 to work on this one). Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** The directory should include the completed `README.txt`, which should also be viewable in the browser.

In Moodle, add a link to your finished assignment's public URL **and a screenshot of your project displayed in a browser, with the URL visible**.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340423).
