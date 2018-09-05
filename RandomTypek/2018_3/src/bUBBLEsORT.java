import processing.core.PApplet;

public class bUBBLEsORT extends PApplet {
	private int[] arai = {125,45,7,42,14,58,89,6,31,40,8};
	public static void main(String[] args) {
		PApplet.main("bUBBLEsORT");
	}

	@Override
	public void setup() {
		frameRate(500);
	}

	@Override
	public void settings() {
		size(1280,720);
	}

	@Override
	public void draw() {
		clear();
		background(255,255,255);
		fill(0);
		textFont(createFont("Comic Sans MS",30));
		for (int i = 0, araiLength = arai.length; i < araiLength; i++) {
			int x = arai[i];
			text(x, width/arai.length*i,30);
			rect(width/arai.length*i,height,10,-(x*5));
		}
	}

	@Override
	public void mousePressed() {
		int n = arai.length;
		int temp = 0;
		for(int j=1; j < n; j++){
			if(arai[j-1] > arai[j]){
				//swap elements
				temp = arai[j-1];
				arai[j-1] = arai[j];
				arai[j] = temp;
			}
		}
}}


