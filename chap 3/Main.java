// que 83: Write a program to call superclass constructor

class SuperClass {
    public SuperClass() {
        System.out.println("SuperClass constructor called");
    }
}

class SubClass extends SuperClass {
    public SubClass() {
        super();
        System.out.println("SubClass constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        SubClass subClassInstance = new SubClass();
    }
}
