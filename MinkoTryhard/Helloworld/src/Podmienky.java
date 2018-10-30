

import java.util.Random;
import java.util.Scanner;

public class Podmienky{
	public static void main(String[] args){
		System.out.println("Hello, this is a number guesing game.");
		System.out.println("It is simple just write the number and I will tell u if my number is lower or higher");
		System.out.println("Good luck and Have fun");
		
		int x =new Random().nextInt(101);
		
		Scanner vstup = new Scanner(System.in);
		
		
		int cislo = vstup.nextInt();
		int pocet = 0;
		while(cislo != x){
			if (cislo > x){
				System.out.println("Go lower");
			}
		
			else{
				System.out.println("Go higher");
			}
			
			cislo = vstup.nextInt();
			pocet++;
			
		}
		
		System.out.println("CONGRATULATION YOU GUESTED RIGHT IN " + pocet + " GUESSES ");
		
		
	}
	
	
}
