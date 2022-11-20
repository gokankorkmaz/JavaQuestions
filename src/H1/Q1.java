package H1;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {


        int counter = 0;

        Random random = new Random();
        int randomNumber = random.nextInt(20);
        randomNumber = randomNumber + 1; // If 0, we have increased it by adding 1
        System.out.println("Number: " + randomNumber);

        System.out.println("Please guess a number from 1-20");
        Scanner scanner = new Scanner(System.in);
        int number = 0;


        do {
            number = scanner.nextInt();
            if (number > randomNumber) {
                System.out.println("Your guess should be a smaller number, try again");
                counter += 1;
            } else if (number < randomNumber) {
                System.out.println("Your guess should be a larger number, try again");
                counter += 1;
            } else if (number == randomNumber) {
                counter += 1;
                break;
            }

        } while (number != randomNumber);


        System.out.println("Congratulations, you found the number on the " + counter + " try");

    }

    //TODO1: use method


}
