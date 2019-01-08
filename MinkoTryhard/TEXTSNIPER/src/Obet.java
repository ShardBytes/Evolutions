import java.util.Random;

public class Obet{
	
	Random random = new Random();
	
	int pozicia = 0 ;
	int move = 1;
	
	Obet (){
		pozicia = random.nextInt(101);
	}
	
	
	void tick (){
		move = random.nextInt(4);
		if(random.nextBoolean() ) {
			pozicia = pozicia + move;
		}else {
			pozicia = pozicia - move;
		}
		
		if(pozicia > 100){
			pozicia = 100;
		}
		
		if(pozicia < 0 ){
			pozicia = 0;
		}
		
		
	
	}
	
	
	
	
	
	
}
