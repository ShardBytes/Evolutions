import java.util.Scanner;

public class Kalkulacka {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vitaj v retardovanej kalkulacke!");
		System.out.println("Zadaj mi prvé číslo príkladu");
		float a = Float.parseFloat(sc.nextLine());
		System.out.println("Zadaj mi druhé číslo!");
		float b = Float.parseFloat(sc.nextLine());
		float sucet = a + b;
		float rozdiel = a - b;
		float sucin = a * b;
		float podiel = a / b;
		System.out.println("Súčet :" + sucet);
		System.out.println("Rozdiel :" + rozdiel);
		System.out.println("Súčin :" + sucin);
		System.out.println("Podiel :" + podiel);
		System.out.println("SKAP!");
	}
}
