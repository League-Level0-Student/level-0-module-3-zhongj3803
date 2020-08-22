
void setup() {
 
  // set the size of your sketch
  size(500,500);
  
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i = 0; i<8; i++); {   
if (i%2==0) {
  fill(#FF0505);
  ellipse(250,250,230-10*i,230-10*i);
}
  //Use an if statement and modulo to alternate the color of your rings.
 else {
   fill(#030303);
   ellipse(250,250,230-10*i, 230-10*i);
 }
}
}
