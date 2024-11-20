// que 35: Write a program to explain the basic structure of Java syntax.

public class BasicJavaSyntax {
    // This is the main method. It is the entry point of any Java program.
    public static void main(String[] args) {
        // This is a single-line comment.
        
        /*
         * This is a multi-line comment.
         * Comments are ignored by the compiler and are used to provide information
         * about the code.
         */
        
        // Declaring and initializing variables
        int number = 10;
        String message = "Hello, World!";
        
        // Printing the values of the variables to the console
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
        
        // Calling a method
        printGreeting();
    }
    
    // This is a method. It contains a block of code that performs a specific task.
    public static void printGreeting() {
        System.out.println("Greetings from the printGreeting method!");
    }
}
