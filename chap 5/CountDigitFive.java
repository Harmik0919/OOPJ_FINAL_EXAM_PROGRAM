
// que 133
//  Write an application that reads a file and counts the number of occurrences of digit 5. 
// Supply the file name as a command-line argument

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountDigitFive {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java CountDigitFive <file_name>");
            return;
        }

        String fileName = args[0];
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (ch == '5') {
                    count++;
                }
            }
            System.out.println("Number of occurrences of digit 5: " + count);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
