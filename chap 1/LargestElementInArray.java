
// que: 39 Java Array Program to Find the Largest Element in an Array

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int largest = array[0];
        
        for (int num : array) {
            if (num > largest) {
                largest = num;
            }
        }
        
        System.out.println("Largest element in the array: " + largest);
        
        scanner.close();
    }
}
