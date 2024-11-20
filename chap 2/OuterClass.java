// que 76
// Write a program to demonstrate the concept of inner class and anonymous inner class in Java.

class OuterClass {
    private String outerField = "Outer field";

    // Inner class
    class InnerClass {
        public void display() {
            System.out.println("Accessing from Inner Class: " + outerField);
        }
    }

    public void createInnerClassInstance() {
        InnerClass inner = new InnerClass();
        inner.display();
    }

    public void createAnonymousInnerClassInstance() {
        // Anonymous inner class
        InnerClass anonymousInner = new InnerClass() {
            @Override
            public void display() {
                System.out.println("Accessing from Anonymous Inner Class: " + outerField);
            }
        };
        anonymousInner.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerClassInstance();
        outer.createAnonymousInnerClassInstance();
    }
}
