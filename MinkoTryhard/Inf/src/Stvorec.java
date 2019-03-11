import processing.core.PApplet;

public class Stvorec extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main("Stvorec");
	}
	
	public void settings() {
		size(320, 240);
	}
	
	@Override
	public void setup() {
		strokeWeight(0);
		stroke(0 ,255, 0);
		fill(255, 0 , 0);
		rect(10,10,50,50);
		fill(255,255,0);
		rect(70,70,50,50);
		fill(0,0,255);
		rect(10,70,50,50);
		fill(0,255,0);
		rect(70,10,50,50);
	}
}