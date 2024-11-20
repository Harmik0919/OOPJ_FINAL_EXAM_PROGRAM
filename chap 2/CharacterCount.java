// que 69 : Write a program to count number of occurrences of a character in a given string.

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        System.out.println("Enter the character to count:");
        char characterToCount = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == characterToCount) {
                count++;
            }
        }

        System.out.println("The character '" + characterToCount + "' appears " + count + " times in the string.");

        scanner.close();
    }
}
