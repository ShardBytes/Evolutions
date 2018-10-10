import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Objects;

public class bUBBLEsORT extends PApplet {

	private ArrayList<Tycka> tycky = new ArrayList<>();
	private int[] arai = {125,45,7,42,14,58,89,6,31,40,8};
	private String[] fonts = {"Arial", "Comic Sans MS", "Impact", "Times New Roman"};

	public class Tycka {
		private Tween value;
		private int pos;

		public Tycka(double val){
			value = new Tween(val,0.1d,true,true);
		}

		public void setPos(int x){
			pos = x;
		}

		public int getValue() {
			return value.getInt();
		}

		public void setValue(int val) {
			value.setTarget(val);
			//this.value.setValue(val);
		}

		public void drawTycka() {
			value.step(1.0f);

			text(value.getInt(), pos, 20);
			rect(pos, height, 10, -value.getInt()*5);

		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Tycka tycka = (Tycka) o;
			return pos == tycka.pos &&
					Objects.equals(value, tycka.value);
		}

		@Override
		public int hashCode() {
			return Objects.hash(value, pos);
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
			Tycka tycka = new Tycka(value);
			tycky.add(tycka);
			int partSize = width / arai.length;
			tycka.setPos(partSize * tycky.indexOf(tycka));
		}

	}

	@Override
	public void draw() {
		clear();
		background(255,255,255);
		fill(0);
		//textFont(createFont(fonts[Math.round(random(0,fonts.length-1))],30));

		tycky.forEach(tycka -> {
			tycka.setValue(arai[tycky.indexOf(tycka)]);
			tycka.drawTycka();
		});

	}

	@Override
	public void mousePressed() {
		text("clicc",mouseX,mouseY);
		int n = tycky.size();
		int temp;
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


