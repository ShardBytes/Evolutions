import processing.core.PApplet;
import java.util.Random;

public class Podmienky extends PApplet {
	
	
	Random random = new Random();
	
	public static void main(String[] args) {
		PApplet.main("Podmienky");
	}
	
	public void settings() {
		size(320 ,240);
		
	}
	int x = 10;
	int y = 10;
	
	@Override
	public void setup(){
	
	}
	
	@Override
	public void draw() {
	
	}
	
	@Override
	public void mouseClicked() {
		if (mouseButton == LEFT) {
			int y = mouseY;
			
			if (y > 120) {
				fill(255, 0, 0);
			} else {
				fill(0, 0, 255);
			}
			ellipse(mouseX, mouseY, 10, 10);
		}
	}
	
	@Override
	public void keyPressed() {
		if(keyCode == 32){
			clear();
		}
	}
}
