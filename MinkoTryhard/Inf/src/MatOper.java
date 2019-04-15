import processing.core.PApplet;
import java.util.Random;

public class MatOper extends PApplet{
	
	
	Random random = new Random();
	
	
	public static void main(String[] args) {
		PApplet.main("MatOper");
	}
	
	public void settings() {
		size(320 ,480);
	}
	
	@Override
	public void setup() {
		
		
		int cervena = color(255,0,0);
		int zelena = color(0,255,0);
		int modra = color(0,0,255);
		
		int[] farby = {cervena, zelena, modra};
		
		int randomIndex = random.nextInt(farby.length);
		
		
		fill(farby[randomIndex]);
		rect(100,100,100,100);
		
		
		
		
	}
}