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
	int cellCount = 3;
	
	int whichPlayer = 0;
	
	int[][]cellData = {{0,0,0},
					   {0,0,0},
			           {0,0,0}};
	
	@Override
	public void setup() {
	
	}
	
	@Override
	public void draw() {
		clear();
		table();
		drawData();
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
	
	public void drawData(){
		for(int i = 0; i < cellCount; i++){
			for(int j = 0; j < cellCount; j++ ){
				int cell = cellData[j][i];
				if(cell==1){
					drawX(i * (smallerSize / cellCount) + cellOffsetX, j * smallerSize/cellCount + cellOffsetY,smallerSize/cellCount);
				}else if ( cell == -1){
					drawO(i * (smallerSize / cellCount) + cellOffsetX, j * smallerSize/cellCount + cellOffsetY,smallerSize/cellCount);
				}
			}
		}
		
		
	}
	
	@Override
	public void mouseClicked() {
		int []clickedCell = getCellFromPos();
		System.out.println(clickedCell);
		
		if (clickedCell != null){
			if(whichPlayer == 0){
				cellData[clickedCell[1]][clickedCell[0]] = 1;
				whichPlayer = 1;}
			else {
				cellData[clickedCell[1]][clickedCell[0]] = -1;
				whichPlayer = 0;
			}
		}
		
		
		
		
	
	
	}
	
	public void drawX (int pozX ,int pozY ,int cellSize){
		stroke(255, 0, 0);
		strokeWeight(5);
		
		float topLeftX = 0.2f * cellSize + pozX;
		float topLeftY = 0.2f * cellSize + pozY;
		
		float topRightX = 0.8f * cellSize +pozX;
		float topRightY = 0.2f * cellSize +pozY;
		
		float bottomLeftX = 0.2f * cellSize +pozX;
		float bottomLeftY = 0.8f * cellSize +pozY;
		
		float bottomRightX = 0.8f * cellSize +pozX;
		float bottomRightY = 0.8f * cellSize +pozY;
		
		line(topLeftX,topLeftY,bottomRightX,bottomRightY);
		line(topRightX,topRightY,bottomLeftX,bottomLeftY);
		
	}
	public void drawO(int pozX, int pozY, int cellSize) {
		stroke(0, 0, 255);
		strokeWeight(5);
		
		float centerX = 0.5f * cellSize + pozX;
		float centerY = 0.5f * cellSize + pozY;
		
		ellipse(centerX, centerY, 0.6f * cellSize, 0.6f * cellSize);
	}
	
	public int[] getCellFromPos(){
		for ( int i = 0; i < cellCount; i++){
			for(int j = 0; j < cellCount; j++){
				int topX = i * (smallerSize/cellCount)+cellOffsetX;
				int topY = j * (smallerSize/cellCount)+cellOffsetY;
				
				int bottomX = i * (smallerSize/cellCount)+cellOffsetX + (smallerSize/cellCount);
				int bottomY = j * (smallerSize/cellCount)+cellOffsetY + (smallerSize/cellCount);
			
				if(mouseX > topX && mouseX < bottomX && mouseY > topY && mouseY < bottomY){
					int[] returnValue = {i, j};
					return returnValue;
				}
			
			}
			
		}
		return null;
	
	}
	
}
