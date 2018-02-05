```
cacheable: false
```

Download the necessary files [here](/~tmullen/secure/f17cg/cs315-lab6.zip).

## Hammering Man

In this exercise you'll get some preparation with some of the tools you'll
eventually use to animate your robot. 

If you've ever spent any time in downtown Seattle you're surely familiar with the Hammering Man sculpture in front of the Seattle Art Museum. The figure endlessly swings his arm, hammering on an object he holds in his other hand, like this:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/hammeringMan.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

Your goal is to use grouping to alter the start file to match this behavior. 

I discussed the `Object3D` Three.js class in my lecture, but I also mentioned that the "grouping" terminology was an intuitive way to think about what's happening. A closely related concept is "parenting" which is the terminology used in Blender. All of these amount to the notion of placing an object into the local coordinate space of another (parent) object. 

You may use `Object3D`, as I have, to do your grouping. The documentation for that is [here](https://threejs.org/docs/#api/core/Object3D). However, as you can see in those docs, a newer and currently preferred class for this is the `Group` class, which is essentially identical except for the name. You may also use `Group` for this (and of course for your robot assignment also). Docs for that are [here](https://threejs.org/docs/#api/objects/Group), but the API is the same as for `Object3D`.