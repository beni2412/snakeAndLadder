package snakesAndLadder;
import java.util.Random;

public class gameplay {

	public static void main(String[] args) {
		System.out.println("Welcome to the game of Snakes and Ladders");
		int player1 = 1;
		int player2= 2;
		int start = 0;
		int pos1 = start;
		int pos2 = start;
		int count=0;
		Random ran = new Random();
		
		
		
		for(int i=1;;i++) {
			int turn = i%2;
			if (turn==1) {
		int dice = ran.nextInt(6)+1;
				
		int option = ran.nextInt(3)+1;
		switch(option){
			case 1:
				break;
			case 2:
				pos1=pos1-dice;
				if(pos1<0)
					pos1=0;
				break;
			case 3:
				if((pos1+dice)>100)
					break;
				else {
					pos1=pos1+dice;
					i=i-1;
				    break;
				}
		}
		count++;
		System.out.println("player 1 pos: "+pos1);
			if (pos1==100)
				break;
			}
			else {
				int dice = ran.nextInt(6)+1;
				
				int option = ran.nextInt(3)+1;
				switch(option){
					case 1:
						break;
					case 2:
						pos2=pos2-dice;
						if(pos2<0)
							pos2=0;
						break;
					case 3:
						if((pos2+dice)>100)
							break;
						else {
							pos2=pos2+dice;
							i=i-1;
						    break;
						}
				}
				count++;
				System.out.println("player 2 pos: "+pos2);
					if (pos2==100)
						break;
			}
			
		}
		
		System.out.println("Number of times dice was rolled to win the game: "+count);
		if(pos1==100) {
			System.out.println("Player1 won the game");
		}
		else {
			System.out.println("Player2 won the game");
		}
	}
	

}
