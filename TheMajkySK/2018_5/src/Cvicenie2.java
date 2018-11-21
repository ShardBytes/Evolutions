import java.util.Scanner;

public class Cvicenie2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Zadaj celé číslo ktore chces umocnit :");
		int a = Integer.parseInt(sc.nextLine());
		int vs = a * a;
		System.out.println("Výsledok je : "+ vs);


	}
}
