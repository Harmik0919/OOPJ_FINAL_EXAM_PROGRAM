//  que :26 Write a program to print user defined array elements in reverse order.


import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Array elements in reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        
        scanner.close();
    }
}
