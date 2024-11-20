// que 41 :Java Array Program to Copy All the Elements of One Array to Another Array 

import java.util.Scanner;

public class CopyArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] originalArray = new int[size];
        int[] copiedArray = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }
        
        // Copying elements from originalArray to copiedArray
        for (int i = 0; i < size; i++) {
            copiedArray[i] = originalArray[i];
        }
        
        System.out.println("Elements of the copied array:");
        for (int i = 0; i < size; i++) {
            System.out.print(copiedArray[i] + " ");
        }
        
        scanner.close();
    }
}
