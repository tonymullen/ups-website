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

There are two things you will need to do to complete this assignment. The first is to create a function that draws a triangle of the appropriate dimensions. Processing has a `triangle(int, int, int, int, int, int)` function that takes a value for `x1`, `y1`, `x2`, `x2`, `x3`, and `y3`, representing the coordinates of the three corners of the triangle. However, it's up to you to figure out where to put those points to draw an equilateral triangle. There are a number of ways you could go about this, but the simplest for me is to use `cos()` and `sin()` functions to place three points evenly around a center point, the coordinates of which which would be passed to the function as arguments. Be careful though. Processing assumes that angle arguments are represented as *radians*, so if you're using degree values, be sure to convert your angles with the `radians()` function.  

The second thing you need to do is to implement the recursive function `sierpinski()`. You will have to figure out how to make the necessary recursive call(s) and what to do in them. Be sure that a stopping criterion is in place, or else the program could recurse endlessly and blow up your memory (Processing is smart enough to error out before this happens).

The actual positioning of the triangles may take a little trial and error to get right. You'll probably need to convert floats to ints (pixel positions must be ints). I've found that for this exercise using `round()` yields the best results for that.

## Notes

In order to run the starter file you'll need to be sure to install the `ControlP5` library. Go to the `Tools` menu, click `Add Tool` and click the `Libraries` tab. Find `ControlP5` and install the library from there.


Submit the file at the [Moodle page for the assignment](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340441).

**Extra fun:** You won't get any actual extra credit for it (it wouldn't be fair to the iPhone users!), but if you have an Android phone you may find it entertaining to set up Processing's Android mode and run your Sierpinski gasket on your phone.
