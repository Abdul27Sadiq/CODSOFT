package INTERNSHIP;
import java.util.*;
import java.util.Random;

public class NUMBER_GAME {

	public static void main(String args[]) { 
    		genrateRandom();		// To genrate a random number
	} 
	public static void genrateRandom() {
		Random rand = new Random();
		Scanner scn = new Scanner(System.in);
		int randomNumber = rand.nextInt(100) + 1;
		//System.out.println("Random number is " + randomNumber);
		int count = 0;
		while(randomNumber>0) {
			System.out.println("Guess The Number Between 1 to 100");
			int Guess_no = scn.nextInt();
			count++;
			if (Guess_no == randomNumber ) {
				System.out.println("You Won!");
				System.out.println("You Guess the no in " + count + " tries");
				if(count==1) {
					System.out.println("YOU SCORE: 100/100 Points");
				}
				else if(count==2) {
					System.out.println("YOU SCORE: 90/100 Points");
				}
				else if(count==3) {
					System.out.println("YOU SCORE: 80/100 Points");
				}
				else if(count==4) {
					System.out.println("YOU SCORE: 70/100 Points");
				}
				else if(count==5) {
					System.out.println("YOU SCORE: 60/100 Points");
				}
				else if(count==6) {
					System.out.println("YOU SCORE: 50/100 Points");
				}
				else if(count==7) {
					System.out.println("YOU SCORE: 40/100 Points");
				}
				else if(count==8) {
					System.out.println("YOU SCORE: 30/100 Points");
				}
				else if(count==9) {
					System.out.println("YOU SCORE: 20/100 Points");
				}
				else if(count==10) { 
					System.out.println("YOU SCORE: 10/100 Points");
				}
				break;
			}
			else if(randomNumber > Guess_no) {
				System.out.println("OOPS! Guess no is Smaller than the orignal no, Guess again.");
			}
			else if(randomNumber < Guess_no){
				System.out.println("OOPS! Guess no is higher than the orignal no, Guess again.");
			}
			if(count==10) {
				System.out.println("Better Luck Next Time");
				break;
			}
		}
 //Play again or exit?
    	System.out.println("Press 1 to Play again.");
    	System.out.println("Press 0 to exit.");
    	int choice=scn.nextInt();
    	if(choice==1) {
    		  genrateRandom();
    	}
    	else {
    		return;
    	}
		scn.close();
	}
}
