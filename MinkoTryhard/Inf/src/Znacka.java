import processing.core.PApplet;

import java.util.Random;

public class Znacka extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main("Znacka");
	}
	
	public void settings() {
		size(320, 240);
	}
	
	Random random = new Random();
	int x = random.nextInt(250);
	int y = random.nextInt(150);
	@Override
	public void setup() {
		
		
		stroke(255, 0, 0);
		strokeWeight(10);
		fill(255);
		circle(x+50, y+50, 60);
		fill(0);
		textSize(30);
		textAlign(PApplet.CENTER, PApplet.CENTER);
		text("60", x+50, y+45);
		
	}
}