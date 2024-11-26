package Loop;

/*  6. loop-Write a program for a matchstick game being played between the computer and a user. Your program should ensure that the computer always wins. 
 *	Rules for the game are as follows: 
		− There are 21 matchsticks. 
		− The computer asks the player to pick 1, 2, 3, or 4 matchsticks. 
		− After the person picks, the computer does its picking. 
		− Whoever is forced to pick up the last matchstick loses the game.
		
*/

public class Matchstick {
	public static void main(String[] args) {
		
		final int INITIAL_MATCHSTICKS = 21;
        int matchsticks = INITIAL_MATCHSTICKS;

       
        int[] userMoves = {3, 4, 1, 2}; 
        int[] computerMoves = {2, 3, 4, 1}; 
        
        int userMoveIndex = 0;
        int computerMoveIndex = 0;

        System.out.println("Welcome to the Matchstick Game!");
        System.out.println("There are " + matchsticks + " matchsticks.");
        System.out.println("You and the computer will take turns picking 1, 2, 3, or 4 matchsticks.");
        System.out.println("Whoever is forced to pick the last matchstick loses the game.");

 
        while (matchsticks > 0) {
           
            if (userMoveIndex < userMoves.length) {
                int userPick = userMoves[userMoveIndex++];
                matchsticks -= userPick;
                System.out.println("You picked " + userPick + " matchsticks. " + matchsticks + " matchsticks remaining.");
                
                
                if (matchsticks <= 0) {
                    System.out.println("You picked the last matchstick. You lose!");
                    break;
                }
            }

            
            if (computerMoveIndex < computerMoves.length) {
                int computerPick = computerMoves[computerMoveIndex++];
                matchsticks -= computerPick;
                System.out.println("Computer picked " + computerPick + " matchsticks. " + matchsticks + " matchsticks remaining.");
                
               
                if (matchsticks <= 0) {
                    System.out.println("Computer picked the last matchstick. Computer loses!");
                    break;
                }
            }
        }
		
	}

}
