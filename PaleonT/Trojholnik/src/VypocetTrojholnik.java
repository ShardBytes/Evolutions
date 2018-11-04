

import static processing.core.PApplet.*;

public class VypocetTrojholnik {


	public static void main(String[] args) {
		float[] pole = trojehlnik(12, 0, 18, 0, 6, 0);
		vypisPole(pole);


	}

	public static void vypisPole(float[] pole) {
		System.out.print("[");
		for (int i = 0; i < pole.length; i++) {
			System.out.print(pole[i]);
			System.out.print(" ");
		}
		System.out.println("]");
	}

	//a= staraA b= staranB c= stranaC ---> SSS
	public static float[] trojehlnik(float a, float b, float c, float ua, float ub, float uc) {
		float uholAlfa = ua;
		float uholBeta = ub;
		float uholGamma = uc;
		float stranaA = a;
		float stranaB = b;
		float stranaC = c;
		float[] trojuholnik = new float[6];
		if (a != 0 && b != 0 && c != 0 && ua == 0 && ub == 0 && uc == 0) {
			uholAlfa = acos((-sq(a) + sq(b) + sq(c)) / (2 * c * b));
			uholBeta = acos((-sq(b) + sq(a) + sq(c)) / (2 * c * a));
			uholGamma = acos((-sq(c) + sq(a) + sq(b)) / (2 * b * a));

			//SSU
			//a = 0 && a jeden uhol mam
		} else if (a == 0 && b != 0 && c != 0 && ua != 0 && ub == 0 && uc == 0) {
			//treba a && ub a uc
			uholBeta = acos((b*sin(ua))/a);
			uholGamma = 180-(ua+uholBeta);
			stranaA = (sin(uholAlfa)*b)/sin(ub);

		} else if (a == 0 && b != 0 && c != 0 && ua == 0 && ub != 0 && uc == 0) {
			// treba a && ua a uc
			uholGamma = acos((c*sin(ub))/b);
			uholAlfa = 180-(ub+uholGamma);
			stranaA = (sin(uholAlfa)*b)/sin(ub);

		} else if (a == 0 && b != 0 && c != 0 && ua == 0 && ub == 0 && uc != 0) {
			uholAlfa = acos((c*sin(ub))/b);
			uholBeta = 180-(uc+uholAlfa);
			stranaA = (sin(uholAlfa)*b)/sin(ub);
			//b = 0 && jeden uhol mam
		} else if (a != 0 && b == 0 && c != 0 && ua != 0 && ub == 0 && uc == 0) {

		} else if (a != 0 && b == 0 && c != 0 && ua == 0 && ub != 0 && uc == 0) {

		} else if (a != 0 && b == 0 && c != 0 && ua == 0 && ub == 0 && uc != 0) {

		}
		//c = 0 && a jeden uhol mam
		else if (a != 0 && b != 0 && c == 0 && ua != 0 && ub == 0 && uc == 0) {

		} else if (a != 0 && b != 0 && c == 0 && ua == 0 && ub != 0 && uc == 0) {

		} else if (a != 0 && b != 0 && c == 0 && ua == 0 && ub == 0 && uc != 0) {

		}


		return trojuholnik;
	}


}


