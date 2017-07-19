```
cacheable: false
```

[Starter files](/~tmullen/secure/f17cg/cs315-hw13-14.zip)


## Overview

In these exercises you will write a simple ray tracer. Refer to the class slides on ray tracing for an overview of how to get started, and read [Shirley, Chapter 4](https://moodle.pugetsound.edu/moodle/mod/resource/view.php?id=340286) for the details of the raytracing algorithm.

When you have completed these assignment, you should have a detailed understanding of how 3D scenes can be rendered to 2D images using ray tracing. You will also gain experience in applying object-oriented programming to graphics with JavaScript.

### Starter files

The starter files include the starter code in HTML and JavaScript. The zip file also contains a collection of JSON scene files and corresponding images to show you how the scenes should look when they have been rendered. I'll go over the internals of the scene files in class, as well as presenting some important additional code that will help you get your program off the ground. **If you miss class on the days I'm talking about this, be sure to check the uploaded slides for this code.**

## Writing a ray tracer in two parts

The ray tracer is broken up over two assignments, with an option to continue working on it for your final assignment. It involves a significant amount of coding, but much of the math you have already seen in action in previous exercises. 

Below is a breakdown of what you need to do for each assignment. Assignment 13 focuses on intersection of triangles and spheres. No shading is necessary for credit for this assignment. For full credit for assignment 14, you should get as far as what is necessary to render the Cornell Box example, which includes intersections of spheres and triangles, diffuse and Blinn-Phong specular shading, and mirror reflections. Minimally, assignment 14 should implement diffuse shading and specular highlights. 

<table class="center noborder pad">
<tr>
  <td>Assignment 13 <br> Implement intersection and shading for spheres and triangles</td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/SphereTest.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/TriangleTest.png"></td>
</tr>
<tr>
  <td>Assignment 14 Minimal (Max score 85%)<br> Implement intersection and shading for spheres and triangles</td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/SphereShadingTest1.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/TriangleShadingTest.png"></td>
</tr>
<tr>
  <td>Assignment 14 Full<br> Implement cast shadows<br>& mirror reflections</td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/ShadowTest1.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/ShadowTest2.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/CornellBox.png"></td>
</tr>
  <td>Options for Assignment 15<br>Matrix transformations, transparency/refraction,
  antialiasing, and/or other features </td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/FullTest.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/RecursiveTest.png"></td>
  <td><img style="height:100px" src="/~tmullen/images/cg/examples/TransformationTest.png"></td>
  <td>Custom demo of feature<br>(E.g. transparency, etc)</td>
<tr>
</tr>
</table>


If you wish to continue work on your ray tracer as your option for **assignment 15**, you can add features such as matrix transformation of objects, transparency, depth of field, and/or other features. The starter files include some test scenes that are appropriate for some of these features, but you may need to create your own test files for other features you choose to implement. 

## The raytracing algorithm

Your primary references for the ray tracing algorithm will be [Shirley, Chapter 4](https://moodle.pugetsound.edu/moodle/mod/resource/view.php?id=340286) and Appendix A of "3D Math Primer", which goes into detail about various types of intersection and includes some C code examples. Between these two resources you will see that there are variations on how to calculate sphere and triangle intersections. You should use whichever approaches you think are most intuitive. Much of the code you've written in the past few labs and assignments should be adaptable to your needs here. 

### Hints

#### Using DEBUG

Running a straight JavaScript ray tracer in a browser is expensive. Adding IO in the form of multiple console logs for every pixel will probably bring your computer (or at least your browser) to its knees. It would also probably give you an overload of information to sift through to find whatever it is you're trying to diagnose. 

For this reason, you should use the `DEBUG` value to do console logging. At the end of the starter file, beginning at line 82, a click event listener is set up using jQuery. This will respond to a mouse click anywhere on the canvas by setting `DEBUG` to `true`, casting a single ray through the pixel you clicked on, and then setting `DEBUG` back to `false`. 

In order to write out diagnostics, place them in a conditional on the value of `DEBUG` and they will only print out when that specific ray is cast.

    if (DEBUG) {
      console.log('Some diagnostic information')
    }

This will limit the number of `console.log` calls made and also give you more control over what information is reported.

#### Distance testing

You already know how to test for intersection of triangles and spheres. In your ray tracer, you will first load objects from the .json scene file into an array of `Surface` objects which includes both `Sphere` objects and `Triangle` objects. Each ray you cast will go through this array and determine whether and where it intersects each surface. Your ray tracer will need to identify the closest intersection. 

You can use an array to keep a record of the nearest object you've intersected so far, and its distance. You can use JavaScript's built in `Infinity` value to initialize this record, like this:

    var closest = [Infinity, null];

The `Infinity` value can be numerically compared with a number, and will always be greater. 


## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** 

In Moodle, upload the completed `README.txt` with any necessary questions answered.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340294).