```
cacheable: false
```

## Overview

This assignment is intended to give you an opportunity to exercise your creativity and explore graphics technologies independently. The project is weighted double an ordinary assignment towards your grade for the class.

In this assignment you'll choose one of three possible project options: **Interactive 3D (Three.js) option**, **Ray tracer option**, or **VFX option**. These options are described in more detail below:

* **Interactive 3D (Three.js) option** For this option, you will create an interactive 3D environment with Three.js. This may be a game, an architectural or other sort of walkthrough, a data visualization environment, or an interactive media artwork. There are no rules regarding what type of work it is, but there are some requirements. The project must have the following characteristics:
  * It must have a significant interactive component. I.e., users should be able to interact with the content in an interesting way. This may mean exploring an environment in a first-person walkthrough style, controlling an avatar, interacting with views for data visualization, et cetera.
  * It should contain at least 5 objects, at least 5 materials, and at least 3 textures (environment textures and cube maps count as single textures). It can of course contain more than this. If your idea is sufficiently complex and does *not* involve using this many assets, please check with me in advance.
  * It should make use of at least 2 features of Three.js that you have not yet dealt with directly in other assignments (it's okay if similar features were used in starter files, such as how picking was used in the Barycentric coordinate assignment starter file). Acceptable features could include, for example, skeleton animation, bump maps, picking, physics simulation, or GLSL shaders. Check the [Three.js homepage](http://threejs.org/), [Alteredqualia.com](http://alteredqualia.com/), and [Stemkoski's site](https://stemkoski.github.io/Three.js/) for many great examples. Your project may of course make use of more than 2 features.
  * You *may* make use of models, textures, materials, or shaders that you find online, provided you clearly give appropriate credit in the readme, you respect any license restrictions on the content, and the main coding work of the project is your own. Recommended resources include:
    * Models and Blender materials from [Blendswap](http://www.blendswap.com)
    * GLSL shaders from [glslsandbox.com](http://glslsandbox.com/)


* **Ray tracer option** For this option, you will continue working on the ray tracer you began for assignment 11, implementing *at least* 3 features from the following list (in no particular order):
  * Transparency/diffraction
  * Antialiasing
  * Texture mapping
  * Environment mapping
  * Soft shadows
  * Depth of field
  * Motion blur
  * Matrix transformations
  <p>

  [Shirley Chapter 13](https://moodle.pugetsound.edu/moodle/mod/resource/view.php?id=340287) is a good reference for moving forward with these topics.

  The ray tracer option is only available to people who have turned in a working implementation of assignment 11 on time.

* **VFX option** For this option, you will create a short video (one shot) with a 3D VFX component in Blender. It can include any content you wish, but must be 15 seconds or longer. You may either integrate a real character or element into a CG scene using green screen compositing, or integrate a CG element into a live video shot using camera and/or object tracking, or some combination of the above. The assignment should meet the following criteria:
  * The shot must make use of **at least two** of the following features (links are to suggested tutorial resources).
    * [Green screen compositing](https://vimeo.com/69284985)
    * [Camera/object tracking](https://www.youtube.com/watch?v=CVPcT0dJmoY)
    * [Image-based lighting](http://blendersushi.blogspot.com/2011/11/cycles-setting-image-based-lighting-ibl.html)
    * [OSL shaders](http://thhube.github.io/tutorials/osl/osl.html)
  * You *may* make use of models, textures, materials, plates or shaders that you find online, provided you give appropriate credit in the readme, you respect any license restrictions on the content, and the main work of the project is your own. Recommended resources include:
    * Green screen plates from [Hollywood Camera Work](http://www.hollywoodcamerawork.com/greenscreenplates.html) (terrific resource for VFX!)
    * Models and Blender materials from [Blendswap](http://www.blendswap.com)
    * GLSL shaders from [glslsandbox.com](http://glslsandbox.com/) (would require adapting to OSL)
    <p>

  **Students who wish to choose the VFX option are advised to begin early, as many of the skills required will rely on independent study beyond what is covered in class.**

Regardless of which assignment you choose, be sure to describe what you did and what your goal was with the project in the Readme file. Discuss challenges or problems that arose and describe what you learned in your attempts to solve the problems, and any other points you think I should take into consideration when grading the assignment.

## Submission

If your project is web-based, upload the project to its own directory inside your `public_html` directory using FileZilla. Be sure that all dependencies are in place and **Double check that your finished work displays properly in a browser online.** The directory should include the completed `README.txt`, which should also be viewable in the browser.

In Moodle, add a link to your finished assignment's public URL.
The Moodle page for this assignment is [here](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=340426).

If your project is not web-based (e.g. a VFX project), upload a zip file containing **all relevant assets and files, including a README.txt** to the Moodle page for the assignment. This should include (at least) the final video output, the original raw video input, the .blend file(s) used to do the compositing, and any models, textures, shaders, etc used. If your assets are too big to upload easily to the Moodle page in this way, include appropriate download links.  
