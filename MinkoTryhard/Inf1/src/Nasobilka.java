import processing.core.PApplet;
import java.util.Random;

public class Nasobilka extends PApplet {
	
	
	Random random = new Random();
	
	public static void main(String[] args) {
		PApplet.main("Nasobilka");
	}
	
	public void settings() {
		size(320 ,240);
		
	}
	int x = 10;
	int y = 10;
	
	@Override
	public void setup() {
		fill(0);
		
		
		for(int i = 1; i<11; i++) {
			for (int t = 1; t < 11; t++) {
				
				text(i * t , x * 2  , y * 2  );
				x += 10;
			}
			x = 10;
			y += 10;
		}
	}
}
