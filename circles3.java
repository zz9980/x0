//Wild circle #3
String title= "Click for another circle.";
String subtitle= "Press any key to erase.";
String author= "Teng Lin";
String shape= "Ellipse" ;
// Global Variables
float x,y;
int h,w,a,b,i,o,u,n,l,k,z,c,p,d;

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
  o= 0;           //body color
  z= 0;           //body color
  c= 0;           //body color
  u= 255;         //head color
  p= 255;         //head color
  d= 255;         //head color
  n= 255;         //eye color
  l= 0;           //eye color
  k= 0;           //eye color
}


//Next frame.
void draw() {
  fill(0);
  text(title, 20,20);
  text(subtitle, width/2, 20);
  text(author, 20, height-20);
  text(shape, 260, height-20);
  text(w+"x"+h , width/2, height-20);
  
  //color+ellipses
  fill(o,z,c);
  ellipse(x,y, w,h);
  fill(u,p,d);
  ellipse(x,y-70, a,b);
  fill(k,l,n);
  ellipse(x-15,y-70, i,i);     //left eye
  ellipse(x+15,y-70, i,i);     //right eye
  text("Lin", x,y);            //name of creature.
  
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
  o= int(random(255));
  u= int(random(255));
  p= int(random(255));
  d= int(random(255));
  n= int(random(255));
  l= int(random(255));
  k= int(random(255));
  z= int(random(255));
  c= int(random(255));
}
