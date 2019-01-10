import java.util.ArrayList;

public class TEXTSNIPER{
	
	
	public static void main(String[] args){
		
		ArrayList<Obet> list = new ArrayList<>();
		Obet fero = new Obet();
		Obet palko = new Obet();
		Obet jaro = new Obet();
		
		list.add(fero);
		list.add(palko);
		list.add(jaro);
		
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
			
			for(Obet obet : list){
				if (sniper.shot == obet.pozicia) {
					list.remove(obet);
				}
			}
			if(list.isEmpty()){
				break;
			}
			
			System.out.println("HAAA VEDLA");
			for(Obet obet : list){
				System.out.println("Terč utiekol na poziciu: " + obet.pozicia + ", snazte sa, nesmie utiect.");
				
			}
			
			
			
			
		}
		
		System.out.println("Uspesna mise Agente WC 40 caka vas kakavko.");
		
		
		
	}
	
}
