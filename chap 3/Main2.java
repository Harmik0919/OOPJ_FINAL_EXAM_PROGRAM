
// que 84:Write a program to call memmbers of parent class using superkeyword.

class ParentClass {
    int num = 100;

    public void display() {
        System.out.println("This is the display method of ParentClass");
    }
}

class ChildClass extends ParentClass {
    int num = 200;

    public void display() {
        System.out.println("This is the display method of ChildClass");
    }

    public void myMethod() {
        ChildClass child = new ChildClass();

        // Calling the display() method of ChildClass
        child.display();

        // Calling the display() method of ParentClass
        super.display();

        // Printing the value of num of ChildClass
        System.out.println("Value of num in ChildClass: " + child.num);

        // Printing the value of num of ParentClass
        System.out.println("Value of num in ParentClass: " + super.num);
    }
}

public class Main2 {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.myMethod();
    }
}
