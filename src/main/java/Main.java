/**
 * Created by iyasuwatts on 10/17/17.
 */
import

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Methods: userInput() , randomNumber();
        // If userInput() > randomNumber() return "Too large";
        //else if userInput() < randomNumber() return "Too small";
        // else return "Correct guess!!";
userInput();
randomNumber();
        random number = 10
    }

    public static String userInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your guess. ");

        int userInput = scan.nextInt(); //reads user input represented by n

        if (userInput > randomNumber) {
            System.out.println("Too large");

        } else if (userInput < randomNumber) {
            System.out.println("Too small");
        } else {
            System.out.println("Correct guess!!");

        }
        return String.valueOf(userInput);


    } return userInput;
}
        public static int randomNumber(){ //








    }
}

