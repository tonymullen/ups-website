```
cacheable: false
```

## Pac Man

Welcome to Processing! For today's lab you'll start with the [Pac Man starter](http://mathcs.pugetsound.edu/~tmullen/ics/Pacman_starter.zip) file and add functionality to make Pac Man chomp in the correct direction. The goal is to get Pac Man to behave like this (use the keyboard arrow keys to get him moving):

<script src="//cdnjs.cloudflare.com/ajax/libs/p5.js/0.5.2/p5.js"></script>


<script language="javascript" type="text/javascript">
window.addEventListener("keydown",function(a){[32,37,38,39,40].indexOf(a.keyCode)>-1&&a.preventDefault()},!1); function setup(){var a=createCanvas(500,500);a.parent("sketch-holder"),colorMode(RGB,1),fill(1,1,0),noStroke()}function draw(){background(0,0,0),mta>ma&&(oc=-5),mi>mta&&(oc=5),mta+=oc,x+=xa,y+=ya,x>550?x=50:x>450&&arc(x-500,y,100,100,radians(rb+mta),radians(re-mta)),y>550?y=50:y>450&&arc(x,y-500,100,100,radians(rb+mta),radians(re-mta)),-50>x?x=450:50>x&&arc(x+500,y,100,100,radians(rb+mta),radians(re-mta)),-50>y?y=450:50>y&&arc(x,y+500,100,100,radians(rb+mta),radians(re-mta)),arc(x,y,100,100,radians(rb+mta),radians(re-mta))}function keyPressed(){keyCode===DOWN_ARROW?(rb=90,re=450,xa=0,ya=3):keyCode===UP_ARROW?(rb=-90,re=270,xa=0,ya=-3):keyCode===LEFT_ARROW?(rb=180,re=540,xa=-3,ya=0):keyCode===RIGHT_ARROW&&(rb=0,re=360,xa=3,ya=0)}var ma=45,mi=0,mta=0,oc=5,rb=0,re=360,x=250,y=250,xa=0,ya=0;
</script>


<div id="sketch-holder"></div>

In this sketch, the Pac Man character is drawn using an [arc](https://processing.org/reference/arc_.html) function. Take a look at the Processing API to understand how arcs are defined.

The two challenges with this lab are to make the opening and closing of the mouth point in the direction that Pac Man is moving, and to make sure that they open and close regularly. Think about how you can do this as simply as possible, using a variable that changes over time to describe the mouth angle. When it's in the state of opening, it will increase by some constant with each iteration of the `draw` loop, and when it's in the state of closing, it will decrease by the same constant with each iteration of the `draw` loop.

Depending on whether Pac Man is facing north, south, east, or west, the start and end angle of the arc will be different. You can change these values in the appropriate `keyCode` condition in the `keyPressed` function.

## Submitting your lab assignment                                                  
Submit your lab at the [Moodle submission page](https://moodle.pugetsound.edu/moodle/mod/assign/view.php?id=335867).
