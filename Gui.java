public class Gui {
    public static void main(String[] args) {
        System.out.println("This is a placeholder for the GUI application.");

        // gui for adding 2 numbers
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        // graphical user interface for basic math operations
        int a = 15;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        // gui for math functions
        double sqrtValue = Math.sqrt(36);
        double powerValue = Math.pow(3, 4);
        System.out.println("Square root of 36: " + sqrtValue);
        System.out.println("3 raised to the power of 4: " + powerValue);
        System.out.println("Absolute value of -10: " + Math.abs(-10));
        System.out.println("Maximum of 10 and 20: " + Math.max(10, 20));
        System.out.println("Minimum of 10 and 20: " + Math.min(10, 20));
        
    }
}
