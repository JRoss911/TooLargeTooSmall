/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Methods: guess, Math.random(tooLargeTooSmall)
        // If guess > Math.random(tooLargeTooSmall) return "Too large";
        //else if userInput() < randomNumber() return "Too small";
        // else return "Correct guess!!";

        //Actually, ended up using do-while loop until guess was the right random number
        {

            int guess = 1;

            double tooLargeTooSmall = 1 + (int) (5  //tooLargeTooSmall is the random generated number
                    * Math.random()); //1 * random number initializes random number

            {

                do {       // Do { "if else" statement until while() requirement is met
                    System.out.print("Enter your guess: "); //Allows user input as "scan"
                    Scanner scan = new Scanner(System.in);


                    guess = scan.nextInt(); //reads user guess through scanner
                    if (guess > tooLargeTooSmall) {
                        System.out.println("Too large"); //Guess higher than Math.random()

                    } else if (guess < tooLargeTooSmall) {
                        System.out.println("Too small"); //Guess lower than Math.random()
                    } else {
                        System.out.println("Correct guess!!"); //Guess equals Math.random()
                    }
                } while (guess != tooLargeTooSmall); //while() guess isn't equal to random number

            }

        }
    }
}




