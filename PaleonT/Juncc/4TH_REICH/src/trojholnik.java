import processing.core.PApplet;


public class trojholnik extends PApplet {

	public static void main(String[] args) {
		PApplet.main("trojholnik");
	}

	@Override
	public void setup() {
		translate(width / 2, height / 2);
		clear();
		background(200);
		fill(0, 0, 0);
		strokeWeight(3f);
		stroke(0);


		for (int i = -25; i < 25; i++) {
			stroke(52);
			strokeWeight(1);
			line(i * 30, 0 - (height / 2), i * 30, height);
			line(0 - (width / 2), i * 30, width, i * 30);
		}

	}

	@Override
	public void settings() {
		size(1366, 768);
	}


	@Override
	public void draw() {
		translate(width / 2 - 600, height / 2 + 300);
		strokeWeight(2f);
		stroke(255, 0, 0);
		line(0, 0, stranaA * 30, 0);
		pushMatrix();
		translate(stranaA * 30, 0);
		rotate(radians(uholBeta));
		line(0, 0, -stranaB * 30, 0);
		popMatrix();
		translate(-stranaB * 30, 0);
		pushMatrix();
		translate(stranaB * 30, 0);
		rotate(radians(-uholGamma));
		line(0, 0, stranaC * 30, 0);
		popMatrix();
		translate(width / 2 - 600, height / 2 + 300);
	}

	public void trojhelnikSSS(int a ,int b, int c) {
		if (stranaA != 0)
			if (stranaB != 0)
				if (stranaC != 0){
					uholAlfa = acos((sq(a) - sq(b) - sq(c)) / (2 * c * b));
					uholBeta = acos((sq(b) - sq(a) - sq(c)) / (2 * c * a));
					uholBeta = acos((sq(c) - sq(a) - sq(b)) / (2 * b * a));
				}

	}



	float stranaA = 8;
	float stranaB = 9;
	float stranaC = 10;


	float uholAlfa = 0;
	float uholBeta = 0;
	float uholGamma = 0;

	//SSS - obvod obsah výška goneometricke funkcie vypisac

}


