

import java.util.Random;
import java.util.Scanner;

public class Podmienky{
	public static void main(String[] args){
		System.out.println("Hello, this is a number guesing game.");
		System.out.println("It is simple just write the number and I will tell u if my number is lower or higher");
		System.out.println("Good luck and Have fun");
		Scanner vstup = new Scanner(System.in);
		
		System.out.println("Set range of numbers in which you want to guess.");
		int prve = vstup.nextInt();
		int druhe = vstup.nextInt();
		
		
		Random ran = new Random();
		
		int x = ran.nextInt(prve + druhe)
		
		System.out.println("Now you can try to guess the number.");
		
		
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
