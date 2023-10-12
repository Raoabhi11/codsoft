import java.util.*;

public class numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int low = 1; 
        int up = 100;
        int numberToGuess = random.nextInt(up - low + 1) + low;
        
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME!");
        System.out.println("NUMBER SELECTED BETWEEN " + low + " AND " + up + ". TRY TO GUESS IT.");

        while (!hasGuessedCorrectly) {
            System.out.print("ENTER YOUR GUESS: ");
            int userGuess = sc.nextInt();
            numberOfAttempts++;
            
            if (userGuess<low||userGuess>up) {
                System.out.println("PLEASE GUESS A NUMBER WITHIN VALID RANGE.");
            } else if (userGuess<numberToGuess) {
                System.out.println("TOO LOW!...TRY AGAIN.");
            } else if (userGuess>numberToGuess) {
                System.out.println("TOO HIGH!...TRY AGAIN.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("CONGRATULATIONS!...YOU HAVE GUESSED THE RIGHT NUMBER " + numberToGuess + " in " + numberOfAttempts + " attempts.");
            }
        }
    }
}
