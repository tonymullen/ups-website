```
cacheable: false
```

## Overview

In this exercise you will write a simple ray tracer. Refer to the class slides on ray tracing for an overview of how to get started, and read [Shirley, Chapter 4](https://moodle.pugetsound.edu/moodle/mod/resource/view.php?id=340286) for the details of the raytracing algorithm.

When you have completed this assignment, you should have a detailed understanding of how 3D scenes can be rendered to 2D images using ray tracing. You will also gain experience in applying object-oriented programming to graphics with JavaScript.

## Starter files

You'll start with the files in [this zip archive](/~tmullen/cg/f16/cs315-hw11.zip).

This file contains the starter code in HTML and JavaScript. It also contains a collection of JSON scene files and corresponding images to show you how the scenes should look when they have been rendered. I'll go over the internals of the scene files in class, as well as presenting some important additional code that will help you get your program off the ground. **If you miss class on the days I'm talking about this, be sure to check the uploaded slides for this code.**

## Objectives

Below is a breakdown of what you need to do to get a score for assignment 11. For full credit for assignment 11, you should get as far as what is necessary to render the Cornell Box example, which includes intersections of spheres and triangles, diffuse and Blinn-Phong specular shading, and mirror reflections.

If you wish to continue work on your ray tracer for assignment 12, you can add features such as matrix transformation of objects, transparency, depth of field, and/or other features.

<table class="center noborder pad">
<tr>
  <td>Minimal (max score 85%) <br> Implement intersection and shading for spheres and triangles</td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/SphereTest.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/SphereShadingTest1.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/TriangleTest.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/TriangleShadingTest.png"></td>
</tr>
<tr>
  <td>Full Assignment 11<br> Implement cast shadows<br>& mirror reflections</td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/ShadowTest1.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/ShadowTest2.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/CornellBox.png"></td>
</tr>
  <td>Options for Assignment 12<br>Matrix transformations, transparency/refraction,
  antialiasing, and/or other features </td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/FullTest.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/RecursiveTest.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/TransformationTest.png"></td>
  <td>Custom demo of feature<br>(E.g. transparency, etc)</td>
<tr>
</tr>
</table>

## The raytracing algorithm

Your primary references for the ray tracing algorithm will be [Shirley, Chapter 4](https://moodle.pugetsound.edu/moodle/mod/resource/view.php?id=340286) and Appendix A of "3D Math Primer", which goes into detail about various types of intersection and includes some C code examples. Between these two resources you will see that there are variations on how to calculate sphere and triangle intersections. My own preference is to do sphere intersection using the quadratic equation along the lines described in Shirley, and to do triangle intersection using barycentric coordinates in the manner described in "3D Math Primer", which should also be familiar to you from homework 10. You should use the approaches that you think are most intuitive.

## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** The directory should include the completed `README.txt`, which should also be viewable in the browser.

In Moodle, add a link to your finished assignment's public URL **and a screenshot of your project displayed in a browser, with the URL visible**. If you completed the "minimal" option, take your screenshot of the shaded triangle example. If you completed the "full" option, take your screenshot of the Cornell box example.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340425).
