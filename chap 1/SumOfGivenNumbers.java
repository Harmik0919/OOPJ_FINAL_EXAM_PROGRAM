// que 19: WAP to calculate the sum of given numbers, enter -1 to terminate. 4

import java.util.Scanner;

public class SumOfGivenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter numbers to calculate the sum (enter -1 to stop):");

        while (true) {
            number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            sum += number;
        }

        System.out.println("The sum of the given numbers is: " + sum);
        scanner.close();
    }
}
