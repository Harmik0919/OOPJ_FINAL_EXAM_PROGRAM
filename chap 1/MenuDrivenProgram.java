
//que 11
// Write a menu driven program that allows user to enters five numbers and then choose 
// between finding the smallest, largest, sum or average. Use switch case to determine what 
// action to take. Provide error message if an invalid choice is entered

import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("Choose an option:");
        System.out.println("1. Find the smallest number");
        System.out.println("2. Find the largest number");
        System.out.println("3. Find the sum of the numbers");
        System.out.println("4. Find the average of the numbers");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                int smallest = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] < smallest) {
                        smallest = numbers[i];
                    }
                }
                System.out.println("The smallest number is: " + smallest);
                break;
            case 2:
                int largest = numbers[0];
                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > largest) {
                        largest = numbers[i];
                    }
                }
                System.out.println("The largest number is: " + largest);
                break;
            case 3:
                int sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                System.out.println("The sum of the numbers is: " + sum);
                break;
            case 4:
                int total = 0;
                for (int number : numbers) {
                    total += number;
                }
                double average = total / 5.0;
                System.out.println("The average of the numbers is: " + average);
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
                break;
        }
        
        scanner.close();
    }
}