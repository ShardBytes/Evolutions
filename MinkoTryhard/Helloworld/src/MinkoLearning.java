import java.util.Scanner;

public class MinkoLearning {
	public static void main(String[] args) {
		Scanner vstupč = new Scanner(System.in);
		
		System.out.println("Zadaj 3 - 1 čísla XD");
		
		
		int x = vstupč.nextInt();
		int y = vstupč.nextInt();
		
		
		Scanner vstupm = new Scanner(System.in);
		System.out.println("Zadaj meno a priezvisko");
		String meno = vstupm.nextLine();
		
		
		System.out.println(meno+" "+"tvoje IQ je: "+ (x/y));
		if(x/y > 150) {
			System.out.println("Congratulation u r genius.");
		}else if(x/y > 100){
			System.out.println("Congrat u are not stupid.");
		}else{
			System.out.println(meno+" go for Slovak rap.");
		}
	}
	
}
