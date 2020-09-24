package snakesAndLadder;
import java.util.Random;

public class gameplay {

	public static void main(String[] args) {
		System.out.println("Welcome to the game of Snakes and Ladders");
		int player1 = 1;
		int start = 0;
		int pos = start;
		Random ran = new Random();
		int dice = ran.nextInt(6)+1;
				
		int option = ran.nextInt(3)+1;
		switch(option){
			case 1:
				break;
			case 2:
				pos=pos+dice;
				break;
			case 3:
				pos=pos-dice;
				break;
								
		}
		
	}
	

}
