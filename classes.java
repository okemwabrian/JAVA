//clases and objects and their principles
class Car {
    String color;
    String model;
    int year;

    void start() {
        System.out.println("Car is starting");
    }

    void stop() {
        System.out.println("Car is stopping");
    }
}
public class classes {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.model = "Toyota";
        myCar.year = 2020;

        System.out.println("My car is a " + myCar.color + " " + myCar.model + " from " + myCar.year);
        myCar.start();
        myCar.stop();
    }
}
//principles of OOP
//1. Encapsulation: Bundling data and methods that operate on that data within a single unit (class) and restricting access to some of the object's components.
//2. Inheritance: A mechanism where a new class (child class) inherits properties and behaviors (fields and methods) from an existing class (parent class).
//3. Polymorphism: The ability of a single function or method to work in different ways based on the object it is acting upon. It allows methods to do different things based on the object it is acting upon, even if they share the same name.
//4. Abstraction: The concept of hiding the complex implementation details and showing only the necessary features of an object. It allows the user to focus on what the object does instead of how it does it. 