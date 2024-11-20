//que: 24 Write a function to search a given number from an array.

import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number to search: ");
        int numberToSearch = scanner.nextInt();
        
        if (searchNumber(array, numberToSearch)) {
            System.out.println(numberToSearch + " is present in the array.");
        } else {
            System.out.println(numberToSearch + " is not present in the array.");
        }
        
        scanner.close();
    }

    public static boolean searchNumber(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
