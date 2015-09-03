//// Wild circles #1.

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size(300, 300);        // Try changing the width & height.
  x=  width/5;
  y=  height/7;
}

// Next frame:  draw three circles. //
void draw() {
  fill( 255,123,222);
  ellipse(x, y, 90, 80);
  fill( 123, 0, 200);
  ellipse(x+60, y+70, 40, 40);
  fill( 0,0,180);
  ellipse(x+100, y+90, 20, 20);
 
  // Move them???? //--            
  x=  x - 0.1111;  y=  y + 1.2;
  
  // Insert BREAK here ^
  // to uncomment the above code,
}
