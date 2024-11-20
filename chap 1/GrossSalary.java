
// que 10
// In a company an employee is paid as under:
// If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and DA = 90% of 
// basic salary. 
// If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic 
// salary.
// Employee's salary is input through the keyboard, write a program to find his gross salary.

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter basic salary: Rs. ");
        double basicSalary = scanner.nextDouble();
        
        double hra, da;
        
        // Calculate HRA and DA based on basic salary
        if (basicSalary < 1500) {
            hra = 0.10 * basicSalary;  // 10% of basic salary
            da = 0.90 * basicSalary;   // 90% of basic salary
        } else {
            hra = 500;                 // Fixed Rs. 500
            da = 0.98 * basicSalary;   // 98% of basic salary
        }
        
        // Calculate gross salary
        double grossSalary = basicSalary + hra + da;
        
        System.out.println("\nBasic Salary: Rs. " + basicSalary);
        System.out.println("HRA: Rs. " + hra);
        System.out.println("DA: Rs. " + da);
        System.out.println("Gross Salary: Rs. " + grossSalary);
        
        scanner.close();
    }
}
