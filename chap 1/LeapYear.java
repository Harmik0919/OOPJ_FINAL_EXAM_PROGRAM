
// que 8: Any year is entered through the keyboard, write a program to determine whether the year 
// is leap or not.



import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // A year is leap if it's divisible by 4
        // But if it's divisible by 100, it must also be divisible by 400
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        
        scanner.close();
    }
}
