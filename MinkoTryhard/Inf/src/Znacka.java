import processing.core.PApplet;

public class Znacka extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main("Znacka");
	}
	
	public void settings() {
		size(320, 240);
	}
	
	@Override
	public void setup() {
		stroke(255, 0, 0);
		strokeWeight(10);
		fill(255);
		circle(100, 100, 60);
		fill(0);
		textSize(30);
		textAlign(PApplet.CENTER, PApplet.CENTER);
		text("60", 100, 95);
		
	}
}