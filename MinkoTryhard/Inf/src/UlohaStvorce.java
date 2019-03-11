import processing.core.PApplet;

public class UlohaStvorce extends PApplet{
	
	public static void main(String[] args) {
		PApplet.main("UlohaStvorce");
	}
	
	public void settings() {
		size(320 ,240);
	}
	
	@Override
	public void setup() {
		strokeWeight(5);
		strokeCap(PApplet.SQUARE);
		stroke(255,255,255);
		rect(25,30,270,180);
		fill(0,0,255);
		rect(25,10,50,100);
	}
}
	

