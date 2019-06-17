import processing.core.PApplet;

import java.util.Arrays;
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
	
	int gameState = 0;
	int gameWinner = 0;
	int blueWins = 0;
	int redWins = 0;
	
	int timer = 0;
	
	int[][]cellData = {{0,0,0},
					   {0,0,0},
			           {0,0,0}};
	
	@Override
	public void setup() {
	
	}
	
	@Override
	public void draw() {
		clear();
		if (gameState == 0){
		table();
		drawData();
		detectWins();
		drawScore();
		}else if(gameState == 1){
			drawWinScreen();
		}
		
	}
	
	public void table() {
		
		int xOffsetSize = width / 5;
		int yOffsetSize = height / 5;
		
		this.smallerSize = width < height ? width : height;
		int smallerOffset = xOffsetSize < yOffsetSize ? xOffsetSize : yOffsetSize;
		
		this.smallerSize = smallerSize - smallerOffset;
		this.cellOffsetX = (width - smallerSize) / 2;
		this.cellOffsetY = (height - smallerSize) / 2;
		
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
		int[] clickedCell = getCellFromPos();
		System.out.println(Arrays.toString(clickedCell));
		
		if (clickedCell != null) {
			
			if (cellData[clickedCell[1]][clickedCell[0]] == 1) {
				
				if (whichPlayer == 0) {
					cellData[clickedCell[1]][clickedCell[0]] = 1;
					whichPlayer = 1;
				} else {
					cellData[clickedCell[1]][clickedCell[0]] = -1;
					whichPlayer = 0;
				}
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
		for(int i = 0; i < cellCount; i++){
			for(int j = 0; j < cellCount; j++){
				int topX = i * (smallerSize/cellCount) + cellOffsetX;
				int topY = j * (smallerSize/cellCount) + cellOffsetY;
				
				int bottomX = i * (smallerSize/cellCount) + cellOffsetX + (smallerSize/cellCount);
				int bottomY = j * (smallerSize/cellCount) + cellOffsetY + (smallerSize/cellCount);
			
				if(mouseX > topX && mouseX < bottomX && mouseY > topY && mouseY < bottomY){
					int[] returnValue = {i, j};
					return returnValue;
				}
			
			}
			
		}
		
		//int[] retV = {(width - cellOffsetX) / (smallerSize / cellCount) , (height - cellOffsetY) / (smallerSize / cellCount)};
		//print(Arrays.toString(retV));
		return null;
	
	}
	
	public void detectWins(){
		
		for(int i = 0; i < cellCount; i++){
			int[] row = cellData[i];
			int sum = arraySum(row);
			
			if( sum == cellCount) {
				playerWon(1);
				return;
			}else if( sum == -cellCount){
				playerWon(2);
				return;
			}
			
			
		}
		
		for( int i = 0; i < cellCount; i++){
			int[] column = new int[cellCount];
			for(int j = 0; j < cellCount; j++) {
				column[j] = cellData[j][i];
			}
			int sum = arraySum(column);
			
			if( sum == cellCount) {
				playerWon(1);
				return;
			}else if( sum == -cellCount){
				playerWon(2);
				return;
			}
			
		}
		
		int[] diagArr1 = new int[cellCount];
		int[] diagArr2 = new int[cellCount];
		
		for(int diagonal = 0; diagonal < cellCount; diagonal++){
			diagArr1[diagonal] = cellData[diagonal][diagonal];
			diagArr2[diagonal] = cellData[cellCount - (diagonal + 1)][diagonal];
			
		}
		int sum1 = arraySum(diagArr1);
		int sum2 = arraySum(diagArr2);
		
		if(sum1 == cellCount){
			playerWon(1);
			return;
			
		}else if ( sum1 == -cellCount){
			playerWon(2);
			return;
		}
		
		if(sum2 == cellCount){
			playerWon(1);
			return;
			
		}else if ( sum2 == -cellCount){
			playerWon(2);
			return;
		}
		
		if(arrayFull(cellData)){
			playerWon(0);
			return;
		}
		
	}
	
	public boolean arrayFull(int[][] arr){
		for(int[] row : arr){
			for(int cell : row) {
				if(cell == 0){
					return false;
				}
				
			}
		}
		return true;
		
	}
	
	public void playerWon(int playerNumber){
		
		if(playerNumber == 1){
			this.redWins = redWins + 1;
		}else if (playerNumber ==2){
			this.blueWins = blueWins +1;
		}
		
		this.gameWinner = playerNumber;
		this.gameState = 1;
	}
	
	public void drawWinScreen(){
		textAlign(CENTER,CENTER);
		textSize(20);
		if(gameWinner == 1){
			fill(255,0,0);
			text("Player X won",width/2,height,2);
		}else if(gameWinner == 2){
			fill(0,0,255);
			text("Player 0 won",width/2,height,2);
		}else{
			fill(255,255,0);
			text("Draw",width/2,height,2);
		}
		this.timer = timer + 1;
		if (timer == 240){
			gameState = 0;
			timer = 0;
			cellData = {{0,0,0,},
						{0,0,0,},
						{0,0,0,}};
		}
		
	}
	
	public void drawScore(){
		textAlign(CENTER,CENTER);
		textSize(20);
		fill(255,0,0);
		text(redWins,width/10,height/2);
		fill(0,0,255);
		text(blueWins,width*9/10,height/2);
	}
	
	public int arraySum(int[] arr) {
		int sum = 0;
		for(int element : arr) {
			sum += element;
		}
		
		return sum;
		
	}
	
}
