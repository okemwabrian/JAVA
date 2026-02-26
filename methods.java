public class methods {
    public static void main(String[] args) {
        // Calling a void method
        printMessage();

        // Calling a method with parameters and a return value
        int sum = calculateSum(5, 10);
        System.out.println("The sum of 5 and 10 is: " + sum);
    }

    // 1. A 'void' method: Performs an action but returns nothing
    public static void printMessage() {
        System.out.println("Hello! You've successfully called a method.");
    }

    // 2. A 'return' method: Performs a calculation and sends back data
    public static int calculateSum(int a, int b) {
        return a + b;
    }
}