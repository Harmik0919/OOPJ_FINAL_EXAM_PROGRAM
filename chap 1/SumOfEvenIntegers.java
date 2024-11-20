// que 16 :  Write a program that calculates and prints the sum of the even integers from 1 to 100

public class SumOfEvenIntegers {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        
        System.out.println("The sum of the even integers from 1 to 100 is: " + sum);
    }
}
