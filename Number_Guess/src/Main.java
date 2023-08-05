import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        while (true) {
            int randomnum = rand.nextInt(100) + 1;

            int i = 0;

            while (i <= 5) {

                System.out.println();

                System.out.println("Enter your Guess(1-100):");

                Scanner sc = new Scanner(System.in);

                int playerguess = sc.nextInt();

                if (playerguess == randomnum) {
                    System.out.println(("Correct you win"));
                    break;
                } else if (randomnum > playerguess) {
                    System.out.println(" NOPE! The number is higher.Guess again. ");

                } else if (randomnum < playerguess) {
                    System.out.println(" NOPE! The number is lower.Guess again. ");

                }
                i++;
            }
            System.out.println("You ran out of guesses");

        }
    }
}