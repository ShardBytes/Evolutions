import processing.core.PApplet;
import java.util.Random;

public class Wooow extends PApplet {
	
	
	Random random = new Random();
	
	public static void main(String[] args) {
		PApplet.main("Wooow");
	}
	
	public void settings() {
		size(600 ,600);
		
	}
	int x = 10;
	int y = 10;
	
	public void kocka(int xKocky,int yKocky,int uhol){
		strokeWeight(1);
		noFill();
		pushMatrix();
		translate(xKocky,yKocky);
		rotate(radians(uhol));
		rect(-20,-20,40,40);
		rect(-5,-35,40,40);
		line(-20,-20,-5,-35);
		line(20,-20,35,-35);
		line(20,20,35,5);
		line(-20,20,-5,5);
		
		popMatrix();
	}
	
	@Override
	public void setup(){
	
	
	}
	
	int xStaraPoz = 300;
	int yStaraPoz = 300;
	int xNovaPoz = 0;
	int yNovaPoz = 0;
	int staryUhol = 0;
	int novyUhol = 0;
	
	
	@Override
	public void draw() {
		frameRate(2);
		//for(int j = 0; j<1000; j++){
			for(int i = 0; i < 5; i++){
				kocka(xStaraPoz, yStaraPoz, staryUhol);
				staryUhol += 45;
			}
			
		//}
	}
	
	
}
