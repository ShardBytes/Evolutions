import processing.core.PApplet;

public class wow extends PApplet {
	public static void main(String[] args) {
		PApplet.main("wow");
	}

	@Override
	public void setup() {
		frameRate(500);
	}

	@Override
	public void settings() {
		size(1280,720);
	}

	@Override
	public void draw() {
		if(mousePressed) {
			if (mouseButton == LEFT) {
				fill(random(0,255), random(0,255), random(0,255));
				rect(mouseX, mouseY, random(1,100), random(1,100));
			}
		}
	}

	@Override
	public void mousePressed() {

		}
	}

