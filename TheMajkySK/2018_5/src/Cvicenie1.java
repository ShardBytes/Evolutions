import java.util.Scanner;

public class Cvicenie1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ahoj ako sa voláš ?");
		String meno = sc.nextLine();
		System.out.println("Povedz mi nejakú tvoju vlastnosť.");
		String vl = sc.nextLine();
		String výstup = meno + " je " + vl ;
		System.out.println(výstup);
	}
}
