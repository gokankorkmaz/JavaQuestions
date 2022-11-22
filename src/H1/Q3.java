package H1;

public class Q3 {

    public static void main(String[] args) {
        numberDivisibleBy13();
    }


    public static void numberDivisibleBy13(){
        for (int i = 100; i > 0; i--) {
            if (i % 13 == 0) {
                System.out.println(i);
            }
        }
    }

}
/*
Print the numbers from 100 to 0 which are divisible by 13 (from largest to smallest).
 */