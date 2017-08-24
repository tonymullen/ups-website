```
cacheable: false
```

Download the necessary files [here](/~tmullen/secure/f17cg/cs315-lab9.zip).

## Plane intersection

Today's exercise is in preparation for writing your ray tracer. In this lab, you will implement intersection of a plane by a ray. This is a very important component of a ray tracer, because it is the first step in determining whether a ray has hit a triangle. 

This exercise and other upcoming exercises will enable you to visualize what's happening with intersection. 

The starter code contains a large plane and a ray represented by a green ball connected to a red cone. You can rotate and move the plane with the gui sliders, and drag the green ball around to change the position of the ray. Your task is to find the intersection point of the ray and the plane and place the small yellow ball at this point, as shown here: 

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/planeIntersection.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

Refer to the appendix in *3D Math Primer* covering ray-plane intersection.