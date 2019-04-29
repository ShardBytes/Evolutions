import processing.core.PApplet;
import java.util.Random;

public class SustredKruznice extends PApplet {
	
	
	Random random = new Random();
	
	public static void main(String[] args) {
		PApplet.main("SustredKruznice");
	}
	
	public void settings() {
		size(320 ,240);
		
	}
	int x = 100;
	int y = 50;
	
	@Override
	public void setup() {
		int r = 100;
		
		for(int t = 0; t < 3; t++){
			
			for(int i = 100; i>0; i-=20) {
				fill(255, 0, 0);
				ellipse(t*100+50, 100, i, i);
				fill(0);
				ellipse(t*100+50, 100, i - 10, i - 10);
				
				
			}
			
			
		}
	}
}

