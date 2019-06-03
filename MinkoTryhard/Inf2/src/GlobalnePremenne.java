import processing.core.PApplet;
import java.util.Random;

public class GlobalnePremenne extends PApplet {
	
	
	Random random = new Random();
	
	public static void main(String[] args) {
		PApplet.main("GlobalnePremenne");
	}
	
	public void settings() {
		size(320 ,240);
		
	}
	int jablka = 0;
	int hrusky = 0;
	
	@Override
	public void setup(){
		nastavSklad();
		vypisSklad();
	}
	
	public void nastavSklad(){
		int jablka = 10;
		int hrusky = 8;
		
	}
	
	public void vypisSklad(){
		System.out.println(jablka);
		System.out.println(hrusky);
		
	}
	
	
}