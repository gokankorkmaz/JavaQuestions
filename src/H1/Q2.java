package H1;

import java.sql.Array;

public class Q2 {


    public static void main(String[] args) {

        int[] array = {1900, 80, 8};
        int result = sumArrayElements(array);
        System.out.println("Sum of elements of array: "+result);

    }


    public static int sumArrayElements(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}


/*
Given an array of ints length 3, return the sum of all the element

        sum3([1, 2, 3]) → 6
        sum3([5, 11, 2]) → 18
        sum3([7, 0, 0]) → 7
 */