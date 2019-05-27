
import processing.core.PApplet;

import java.util.Random;

public class Opakovanie extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main("Opakovanie");
	}
	
	public void settings() {
		size(320, 240);
	}
	
	Random random = new Random();
	int x = random.nextInt(250);
	int y = random.nextInt(150);
	@Override
	public void setup() {
		
		int x = 50;
		int y = 50;
		
		for(int t = 0; t < 10; t++){
			for(int i = 0; i < 10; i++){
				ellipse(x,y,10,10);
				x+=10;
			}
			x = 50;
			y +=10;
		}
		
		
		
	}
}
