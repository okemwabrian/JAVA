public class JavaMethods {
    public static void main(String[] args) {
        // Calling a method without parameters
        greet();

        // Calling a method with parameters
        int result = add(5, 10);
        System.out.println("Sum: " + result);

        // Calling a method that returns a value
        double area = calculateArea(7);
        System.out.println("Area of circle with radius 7: " + area);
        
        // Method overloading
        System.out.println("Sum of two integers: " + add(3, 4));
        System.out.println("Sum of three integers: " + add(3, 4, 5));

    }
    
    // Method without parameters
    public static void greet() {
        System.out.println("Hello, World!");
    }
    
    // Method with parameters that returns a value
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method with three parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method that calculates area of a circle
    public static double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }
}
