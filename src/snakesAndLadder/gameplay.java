package snakesAndLadder;
import java.util.Random;

public class gameplay {

	public static void main(String[] args) {
		System.out.println("Welcome to the game of Snakes and Ladders");
		int player1 = 1;
		int start = 0;
		int pos = start;
		int count=0;
		Random ran = new Random();
		
		for(int i=1;;) {
		int dice = ran.nextInt(6)+1;
				
		int option = ran.nextInt(3)+1;
		switch(option){
			case 1:
				break;
			case 2:
				pos=pos-dice;
				if(pos<0)
					pos=0;
				break;
			case 3:
				if((pos+dice)>100)
					break;
				else {
					pos=pos+dice;
				    break;
				}
		}
		count++;
		System.out.println(pos);
			if (pos==100)
				break;
		
		
								
		}
		System.out.println("Number of times dice was rolled to win the game: "+count);
		
	}
	

}
