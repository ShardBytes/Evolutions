import java.util.Scanner;

public class Overenie_scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        System.out.println(a.startsWith("keket"));
        System.out.println(a.contains("kar"));
        System.out.println(a.endsWith("petko"));
        if (a.startsWith("keket") == true){
            a = a.replace("keket", "*****" );
            System.out.println(a);
        }
    }
}
