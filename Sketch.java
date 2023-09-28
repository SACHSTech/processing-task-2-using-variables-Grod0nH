import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Drawing of a House WITH VARIABLES
   * @Gordon:
   */
  public void settings() {
    size(600, 600);
  }


  public void setup() {
    background(173, 216, 230);
  }


  public void draw() {    
	  

//Foreground
    fill(34,139,34);
    rect((float)(width*0),(float)(height/1.2),(float)(width/1), (float)(height/6));

//House base
    fill(245,245,220);
    rect((float)(width/3.333),(float)(height/2),(float)(width/3),(float)(height/3));

//House Top
    fill(128,0,0);
    triangle((float)(width/3.333),(float)(height/2),(float)(width/2.16),(float)(height/4), (float)(width/1.58), (float)(height/2));

//Door
    fill(122,81,58);
    rect((float)(width/2.5),(float)(height/1.5),(float)(width/7.5),(float)(height/6));

//Door knob
    fill(255,255,204);
    ellipse((float)(width/2.35),(float)(height/1.3333),(width/30),(float)(height/30));

//Sun
    fill(255,255,153);
    ellipse((float)(width/1),(float)(height*0),(float)(width/4),(float)(height/4));
 
  }
  
  
}