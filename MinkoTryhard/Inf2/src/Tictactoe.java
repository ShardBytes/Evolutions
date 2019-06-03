import processing.core.PApplet;

import java.util.Random;

public class Tictactoe extends PApplet {
	
	
	Random random = new Random();
	
	public static void main(String[] args) {
		PApplet.main("Tictactoe");
	}
	
	public void settings() {
		size(320, 240);
		
	}
	
	int smallerSize = 0;
	int cellOffsetX = 0;
	int cellOffsetY = 0;
	int cellCount = 5;
	
	
	@Override
	public void setup() {
	
	}
	
	@Override
	public void draw() {
		clear();
		table();
	}
	
	public void table() {
		
		int xOffsetSize = width / 5;
		int yOffsetSize = height / 5;
		
		int smallerSize = width < height ? width : height;
		int smallerOffset = xOffsetSize < yOffsetSize ? xOffsetSize : yOffsetSize;
		
		smallerSize = smallerSize - smallerOffset;
		int cellOffsetX = (width - smallerSize) / 2;
		int cellOffsetY = (height - smallerSize) / 2;
		
		stroke(255);
		strokeWeight(1);
		noFill();
		
		for (int i = 0; i < cellCount; i++) {
			for (int j = 0; j < cellCount; j++)
			{
				rect(i * (smallerSize / cellCount) + cellOffsetX, j * (smallerSize / cellCount) + cellOffsetY, smallerSize / cellCount, smallerSize / cellCount);
			}
		}
		
	}
	
}
