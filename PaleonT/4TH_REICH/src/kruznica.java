import processing.core.PApplet;

public class kruznica extends PApplet {
	public static void main(String[] args) {
		PApplet.main("kruznica");
	}
	@Override
	public void setup() {
		clear();
		background(200);
		fill(200);
		strokeWeight(3f);
		stroke(0);
		translate(width / 2, height / 2);
		ellipse(0,0,height/2,height/2);
		strokeWeight(1f);
		line(0 - (width / 2), 0, width, 0);
		line(0, 0 - (height / 2), 0, height);
		pushMatrix();
		rotate(radians(-135));
		line(0,0,0,height/4);





	}
	@Override
	public void settings() {
		size(1366,768);
	}
}
