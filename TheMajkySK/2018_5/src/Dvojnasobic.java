import java.util.Scanner;


public class Dvojnasobic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in, "Windows-1250");
		System.out.println("Aké čislo chceš zdvojnásobiť");
		String s = sc.nextLine();
		int a = Integer.parseInt(s);
		a = a * 2;
		System.out.println(a);


	}


}
