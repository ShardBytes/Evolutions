import processing.core.PApplet;

public class utekaj extends PApplet {
	public static void main(String[] args) {
		PApplet.main("utekaj");
	}
	@Override
	public void setup(){
		frameRate(10f);
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
				for (int i = 0; i <2; i++){
					fill(0,0,0);
					float a = random(-50,50);
					float b = random(100,120);
					float c = random(-20,50);
					float d = random(-30,30);
					line(mouseX,mouseY+70,mouseX+a,mouseY+b);
					line(mouseX,mouseY+30,mouseX+d,mouseY+c);
				}


			}
		}
	}
}


