import java.util.ArrayList;
import java.util.Scanner;

public class TEXTSNIPER{
	
	
	public static void main(String[] args){
		
		ArrayList<Obet> list = new ArrayList<>();
		System.out.println("Vitajte toto je vasa nova cinema v Mozambiku zvolte si pocet obeti. Vela stastia agente WC 40. MUHAHAHAHA ");
		
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
				}
				case 2:{
					System.out.println("Double buble kill");
				}
				case 3:{
					System.out.println("OU BABY ITS TRIPLE");
				}
				case 4:{
					System.out.println("QUADRE MATHRE KILLORE");
				}
				case 5:{
					System.out.println("PENTAAAA PENTAAA O MY GOD ITS PENTAAAAAAAAAA");
				}
				case 0:{
					System.out.println("HAA VEEDLA");
				}
				default:{
					System.out.println("CHEATER");
				}
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
