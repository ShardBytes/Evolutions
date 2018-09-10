import processing.core.PApplet;

public class Funk extends PApplet {
	public static void main(String[] args) {
		PApplet.main("Funk");
	}
	@Override
	public void setup(){
		frameRate(60f);
	}

	@Override
	public void settings() {
		size(1336, 768);
	}

	@Override
	public void draw() {
		clear();
		background(255, 255, 255);
		fill(0, 0, 0);
		strokeWeight(5f);
		line(width - (width / 100 * 5), height -(height/ 100 * 5), width / 100 * 5, height -(height/ 100 * 5));
		line(width/100*5,height/100*5, width/100*5,height-(height/100*5));
		int w2 = ((width-(width/100*5))-width/100*5)/100*5;
		int h2 = ((height-(height/100*5))*height/100*5)/100*5;
		textFont(createFont("Comic Sans MS", 16));
		for (int i =1; i < 22;i++){
			fill(0,0,0);
			text(i-1, w2*i, height -(height/ 100 * 2));



		}
		for (int i =1; i < 22;i++){
			fill(0,0,0);
			translate(w2,h2);
			rotate(HALF_PI);
			text(i, width/100*5, height/100*5);


		}
	}


}
