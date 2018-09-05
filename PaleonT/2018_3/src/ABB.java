import processing.core.PApplet;

public class ABB extends PApplet {
	public static void main(String[] args) {
		PApplet.main("ABB");
	}
	@Override
	public void setup(){
		frameRate(60f);
	}

	@Override
	public void settings() {
		size(640, 420);

	}

	@Override
	public void draw() {
		if (mousePressed) {
			if (mouseButton == LEFT) {
				fill(51, 251, 83);
				line(mouseX, mouseY, mouseX+random(-500,500),mouseY+random(-100,100));

			}
		}
	}

}
