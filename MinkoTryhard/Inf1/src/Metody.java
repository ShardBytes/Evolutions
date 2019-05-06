import processing.core.PApplet;
import java.util.Random;

public class Metody extends PApplet {
	
	
	Random random = new Random();
	
	public static void main(String[] args) {
		PApplet.main("Metody");
	}
	
	public void settings() {
		size(320, 240);
		
	}
	
	public void domcek(int x, int y) {
		
		rect(x, y, 50, 50);
		line(x, y, x + 25, y - 25);
		line(x + 25, y - 25, x + 50, y);
		
		
	}
	
	
	
	@Override
	public void setup() {
	
	
	
	
	}
	
	@Override
	public void draw() {
	
	
	}
	
	@Override
	public void mouseClicked() {
		if(mouseButton == LEFT){
			fill(255,0,0);
			domcek(mouseX,mouseY);
		}
		if(mouseButton == RIGHT){
			fill(0,255,0);
			ellipse(mouseX,mouseY,25,25);
		}
		if(mouseButton == CENTER){
			rect(mouseY,mouseX,20,20);
		}
	}
	
	@Override
	public void keyPressed() {
		if(keyCode == 32 ){
			fill(0);
			ellipse(width/2,height/2,50,50);
		}
	}
}

