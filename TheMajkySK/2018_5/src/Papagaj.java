import java.util.Scanner;

public class Papagaj {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in, "Windows-1250");
		System.out.println("Ahoj ako sa máš rád opakujem hocičo čo povieš");
		System.out.println("Napíš mi niečo:");
		String vstup;
		vstup = a.nextLine();
		String vystup;
		vystup = vstup + ", " + vstup + ", " + vstup + "!";
		System.out.println(vystup);

	}
}
