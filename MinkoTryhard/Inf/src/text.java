import processing.core.PApplet;

public class text extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main("text");
	}
	
	public void settings() {
		size(320, 240);
	}
	
	@Override
	public void setup() {
		textSize(20);
		fill(255,0,0);
		text("Dominik Dina", 50,50);
		fill(255,0,255);
		text("Zelezniciarska 32", 50,80);
		fill(0,255,255);
		text("Lubotin 065 41", 50,110);
		
		fill(0);
		pushMatrix();
		translate(240,50);
		rotate(radians(390));
		text("Dominik", 0 ,0);
		popMatrix();
		
		pushMatrix();
		translate(240,50);
		rotate(radians(420));
		text("Dominik",0,0);
		popMatrix();
		
		pushMatrix();
		translate(240,50);
		rotate(radians(450));
		text("Dominik",0,0);
		popMatrix();
	}
}