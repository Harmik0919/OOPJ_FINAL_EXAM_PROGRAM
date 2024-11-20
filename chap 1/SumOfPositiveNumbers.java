// 1ue 17 :.WAP to calculate the sum of positive numbers using 
// continue statement

import java.util.Scanner;

public class SumOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter numbers to calculate the sum of positive numbers (enter a negative number to stop):");

        while (true) {
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            if (number == 0) {
                continue;
            }
            sum += number;
        }

        System.out.println("The sum of positive numbers is: " + sum);
        scanner.close();
    }
}
