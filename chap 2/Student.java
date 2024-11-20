// que 72
// Write a program to display Student’s Enrollment number and Division using methods of 
// Student Class.

class Student {
    private String enrollmentNumber;
    private String division;

    public Student(String enrollmentNumber, String division) {
        this.enrollmentNumber = enrollmentNumber;
        this.division = division;
    }

    public String getEnrollmentNumber() {
        return enrollmentNumber;
    }

    public String getDivision() {
        return division;
    }

    public void displayStudentDetails() {
        System.out.println("Enrollment Number: " + enrollmentNumber);
        System.out.println("Division: " + division);
    }

    public static void main(String[] args) {
        Student student = new Student("EN123456", "A");
        student.displayStudentDetails();
    }
}
