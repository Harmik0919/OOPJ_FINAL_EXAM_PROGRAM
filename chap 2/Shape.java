
// que 71
// Write a program to create a Shape class with an area () function to find an 
// area of a circle, square, triangle.

class Shape {
    public double area(double radius) {
        // Area of a circle: πr^2
        return Math.PI * radius * radius;
    }

    public double area(double side, boolean isSquare) {
        // Area of a square: side^2
        if (isSquare) {
            return side * side;
        }
        return 0;
    }

    public double area(double base, double height) {
        // Area of a triangle: 0.5 * base * height
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Shape shape = new Shape();

        double circleArea = shape.area(5.0);
        System.out.println("Area of the circle: " + circleArea);

        double squareArea = shape.area(4.0, true);
        System.out.println("Area of the square: " + squareArea);

        double triangleArea = shape.area(3.0, 6.0);
        System.out.println("Area of the triangle: " + triangleArea);
    }
}

