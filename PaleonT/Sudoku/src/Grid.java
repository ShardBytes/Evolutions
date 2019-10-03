import processing.core.PApplet;

import java.util.Random;

public class Grid extends PApplet {

	Random rand = new Random();

	private int[][] tabulka = new int[10][10];

	public static void main(String[] args) {
		PApplet.main("Grid");
	}

	@Override
	public void setup() {
		frameRate(60f);
		genTbael();
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

	private void tabelRumpelstiltschen() {
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

	private int[][] genTbael() {
		for (int i = 1; i <= 9; i++) {
			for (int g = 1; g <= 9; g++) {
				tabulka[i][g] = rand.nextInt(10);
			}


		}
		return tabulka;
	}


	private void numeros() {
		fill(0);
		textAlign(PApplet.CENTER, PApplet.CENTER);
		for (int i = 1; i <= 9; i++) {
			for (int g = 1; g <= 9; g++) {
				text(tabulka[g][i], i * 71 - 35, g * 71 - 35);


			}
		}
	}


}

