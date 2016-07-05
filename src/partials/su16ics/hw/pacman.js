var ma = 45;
var mi = 0;
var mta = 0;
var oc = 5;
var rb = 0;
var re = 360;
var x = 250;
var y = 250;
var xa = 0;
var ya = 0;

function setup(){
  var can = createCanvas(500, 500);
  can.parent('sketch-holder');
  colorMode(RGB, 1);
  fill(1.0, 1.0, 0.0);
  noStroke();
}

function draw(){
  background(0.0, 0.0, 0.0);

  if(mta > ma){
    oc = -5;
  }
  if(mta < mi){
    oc = 5;
  }
  mta = mta + oc;
  x = x + xa;
  y = y + ya;

  if(x > 550){ x = 50; }
  else if(x > 450){
    arc(x-500, y, 100, 100, radians(rb + mta), radians(re - mta));
  }
  if(y > 550){ y = 50; }
  else if(y > 450){
    arc(x, y-500, 100, 100, radians(rb + mta), radians(re - mta));
  }
  if(x < -50){ x = 450; }
  else if(x < 50){
    arc(x+500, y, 100, 100, radians(rb + mta), radians(re - mta));
  }
  if(y < -50){ y = 450; }
  else if(y < 50){
    arc(x, y+500, 100, 100, radians(rb + mta), radians(re - mta));
  }

  arc(x, y, 100, 100, radians(rb + mta), radians(re - mta));

}

function keyPressed() {
    if (keyCode === DOWN_ARROW) {
      rb = 90;
      re = 450;
      xa = 0;
      ya = 3;
    } else if (keyCode === UP_ARROW) {
      rb = -90;
      re = 270;
      xa = 0;
      ya = -3;
    } else if (keyCode === LEFT_ARROW) {
      rb = 180;
      re = 540;
      xa = -3;
      ya = 0;
    } else if (keyCode === RIGHT_ARROW) {
      rb = 0;
      re = 360;
      xa = 3;
      ya = 0;
    }
}
