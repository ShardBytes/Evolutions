import processing.core.PApplet;
import java.util.Random;
public class MojeRandom extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main("MojeRandom");
	}
	
	public void settings() {
		size(320, 240);
	}
	
	Random random = new Random();
	int x = random.nextInt(10);
	@Override
	public void setup() {
		textSize(20);
		fill(0);
		x = random.nextInt(10);
		text(x,50,100);
		x = random.nextInt(10);
		text(x,70,100);
		x = random.nextInt(10);
		text(x,90,100);
		x = random.nextInt(10);
		text(x,110,100);
	}
}