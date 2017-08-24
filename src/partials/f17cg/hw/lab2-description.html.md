```
cacheable: false
```


Download the necessary files [here](/~tmullen/secure/f17cg/cs315-lab2.zip).

## Overview

For this lab you should work in pairs. Each pair will model a shape in Blender and export it to an obj file to be displayed in the Three.js scene included in the starter file. The result will be a Three.js scene with two objects in it that rotate in opposite directions, as shown in the video. **These are only example objects. Your objects do not need to resemble the ones in the video. See below for guidelines on what to make.**:

<video width="480" height="360" controls>
  <source src="/~tmullen/images/cg/widgets.ogv" type="video/ogg;" codecs="theora, vorbis">
Your browser does not support the video tag.
</video>

I recommend uploading your objects directly to your public_html directory. This sidesteps the problem of passing the data from one person to the other person's local html folder. 

### Working in pairs

Divide your time in half, with one person doing the modeling for each widget, while the other person observes in the style of pair programming. Do not simply work simultaneously on separate widgets. This will enable one person to look up hotkeys and commands and try to identify if the modeler is overlooking anything, etc. 

## Getting started

The Three.js file does not need to be altered in any way. It is currently set up to read two OBJ files with names `widget1.obj` and `widget2.obj`. All you have to do is create those two files and put them in the directory with the Three.js script. The focus on this lab is on creating mesh objects in Blender and exporting them correctly. 

### Objects and meshes

Each person's widget should be a single Blender 3D object composed of at least 5 mesh primitives. The primitives can be manipulated and edited in any way, and may be of any primitive type. 

Begin with the default cube. Select it by right clicking on it, then press the Tab key to toggle between Object Mode and Edit Mode (this can also be done using the drop down menu in the header strip below the 3D Viewport). **Edit Mode is for editing meshes. In Edit Mode you can select and modify individual vertices. Object Mode is for working with objects. You should be in Object Mode to export your OBJ file.***

In Edit Mode, you can add new mesh primitives (spheres, cubes, cones, cylinders, etc.) by pressing Shift+A and choosing a primitive from the menu as shown:

<img src="/~tmullen/images/cg/blendermesh.png" width="100%"></img>

The new mesh primitive will appear wherever your 3D cursor is located.

### Selection

You can select vertices one by one by *right clicking* on them. Hold the Shift key while right clicking to select multiple vertices one by one. A few other ways of selecting vertices include:

  * **'A' key** select/unselect all vertices in the object
  * **'B' key** box select vertices by dragging the mouse in a box shape around them
  * **'C' key** circle select vertices by dragging the mouse like a paintbrush over them (Escape key to finish selection
  * **'L' key** select a single mesh shape within the object, for example a single mesh primitive

Chapter 1 of [Mastering Blender](/~tmullen/secure/f17cg/MasteringBlender2E.pdf) gives a rundown of some more advanced selection tools, but these should be enough for this lab. 

### Modeling

Once you've selected portions of your meshes, you can rotate, scale, or translate (move) those vertices using R, S, and G keys, just as you did with whole objects in the previous lab. You an constrain these transformations to axes by pressing X, Y, or Z. 

Blender's modifier system enables mirroring, beveling, boolean operations (constructive solid geometry), and many other mesh effects to be created in a non-destructive way (if the modifier is deleted, the effect is removed). Try adding a modifier using the panel on the right with the wrench icon. If you wish the modifier effect to be permanent when you export the object, you will need to apply the modifier to make the modified geometry real. 

## Tips

* Be aware of where the object's center (origin) is. This will never move when you are in Edit Mode. It will be placed at the origin in your Three.js scene. If your mesh is offset from this point in Blender, it will be offset in your Three.js scene.
* Try to design your widgets such that they allow room for each other in the Three.js scene. They will both be located at the same origin, so make their shapes such that they can share the space. In the example above, for example, one object appears inside the other object. 

## Exporting

Export your object by going to `File>Export>Wavefront (.obj)` as shown here: 

![Blender](/~tmullen/images/cg/blenderexport1.png)

Choose 'Selection Only' and uncheck 'Write Materials'. Set the 'Scale' value to 500. Put the name `widget1.obj` or `widget2.obj` in the file name field at the top of the window (NB: the directory you're exporting to is in the top field, the name of the file is in the next field down).

![Blender](/~tmullen/images/cg/blenderexport2.png)

The file should appear where you saved it. Move it into your http directory with your Three.js scene to have it loaded into the scene. Note that the objects will not be displayed in the scene unless both `widget1.obj` and `widget2.obj` are found. 