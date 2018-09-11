import processing.core.PApplet;

public class Funk extends PApplet {
	public static void main(String[] args) {
		PApplet.main("Funk");
	}
	@Override
	public void setup(){
		frameRate(23f);
	}
	@Override
	public void settings() {
		size(1366,768);
	}
	@Override
	public void draw() {
		clear();
		background(200);
		fill(0, 0, 0);
		strokeWeight(3f);
		stroke(0);
		translate(width / 2, height / 2);
		//čary a čisla(I guess)
		line(0 - (width / 2), 0, width, 0);
		line(0, 0 - (height / 2), 0, height);
		for (int i = -25; i < 25; i++) {
			stroke(52);
			strokeWeight(1);
			line(i*30, 0 - (height / 2), i*30, height);
			line(0 - (width / 2), i*30, width, i*30);
			text(i,(i*30)+2,12);
			text(i == 0 ? "" : String.valueOf(-i),2,i*30-2);
		}
		//Funkcie zborazuje
		for (float x = -25; x < 25; x += 0.001){
			strokeWeight(0.5f);
			stroke(255,0,0);
			float y = (x+5)*3 ;
			ellipse(x*30, -y*30,1 ,1);
		}



	}
}

