<<<<<<< HEAD
public class MinkoTest {
    
    
    public static void main(String[] args) {
        System.out.println("Ahoj ako sa mas ?");
        System.out.println("Mam sa celkom fajn XD ");
        
        String minko = "sestnast";
        int minkoVekVCislach = 16;
        double minkoVyska = 180.11;
        char krvnaSkupina= 'A';
        boolean zivy = true;
        
        System.out.println(minko + " " + minkoVekVCislach + " " + minkoVyska + " " + krvnaSkupina + " " +zivy);
        /*
        THAT
        IS
        GREAT
         */
        
        int x = 5;
        int y = 14;
        int z = 25;
        
        int sum1 = x + z;
	    System.out.println(sum1);
        int sum2 = x - y + z * x / y + x + sum1 ;
	    System.out.println(sum2);
     
	    int sum3 = z / y;
	    System.out.println(sum3);
	    int sum4 = z / x ;
	    System.out.println(sum4);
	    
	    double sum5 = z / y;
	    System.out.println(sum5);
	
	    double sum6 = z % y; //zvysok
	    System.out.println(sum6);
	
	    
	    
	    System.out.println(z);
	    z++;
	    System.out.println(z);
	    z--;
	    System.out.println(z);
	
	
	    System.out.println(z);
	    ++z;
	    System.out.println(z);
	    --z;
	    System.out.println(z);
	    // 35. strana
	    
	    
=======
import java.util.Scanner;

public class MinkoTest {
    
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
>>>>>>> e2dfff9ada3fd7dc684edd79894946c71b719fa2
    }
// LOVE U

}