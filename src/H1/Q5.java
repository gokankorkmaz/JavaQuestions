package H1;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int factorial = 1;

        System.out.println("Please enter a number: ");
        int number = scan.nextInt();

        for(int i = 1; i <= number; i++)
        {
            factorial = factorial * i;
        }
        System.out.println(number + "!= " + factorial);
    }
}

/*
Write code that calculates the factorial of a number received from the user */