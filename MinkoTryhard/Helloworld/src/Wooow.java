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
		background(255);
		frameRate(10);
	
	}
	
	int xPoz = 300;
	int yPoz = 300;
	int staryUhol = 0;
	int operacia = 0;
	
	
	@Override
	public void draw() {
		
		operacia ++;
		
		
		
		if(operacia < 8){
			kocka(xPoz,yPoz,staryUhol);
			staryUhol +=45;
			
		}else if (operacia > 8 && operacia < 13){
			kocka(xPoz+20,yPoz,staryUhol);
			staryUhol += 90;
			
		}else if (operacia > 13 && operacia < 18){
			kocka(xPoz,yPoz+20,staryUhol);
			staryUhol += 90;
			
		}else if (operacia > 18 && operacia < 23){
			kocka(xPoz-20,yPoz,staryUhol);
			staryUhol += 90;
			
		}else if (operacia > 23 && operacia < 28){
			kocka(xPoz,yPoz-20,staryUhol);
			staryUhol += 90;
			
		}else if (operacia > 28 && operacia < 33){
			kocka(xPoz+40,yPoz,staryUhol);
			staryUhol += 90;
			
		}else if (operacia > 33 && operacia < 38){
			kocka(xPoz,yPoz+40,staryUhol);
			staryUhol += 90;
			
		}else if (operacia > 38 && operacia < 43){
			kocka(xPoz-40,yPoz,staryUhol);
			staryUhol += 90;
			
		}else if (operacia > 43 && operacia < 48){
			kocka(xPoz,yPoz-40,staryUhol);
			staryUhol += 90;
			
		}else if (operacia > 48 && operacia < 53){
			kocka(xPoz+60,yPoz,staryUhol);
			staryUhol += 90;
			
		}else if (operacia > 53 && operacia < 58){
			kocka(xPoz,yPoz+60,staryUhol);
			staryUhol += 90;
			
		}else if (operacia > 58 && operacia < 63){
			kocka(xPoz-60,yPoz,staryUhol);
			staryUhol += 90;
			
		}else if (operacia > 63 && operacia < 68){
			kocka(xPoz,yPoz-60,staryUhol);
			staryUhol += 90;
			
		}else if (operacia >68){
			clear();
			background(255);
			operacia = 0;
		}
		
		
	}
	
	
}
