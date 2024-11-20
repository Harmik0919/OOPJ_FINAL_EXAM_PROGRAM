// que 31: WAP to calculate sum of odd and even elements of an array.

import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int sumOdd = 0;
        int sumEven = 0;
        
        for (int num : array) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        
        System.out.println("Sum of odd elements: " + sumOdd);
        System.out.println("Sum of even elements: " + sumEven);
        
        scanner.close();
    }
}
