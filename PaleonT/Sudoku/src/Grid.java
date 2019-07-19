import processing.core.PApplet;

public class Grid extends PApplet {

	private int[][] tabulka = genTbael();

	public static void main(String[] args) {
		PApplet.main("Grid");
	}

	@Override
	public void setup() {
		frameRate(30f);
	}

	@Override
	public void settings() {
		size(800, 800);

	}

	@Override
	public void draw() {
		clear();
		background(255, 255, 255);
		translate(100, 100);
		textFont(createFont("Comic Sans MS", 16));
		tabelRumpelstiltschen();

		numeros();



	}
	private void tabelRumpelstiltschen(){
		noFill();
		stroke(0);
		strokeWeight(3f);
		rect(0, 0, 639, 639);


		strokeWeight(1f);
		for (int i = 0; i < 9; i++) {
			for (int k = 0; k < 9; k++) {
				rect(k * 71, i * 71, 71, 71);

			}

		}
		strokeWeight(2f);
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 3; k++) {
				rect(k * 213, i * 213, 213, 213);

			}

		}
	}
	private int[][] genTbael(){
		for (int i = 1; i<=9;i++){
			for (int g = 1; g<=9;g++){

			}

	}
	}


	private void numeros(){
		fill(0);
		textAlign(PApplet.CENTER,PApplet.CENTER);
		for (int i = 1; i<=9;i++){
			for (int g = 1; g<=9;g++){
				text(tabulka[g][i], i*71-35, g*71-35);



			}
		}
	}


}

