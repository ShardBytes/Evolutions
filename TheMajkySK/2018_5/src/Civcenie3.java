import java.util.Scanner;

public class Civcenie3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj polomer kruhu (cm) :");
		float r = Float.parseFloat(sc.nextLine());
		float o = 2 * r * 3.1415f;
		float S = 3.1415f * (r * r);
		System.out.println("Obvod je : " + o);
		System.out.println("Obsah je : " + S);
	}
}
