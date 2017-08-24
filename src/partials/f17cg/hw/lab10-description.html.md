```
cacheable: false
```

Download the necessary files [here](/~tmullen/secure/f17cg/cs315-lab10.zip).

## Sphere reflection

Once you've determined whether your ray intersects an object (in this case a sphere), the next thing to do is to calculate the color that the object's surface contributes to the pixel through which the ray was sent. In order to do this, you need to calculate the effect of the light on that point. 

Calculating the specular and the diffuse components of the lighting both require taking into consideration the reflection angle of the light on the surface of the object. In this exercise, you'll get some practice calculating that. 

In the starter code, there's a sphere that can be dragged around the scene with your mouse and scaled with the GUI slider. There is also a green ball that can be dragged around the scene. You can think of the green ball as representing a light source. The small yellow ball can also be dragged around on the surface of the sphere. This represents the point at which the light is hitting the surface. 

Your task is to position the red cone such that it accurately represents the reflection vector of the green ball. The line from the surface point to the cone should be the same length as the line from the green ball to the surface point, and the angle should be correct. The behavior is shown here:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/sphereReflection.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

Refer to the class slides and to the Shirley reading for calculating the reflection vector. It is also discussed in Chapter 10.6 of 3D Math Primer.