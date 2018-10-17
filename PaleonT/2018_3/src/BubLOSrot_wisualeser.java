import processing.core.PApplet;
import java.util.Scanner;

public class BubLOSrot_wisualeser extends PApplet {
	Scanner vstup = new Scanner(System.in);

	private int[] Yes = {2, 36, 58, 49, 75, 26, 5, 52, 97, 5, 31, 56, 12, 45, 4, 5, 88, 4, 55, 21, 68};

	public static void main(String[] args) {
		PApplet.main("BubLOSrot_wisualeser");
	}

	@Override
	public void setup() {
		frameRate(60f);
	}

	@Override
	public void settings() {
		size(640, 480);

	}

	@Override
	public void draw() {
		clear();
		background(255, 255, 255);

		textFont(createFont("Times New Roman", 16));
		for (int i = 0; i < Yes.length; i++) {
			int Devat = Yes[i];
			fill(255- Devat, 255/Devat, 255-Devat);
			text(Devat, width / Yes.length * i, 25);
			rect(width / Yes.length * i, height, 25, -(Devat * (height - 45) / getHighest(Yes)));

		}


	}

	@Override
	public void mousePressed() {
		int n = Yes.length;
		int temp = 1;

		for (int j = 1; j < n; j++) {
			if (Yes[j - 1] > Yes[j]) {
				//swap elements
				temp = Yes[j - 1];
				Yes[j - 1] = Yes[j];
				Yes[j] = temp;
			}
		}

	}

	private int getHighest(int[] nums) {
		int ret = 0;
		for (int num : nums) {
			if (num > ret) {
				ret = num;
			}
		}

		return ret;
	}

}
