// que 47 WAP to find equality of two strings. If both the string are equal then print its length else 
// concat both the strings.

import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("The strings are equal. Length: " + str1.length());
        } else {
            String concatenatedString = str1 + str2;
            System.out.println("The strings are not equal. Concatenated string: " + concatenatedString);
        }

        scanner.close();
    }
}

