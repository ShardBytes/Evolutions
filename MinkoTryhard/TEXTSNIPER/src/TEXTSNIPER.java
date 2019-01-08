

public class TEXTSNIPER{
	
	
	public static void main(String[] args){
		
		Obet obet = new Obet();
		Sniper sniper = new Sniper();
		
		System.out.println("Tvoja obet sa nachadza na pozicii: " + obet.pozicia +" Vela stastia agente WC 40.");
		
		while (true){
			obet.tick();
			sniper.tick();
			System.out.println("PUUUF");
			if (sniper.shot == obet.pozicia) {
				break;
			}
			
			System.out.println("HAAA VEDLA");
			
			System.out.println("Terč utiekol na poziciu: " + obet.pozicia + ", snazte sa, nesmie utiect.");
			
			
			
			
		}
		
		System.out.println("Uspesna mise Agente WC 40 caka vas kakavko.");
		
		
		
	}
	
}
