import processing.core.PApplet;

public class Hodina1 extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main("Hodina1");
	}
	
	public void settings() {
		size(320, 240);
	}
	
	public void setup(){
		strokeWeight(8);
		stroke(255,125,0);
		line(50,20,50,220);
		line(50,20,150, 110 );
		line(50,220,150,110);
		stroke(0,255,255);
		line(200,20,200,220);
		line(200,20,300, 110 );
		line(200,220,300,110);
	}
	

}
