//que 132
//  Write a program to replace all “word1” by “word2” from a file1, and output is written to 
// file2 file and display the no. of replacement.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWords {
    public static void main(String[] args) {
        String file1 = "file1.txt";
        String file2 = "file2.txt";
        String word1 = "word1";
        String word2 = "word2";
        int replacementCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file1));
             BufferedWriter writer = new BufferedWriter(new FileWriter(file2))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String replacedLine = line.replace(word1, word2);
                replacementCount += (line.length() - replacedLine.length()) / word1.length();
                writer.write(replacedLine);
                writer.newLine();
            }
            System.out.println("Number of replacements: " + replacementCount);
        } catch (IOException e) {
            System.out.println("An error occurred while processing the files.");
            e.printStackTrace();
        }
    }
}
