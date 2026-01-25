public class JavaMethodOverloading {
    public static void main(String[] args) {
        // Demonstrating method overloading

        // Calling the method with two integer parameters
        int sumTwo = add(5, 10);
        System.out.println("Sum of two integers: " + sumTwo);

        // Calling the overloaded method with three integer parameters
        int sumThree = add(5, 10, 15);
        System.out.println("Sum of three integers: " + sumThree);

        // Calling the overloaded method with two double parameters
        double sumDoubles = add(5.5, 10.5);
        System.out.println("Sum of two doubles: " + sumDoubles);
    }

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public static double add(double a, double b) {
        return a + b;
    }
}
