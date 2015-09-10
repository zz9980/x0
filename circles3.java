//Wild circle #3
String title= "Click for another circle.";
String subtitle= "Press any key to erase.";
String author= "Teng Lin";
String shape= "Ellipse" ;
// Global Variables
float x,y;
int h,w,a,b,i;

//Setup, screen size, initialation.
void setup() {
  size (600,600);
  x= width/2;
  y= height/2;
  w= 100;         //width of ellipse.
  h= 80;          // height of ellipse.
  a= 55;          //head width
  b= 60;          //head height
  i= 10;          //eye
 
}


//Next frame.
void draw() {
  fill(255);
  text(title, 20,20);
  text(subtitle, width/2, 20);
  text(author, 20, height-20);
  text(shape, 260, height-20);
  text(w+"x"+h , width/2, height-20);
  
  //color+ellipses
  fill(0);
  ellipse(x,y, w,h);
  fill(255);
  ellipse(x,y-70, a,b);
  fill(0,0,255);
  ellipse(x-15,y-70, i,i);  //left eye
  ellipse(x+15,y-70, i,i);  //right eye
  text("Lin", x,y);           //name of creature on the head.
  
}


// Handle mouse clicks.
void mousePressed() {
  x= mouseX;
  y= mouseY;
  
}

//Handle Keyboard.
void keyPressed() {
  // Erase everthing, change size and color.
  background( random(255), random(255), random(255));
  fill (random(255), random(255), random(255));
  w= int(random(50,200));
  h= int(random(50,200));
  a= int(random(50,150));
  b= int(random(50,150));
  i= int(random(5,20));
  
  
}
