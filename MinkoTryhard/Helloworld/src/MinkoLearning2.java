
import java.util.Scanner;

public class MinkoLearning2{
	public static void main(String[] args){
		Scanner vstup = new Scanner(System.in);
		
		System.out.println("Zdravím, napíšte svoj vek");
		int vek = vstup.nextInt();
		System.out.println("Do akej hodnoty vám môžem zháňať tovar?");
		int money = vstup.nextInt();
		
		if(vek >= 18 || money >= 500){
			
			
			if(!(vek < 18) && money >= 1000){
				System.out.println("Možete si vybrať všetko. Ako napríklad: AK-47, MP5, Glock, Eagle");
			}else if(vek < 18){
				System.out.println("Sorry krpec ale odpáľ.");
			}else if(!(money < 500)){
				System.out.println("Odporúčam niečo menšie ako napríklad: Glock, Eagle. ");
			}else{
				System.out.println("Prepačte, obávam sa, že pre vas tu nič nie je.");
			}
		}else{
			System.out.println("Odpaľ krpec.");
		}
		
		if(vek >= 18 && money >= 500){
			
			
			System.out.println("Aký tovar si prajete?");
			
			Scanner VSTUP = new Scanner(System.in);
			String tovar = VSTUP.nextLine();
			
			int glock = 320;
			int eagle = 450;
			int ak = 950;
			int mp = 750;
			int zostatok;
			switch(tovar){
				case "AK-47":{
					System.out.println("Zaplať " + ak + " €");
					zostatok = money - ak;
					break;
				}
				case "MP5":{
					System.out.println("Zaplať " + mp + " €");
					zostatok = money - mp;
					break;
				}
				case "Glock":{
					System.out.println("Zaplať " + glock + " €");
					zostatok = money - glock;
					break;
				}
				case "Eagle":{
					System.out.println("Zaplať " + eagle + " €");
					zostatok = money - eagle;
					break;
				}
				default:{
					System.out.println("NOPE, taky tu nit.");
				}
			}
			
			int maggl = 3;
			int mageg = 8;
			int magmp = 25;
			int magak = 30;
			
			System.out.println("Môžeš si k tomu kúpiť aj ");
			for(;;);
			
		}
		
		
		
	}
}
