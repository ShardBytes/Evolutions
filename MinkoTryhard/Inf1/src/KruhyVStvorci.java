import processing.core.PApplet;
import java.util.Random;

public class KruhyVStvorci extends PApplet {
	
	
	Random random = new Random();
	
	public static void main(String[] args) {
		PApplet.main("KruhyVStvorci");
	}
	
	public void settings() {
		size(320 ,240);
		
	}
	int x = 50;
	int y = 50;
	
	@Override
	public void setup() {
		fill(255,0,0);
		ellipse(x,y,10,10);
		
		for(int i = 0; i<10; i++) {
			for (int t = 0; t < 10; t++) {
				
				ellipse(x, y, 10, 10);
				x += 10;
			}
			x = 50;
			y += 10;
		}
	}
}
