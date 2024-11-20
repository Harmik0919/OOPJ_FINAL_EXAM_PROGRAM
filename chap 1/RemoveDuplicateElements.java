// que:43 Java Array Program to Remove Duplicate Elements From an Array

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Sorting the array
        Arrays.sort(array);
        
        // Removing duplicates
        int[] tempArray = new int[size];
        int j = 0;
        for (int i = 0; i < size - 1; i++) {
            if (array[i] != array[i + 1]) {
                tempArray[j++] = array[i];
            }
        }
        tempArray[j++] = array[size - 1];
        
        // Copying the unique elements back to the original array
        int[] uniqueArray = Arrays.copyOf(tempArray, j);
        
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
        
        scanner.close();
    }
}
