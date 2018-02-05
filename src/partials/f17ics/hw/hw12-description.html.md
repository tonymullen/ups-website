```
cacheable: false
```

## Recursion with Processing: The Sierpinski Gasket

For this assignment you'll be implementing a recursive function to create an interactive [Sierpinski gasket](http://mathworld.wolfram.com/SierpinskiSieve.html) in Processing.

Your finished assignment will look something like this, where the user can slide the value in the slider at the top of the screen to change the depth of recursion of the Sierpinski gasket:

<img src="/~tmullen/images/ics/sierpinski.png" style="width: 100%;"/>

Download the
[starter file](http://mathcs.pugetsound.edu/~tmullen/ics/sierpinski_starter.zip) to get started on this assignment. This has the slider UI element set up for you and the
beginnings of a few functions that will need to be completed in order to draw a triangle to the screen and to generate a complete Sierpinski Gasket to the recursive depth specified interactively with the slider.  

## Implementation

Processing has a `triangle(int, int, int, int, int, int)` function that takes a value for `x1`, `y1`, `x2`, `x2`, `x3`, and `y3`, representing the coordinates of the three corners of the triangle. In the starter code, you'll see that this function is called to create the white triangle.

The starter file also has a class called `Point` implemented that includes a method an object to return the midpoint between itself and another `Point` object (passed as an argument). This will be where you'll calculate the coordinates between the two points.  

In order to draw the Sierpinski triangle, you'll recursively draw black triangles over the white triangle such that with each call of the `sierpinski()` function a black triangle is drawn with its corners at the midpoints of the triangle it divides, then makes the necessary recursive call(s) so that the three smaller triangles are also dealt with, to the depth indicated by the slider. Be sure that a stopping criterion is in place, or else the program could recurse endlessly and blow up your memory (Processing is smart enough to error out before this happens).

The slider controlling the recursive depth is already implemented for you. The variable `depthSlider` represents the value from the slider and ranges from `MIN_DEPTH` to `MAX_DEPTH`.

## Notes

In order to run the starter file you'll need to be sure to install the `ControlP5` library. Go to the `Tools` menu, click `Add Tool` and click the `Libraries` tab. Find `ControlP5` and install the library from there.


Submit the file at the [Moodle page for the assignment](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407301).

**Extra fun:** You won't get any actual extra credit for it (it wouldn't be fair to the iPhone users!), but if you have an Android phone you may find it entertaining to set up Processing's Android mode and run your Sierpinski gasket on your phone. To do this, you would need to download and install the [Android SDK](https://developer.android.com/studio/index.html). 
