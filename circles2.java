//// Wild circles #2.
String title=  "Click for another circle.";
String subtitle=  "Press any key to erase.";
String author=  "Bruce Alan Martin";

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size(500, 500);
  x=  width/2;
  y=  height/2;
}

// Next frame. //
void draw() {
  text( title, 10, 10 );
  text( author, 10, height-10 );
  //
  ellipse(x, y, 80, 80);
}


//  Handle mouse clicks //
void mousePressed() {
  x=  mouseX;
  y=  mouseY;
}


//  Handle keyboard //
void keyPressed() {
  // Erase everything & change colors. //
  background( random(255), random(255), random(255) );
  fill( random(255), random(255), random(255) );
}
