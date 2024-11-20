
//que 128 Discuss about the File Input Stream and File Output Stream in java with examples

// FileInputStream and FileOutputStream in Java are used for reading and writing data to files respectively.
// These classes are part of the java.io package and are used for handling binary data.

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {
        // Example of FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("example.txt")) {
            String data = "This is an example of FileOutputStream.";
            fos.write(data.getBytes());
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing to the file.");
            e.printStackTrace();
        }

        // Example of FileInputStream
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int content;
            System.out.println("Data read from file:");
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading from the file.");
            e.printStackTrace();
        }
    }
}
