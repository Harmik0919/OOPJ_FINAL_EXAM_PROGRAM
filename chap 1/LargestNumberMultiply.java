// que 7 : Write a program to multiply largest number (among two) with ‘50’ using conditional 
// operator.


public class LargestNumberMultiply {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        // Using conditional operator to find larger number and multiply by 50
        int result = (num1 > num2) ? num1 * 50 : num2 * 50;
        
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Result (Larger number * 50): " + result);
    }
}
