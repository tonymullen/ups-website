```
cacheable: false
```

[Starter files](/~tmullen/secure/f17cg/cs315-hw4.zip)

## Exercise 1: The Cohen-Sutherland algorithm

In this exercise you're going to implement the Cohen-Sutherland clipping algorithm in 2D. When you run the starter file, you'll see two balls connected by a line segment, and a rectangle representing a 2D clipping area. You will implement the Cohen-Sutherland algorithm so that the result works as shown in this video:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/cohenSutherland.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

When the 'Clipping' check box is not checked, the segment should be displayed with color coding: Red indicates that the whole segment should be discarded based on the binary codes of its endpoints, green indicates that the whole segment should be rendered based on the binary codes of its endpoints, and yellow indicates that further testing is necessary to find any clip points.

When the 'Clipping' check box is checked, the segment will be rendered, discarded, or clipped to the clipping area as necessary. The segment will always be shown in green because it will always be clipped to its renderable portion. 

Areas of code that need attention are marked with `TODO`. Read the comments throughout the code to understand what needs to be done and how to do it. 

### Readme question

**Answer the following question(s) in your readme:** Does a yellow color-coded segment always indicate that clipping is necessary? Is it possible that a yellow segment may wind up being rendered in full? Explain your answers briefly in plain English. 

## Exercise 2: Dot product

In the next two exercises you'll look more closely at vector products. In this exercise you'll look at calculating the dot product and the projection of one vector onto another. Your goal is to set the values in the gui display correctly, and to set the position of the blue and red balls. 

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/dotProduct.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>


The blue ball should represent the projection of the blue vector onto the red vector, so it is collinear with the red vector. Likewise the other way round for the red ball. The triangular meshes representing the projection are based on the position of the red and blue balls, so once you've positioned the balls, the meshes will take care of themselves.  

Note that we're working on a pretty large scale (distances in the hundreds of units) and so the dot product is also going to be a fairly large number. Also, because the mouse-drag interface we're using is not especially precise, it won't be easy to manually line up the vectors to be perfectly aligned. At the precision we're working with, don't expect to ever see the dot product go to zero, but you should expect it to go to negative when the angle between the vectors is obtuse.  

You may use any Three.js vector methods you need *except* `.dot()`. You may use any JavaScript Math operators *except* `Math.cos()`. The cosine and dot products you should calculate manually using only standard arithmetic operators. 

## Exercise 3: Cross product

In this exercise you'll calculate the cross product <span class="latex">r \cross b</span> where r is the vector with the red cone and b is the vector with the blue cone, using a right-handed or left-handed cross product depending on the value in the gui dropdown. You'll then use the result to position the purple cone, as shown in the video:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/crossProduct.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

Because the actual magnitude of the cross product will often be unwieldy, we'll display the magnitude numerically in the gui, and only use the purple cone to visualize the direction of the dot product. The length of the visualization will be adjustable with the 'CP Display' gui slider. 

As in the case of the dot product exercise, this exercise will not allow for enough precision for us to manually position the cones to be perfectly parallel or perpendicular. The magnitude should be the correct sign and should approach zero as the red and blue vectors become more closely aligned. 

You may use any Three.js vector methods you need *except* `.cross()` and `.crossVectors()`. You should calculate the cross product manually using only standard arithmetic operators. 

## Submitting

Upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** 

In Moodle, submit **only** the link to your assignment directory on the shared server containing the fully implemented assignment and readme.txt.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=407320).