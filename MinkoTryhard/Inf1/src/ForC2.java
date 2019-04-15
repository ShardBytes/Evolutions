import processing.core.PApplet;

import java.util.Random;

public class ForC2 extends PApplet {
	
	
	Random random = new Random();
	
	public static void main(String[] args) {
		PApplet.main("ForC2");
	}
	
	public void settings() {
		size(320 ,240);
		
	}
	
	
	@Override
	public void setup() {
		
		for (int y = 10; y < 600; y = y + 30){
		
			for (int i = 1; i < 6 ; i++) {
				y = y + 10;
				line(10, y, 200, y);
				
			}
		
		}
		
	}
	
}