```
cacheable: false
```

Download the necessary files [here](/~tmullen/secure/f17cg/cs315-lab7.zip).

## Smooth step

In this exercise you will get a little more practice with interpolation, and in particular with a few approaches to interpolation that yield smoother transitions than simple linear interpolation. 

In the exercise there are a yellow and a blue ball, whose positions can be adjusted by means of sliders. A third slider labeled "Yellow to blue" controls the t value (from 0 to 1) interpolating from the yellow ball's position to the blue ball's position. 

You'll implement four different interpolation schemes, each with slightly different ways of "smoothing" the movement. The result will behave as shown in the video:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/smoothStep.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

The darkest green ball is simply following a linear interpolation. Its speed does not change from one end to the other. The other balls, you'll notice, begin and end slower than the green ball, and then overtake it in the middle of the path. If several of these movements were placed end to end, this would result in smoother, more natural changes of direction. 

In the video, the lightness of the balls' color corresponds with the "smoothness" of the transition. 

In addition to the linear interpolation for the dark green ball, you'll implement cosine interpolation, Hermite smoothstep interpolation, and another interpolation method developed by Ken Perlin. 

The Hermite smoothstep interpolation scheme is described in your *3D Math Primer* textbook between pages 665 and 670. 

Cosine interpolation makes use of the cosine function values from 0 to pi to smooth the transition, as follows:

<img src="/~tmullen/images/cg/cosineInterpolation.png" style="height: 1.7em; margin:10px"></img> 
<!--
![Cosine Interpolation](/~tmullen/images/cg/cosineInterpolation.png)
-->

The third smoothing function you'll implement is as follows:

<img src="/~tmullen/images/cg/perlinSmooth.png" style="height: 1.8em; margin:10px"></img> 

<!--
<br>
![Perlin Smooth](/~tmullen/images/cg/perlinSmooth.png)
<br>
-->

It's up to you to determine which ball should use which interpolation scheme.