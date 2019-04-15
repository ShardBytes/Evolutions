import processing.core.PApplet;

import java.util.Random;

public class ForCyklus extends PApplet {
	
	private class Vector2 {
		
		Vector2(int x, int y) {
			this.x = x;
			this.y = y;
			
		}
		
		int x;
		int y;
		
		public Vector2 copy() {
			return new Vector2(this.x, this.y);
			
		}
		
	}
	
	Random random = new Random();
	
	public static void main(String[] args) {
		PApplet.main("ForCyklus");
	}
	
	public void settings() {
		size(1920 ,1080);
		fullScreen();
	}
	
	@Override
	public void setup() {
		/*
		fill(0);
		text("1", random.nextInt(320), random.nextInt(480));
		text("2", random.nextInt(320), random.nextInt(480));
		text("3", random.nextInt(320), random.nextInt(480));
		text("4", random.nextInt(320), random.nextInt(480));
		text("5", random.nextInt(320), random.nextInt(480));
		
		
		text("1", random.nextInt(320), random.nextInt(480));
		text("2", random.nextInt(320), random.nextInt(480));
		text("3", random.nextInt(320), random.nextInt(480));
		text("4", random.nextInt(320), random.nextInt(480));
		text("5", random.nextInt(320), random.nextInt(480));
		*/
		
		/*
		Vector2 staraPozicia = new Vector2(0, 0);
		Vector2 novaPozicia = new Vector2(0, 0);
		
		for(int i = 1; i < 100; i++) {
			novaPozicia.x = random.nextInt(320);
			novaPozicia.y = random.nextInt(480);
			
			line(staraPozicia.x, staraPozicia.y, novaPozicia.x, novaPozicia.y);
			
			staraPozicia = novaPozicia.copy();
			
		}
		*/
		
		int oldX = 0;
		int oldY = 0;
		int newX = 0;
		int newY = 0;
		textSize(15);
		for(int i = 0; i < 30; i++) {
			fill(0);
			text(i,newX, newY);
			
			int color = (255 << 24) + (random.nextInt(255) << 16) + (random.nextInt(255) << 8) + random.nextInt(255);
			System.out.println(color);
			stroke(color);
			
			int h = random.nextInt(11);
			strokeWeight(h);
			
			newX = random.nextInt(width);
			newY = random.nextInt(height);
			
			if(i == 0) {
				oldX = newX;
				oldY = newY;
				continue;
				
			}
			line(oldX, oldY, newX, newY);
			
			oldX = newX;
			oldY = newY;
			
		}
		
	}
	
}
