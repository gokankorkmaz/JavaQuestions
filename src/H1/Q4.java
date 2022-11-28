package H1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int arraySize = scanner.nextInt();

        int[] arr = new int[arraySize];
        Random random = new Random();
        double sum = 0;
        for (int i = 0; i < arraySize; i++) {
            int randomNumber = random.nextInt(1000);
            arr[i] += arr[i] + randomNumber;
            sum = sum + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Average: " + sum / arraySize);

    }


}

/*
Create a 100-element integer array of random numbers.
Print the mean of the numbers in the array.
A randomly generated 100-element number array changes every time the program runs.
 */