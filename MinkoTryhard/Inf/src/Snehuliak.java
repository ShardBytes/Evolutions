import processing.core.PApplet;


public class Snehuliak extends PApplet{


 
	
	public static void main(String[] args) {
		PApplet.main("Snehuliak");
	}
	
	public void settings() {
		size(320 ,480);
	}
	
	@Override
	public void setup() {
		strokeWeight(0);
		stroke(0,0,255);
		fill(0,0,255);
		circle(100,100,60);
		circle(100,170,80);
		circle(100,260,100);
		fill(100,0,200);
		rect(60,40,80,40);
		fill(0,100,255);
		circle(90,90,10);
		circle(110,90,10);
		stroke(255,0,0);
		strokeWeight(5);
		line(100,100,100,110);
		line(90,120,110,120);
		
		strokeWeight(0);
		fill(0);
		circle(100,150, 10);
		circle(100,170, 10);
		circle(100,190, 10);
	}
	
}