import java.util.ArrayList;
import java.util.Scanner;

public class TEXTSNIPER{
	
	
	public static void main(String[] args){
		
		ArrayList<Obet> list = new ArrayList<>();
		System.out.println("Vitajte toto je vasa nova cinema v Mozambiku. MUHAHAHAHA ");
		System.out.println("Vasa ulohou predvidat kde sa bude obet nachadzat. Vystrelite na poziciu ktorej suradnicu zadate.");
		System.out.println("Zvolte si pocet obeti. Muhahahah.");
		System.out.println("Vela stastia Agente WC-40");
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		int pocetfukinobetiktorechcemzabitvtomtokolezamenejnezhodinumojhodrahocennehocasunatejtokrasnejplanenazvanejzem = scanner.nextInt();
		
		for(int p=0; p < pocetfukinobetiktorechcemzabitvtomtokolezamenejnezhodinumojhodrahocennehocasunatejtokrasnejplanenazvanejzem; p++ ){
			list.add(new Obet());
		}
		
		Sniper sniper = new Sniper();
		
		for(Obet obet : list){
			System.out.println("Tvoja obet sa nachadza na pozicii: " + obet.pozicia +" Vela stastia agente WC 40.");
		
		
		}
		
		while (true){
			for(Obet obet : list){
				obet.tick();
			}
			sniper.tick();
			System.out.println("PUUUF");
			
			int kill = 0;
			
			for(int i = 0; i < list.size(); i++){
				Obet obet = list.get(i);
				if(sniper.shot == obet.pozicia){
					list.remove(obet);
					kill++;
				}
				
			}
			
			switch(kill){
				case 1:{
					System.out.println("Priamo do neg... ehmmm cierneho :!)");
					break;
				}
				case 2:{
					System.out.println("Double buble kill");
				}
					break;
				case 3:{
					System.out.println("OU BABY ITS TRIPLE");
				}
					break;
				case 4:{
					System.out.println("QUADRE MATHRE KILLORE");
				}
					break;
				case 5:{
					System.out.println("PENTAAAA PENTAAA O MY GOD ITS PENTAAAAAAAAAA");
				}
					break;
				case 0:{
					System.out.println("HAA VEEDLA");
				}
					break;
				default:{
					System.out.println("CHEATER");
				}
					break;
				
			}
			
			
			if(list.isEmpty()){
				break;
			}
			
			
			for(Obet obet : list){
				System.out.println("Terč utiekol na poziciu: " + obet.pozicia + ", snazte sa, nesmie utiect.");
				
			}
			
			
			
			
		}
		
		System.out.println("Uspesna mise Agente WC 40 caka vas kakavko.");
		
		
		
	}
	
}
