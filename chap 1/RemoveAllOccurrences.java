// que 44: Java Array Program to Remove All Occurrences of an Element in an Array

import java.util.Scanner;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to be removed: ");
        int elementToRemove = scanner.nextInt();
        
        int[] tempArray = new int[size];
        int j = 0;
        
        for (int i = 0; i < size; i++) {
            if (array[i] != elementToRemove) {
                tempArray[j++] = array[i];
            }
        }
        
        int[] newArray = new int[j];
        for (int i = 0; i < j; i++) {
            newArray[i] = tempArray[i];
        }
        
        System.out.println("Array after removing all occurrences of " + elementToRemove + ":");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        
        scanner.close();
    }
}
