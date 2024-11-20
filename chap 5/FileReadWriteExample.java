// que 130How to Write and Read a file in java with an example

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWriteExample {
    public static void main(String[] args) {
        // Example of FileWriter
        try (FileWriter writer = new FileWriter("example.txt")) {
            String data = "This is an example of FileWriter.";
            writer.write(data);
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing to the file.");
            e.printStackTrace();
        }

        // Example of FileReader
        try (FileReader reader = new FileReader("example.txt")) {
            int content;
            System.out.println("Data read from file:");
            while ((content = reader.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading from the file.");
            e.printStackTrace();
        }
    }
}
