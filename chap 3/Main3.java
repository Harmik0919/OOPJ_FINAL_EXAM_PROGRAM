// que 100  
// WAP which you will declare an abstract class Vehicle inherits this class from two classes car 
// and truck using the method engine in both display “car has good engine” and “truck has 
// bad engine”.

abstract class Vehicle {
    abstract void engine();
}

class Car extends Vehicle {
    @Override
    void engine() {
        System.out.println("Car has good engine");
    }
}

class Truck extends Vehicle {
    @Override
    void engine() {
        System.out.println("Truck has bad engine");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.engine();

        Vehicle truck = new Truck();
        truck.engine();
    }
}
