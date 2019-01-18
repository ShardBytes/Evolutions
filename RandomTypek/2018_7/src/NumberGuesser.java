import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
	
	private static Random generator = new Random();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int cislo = generator.nextInt(101);
		
		for(int a = 0; a < 10; a++){
			System.out.println("Zadajte číslo:");
			int input = scanner.nextInt();
			if(input == cislo){
				System.out.println("Uhádli ste!");
				System.exit(0);
			}else if(input < cislo){
				System.out.println("Viac\n");
			}else if(input > cislo){
				System.out.println("Menej\n");
			}
		}
		
		System.out.println("Došli vám pokusy, číslo bolo " + cislo);
		
	}
}
