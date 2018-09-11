import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import processing.core.PApplet;

import javax.swing.*;

public class Funk extends PApplet {
	public static void main(String[] args) {
		PApplet.main("Funk");
	}
	@Override
	public void setup(){
		clear();
		background(200);
		fill(0, 0, 0);
		strokeWeight(3f);
		stroke(0);
		translate(width / 2, height / 2);

		//čary a čisla(I guess)
		line(0 - (width / 2), 0, width, 0);
		line(0, 0 - (height / 2), 0, height);
		for (int i = -25; i < 25; i++) {
			stroke(52);
			strokeWeight(1);
			line(i*30, 0 - (height / 2), i*30, height);
			line(0 - (width / 2), i*30, width, i*30);
			text(i,(i*30)+2,12);
			text(i == 0 ? "" : String.valueOf(-i),2,i*30-2);
		}

		String funkcia = JOptionPane.showInputDialog(null, "y = ");
		Expression graf = new ExpressionBuilder(funkcia).variable("x").build();

		//Funkcie zborazuje
		for (float x = -25; x < 25; x += 0.001){
			strokeWeight(0.5f);
			stroke(255,0,0);
			graf.setVariable("x",x);
			float y = (float)graf.evaluate();
			ellipse(x*30, -y*30,1 ,1);
		}

	}
	@Override
	public void settings() {
		size(1366,768);
	}

}

