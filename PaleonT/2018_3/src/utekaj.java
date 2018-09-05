import processing.core.PApplet;

public class utekaj extends PApplet {
	public static void main(String[] args) {
		PApplet.main("utekaj");
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
				clear();
				fill(0, 0, 0);
				background(255,255,255);
				ellipse(mouseX,mouseY,30,30);
				line(mouseX,mouseY,mouseX,mouseY+70);
				line(mouseX-20,mouseY+30,mouseX+20,mouseY+30);


			}
		}
	}
}


