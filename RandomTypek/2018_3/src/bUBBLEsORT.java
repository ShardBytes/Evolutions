import processing.core.PApplet;

import java.util.ArrayList;

public class bUBBLEsORT extends PApplet {

	private ArrayList<Tycka> tycky = new ArrayList<>();
	private int[] arai = {125,45,7,42,14,58,89,6,31,40,8};
	private String[] fonts = {"Arial", "Comic Sans MS", "Impact", "Times New Roman"};

	private int stuff = 0;

	public class Tycka {
		private Vector2D pos;
		private int value;

		public Tycka(int value){
			this.pos = new Vector2D();
			this.value = value;

		}

		public Vector2D getPos() {
			return pos;
		}

		public void setPos(Vector2D pos) {
			this.pos = pos;
		}

		public void setPos(int x, int y){
			this.pos = new Vector2D(x,y);
		}

		public void setPos(int x){
			this.pos = new Vector2D(x,0);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public void drawTycka() {
			text(value, pos.x, 20);
			rect(pos.x, height, 10, -value*5);

		}

	}

	public static void main(String[] args) {
		PApplet.main("bUBBLEsORT");
	}

	@Override
	public void setup() {
		frameRate(30);
	}

	@Override
	public void settings() {
		size(1280,720);
		for(int value: arai) {
			tycky.add(new Tycka(value));
		}
		System.out.println("tycky.size() = " + tycky.size());

	}

	@Override
	public void draw() {
		clear();
		background(255,255,255);
		fill(0);
		//textFont(createFont(fonts[Math.round(random(0,fonts.length-1))],30));

		stuff++;

		tycky.forEach(tycka -> {
			tycka.setPos(stuff);
			tycka.drawTycka();
			System.out.println(tycka.getPos());
			System.out.println(tycka.getValue());
		});

	}

	@Override
	public void mousePressed() {
		text("clicc",mouseX,mouseY);
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
	}

}


