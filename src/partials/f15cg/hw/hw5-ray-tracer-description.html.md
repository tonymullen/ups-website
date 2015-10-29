```
cacheable: false
```

## Overview

In this exercise you will write a simple ray tracer. Refer to the class slides from Nov 2 lecture for an overview of how to get started, and read Shirley, Chapter 4 for the details of the raytracing algorithm.

## Objective

When you have completed this assignment, you should have a detailed understanding of how 3D scenes are rendered to 2D images, and be able to implement the basic algorithms for ray tracing. You will also gain experience in applying object-oriented programming to graphics.

##Starter files
You'll start with the files in [this zip archive](/~tmullen/cg/cs315-hwk5.zip).

This file contains the starter code in HTML and JavaScript. It also contains a collection of JSON scene files and corresponding images to show you how the scenes should look when they have been rendered. I'll go over the internals of the scene files in class, as well as presenting some additional code that will help you get your program off the ground.

##What you need to do

Below is a breakdown of what you need to do to get a score for assignment 5. For full credit for assignment 5, you should get as far as what is necessary to render the Cornell Box example, which includes intersections of spheres and triangles, diffuse and Blinn-Phong specular shading, and mirror reflections.

Adding matrix transformation of objects and transparency will be an option for assignment 6, if you wish to continue work on your ray tracer (after that, you will have further options if you want to continue work on the ray tracer for your final project for the class).

<table class="center noborder pad">
<tr>
  <td>Minimal (max score 80%) <br> Implement intersection and shading for spheres and triangles</td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/SphereTest.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/SphereShadingTest1.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/TriangleTest.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/TriangleShadingTest.png"></td>
</tr>
<tr>
  <td>Full Assignment 5 <br> Implement shadows and mirror reflections</td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/ShadowTest1.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/ShadowTest2.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/CornellBox.png"></td>
</tr>
  <td>Optional Assignment 6 <br> Implement matrix transformations and transparency </td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/FullTest.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/RecursiveTest.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/TransformationTest.png"></td>
  <td>Transparency/<br>refraction<br>(Original scene)</td>
<tr>
</tr>
</table>

##Submitting

To submit this work, upload it with all necessary files in its own subdirectory of your public_html directory so that it can be viewed in a browser. Test it in a browser to make sure that it's working! (If it works differently in different browsers make a note of that in the README file).

After you've uploaded the work and checked it in the browser, submit the README.txt to Moodle.
