public class JavaMath {
    public static void main(String[] args) {
        // Math operations
        int a = 10;
        int b = 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Math functions
        double sqrtValue = Math.sqrt(25);
        double powerValue = Math.pow(2, 3);

        System.out.println("Square root of 25: " + sqrtValue);
        System.out.println("2 raised to the power of 3: " + powerValue);

        //java math.power example
        Math.pow(5, 2); // 5 squared
        Math.pow(3, 3); // 3 cubed
        Math.pow(2, 4); // 2 to the power of 4
        System.out.println("5 squared: " + Math.pow(5, 2));
        System.out.println("3 cubed: " + Math.pow(3, 3));
        System.out.println("2 to the power of 4: " + Math.pow(2, 4));
        //java math.sqrt example
        Math.sqrt(25);
        Math.sqrt(49);
        Math.sqrt(64);
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("Square root of 49: " + Math.sqrt(49));
        System.out.println("Square root of 64: " + Math.sqrt(64));
        


        //rounding examples
        double num1 = 5.7;
        double num2 = 5.3;
        System.out.println("Math.round(5.7): " + Math.round(num1)); // Output: 6
        System.out.println("Math.round(5.3): " + Math.round(num2)); // Output: 5

        //rounding methods
        double ceilValue = Math.ceil(5.3);
        double floorValue = Math.floor(5.7);
        System.out.println("Ceiling of 5.3: " + ceilValue); // Output: 6.0
        System.out.println("Floor of 5.7: " + floorValue); // Output: 5.0


        //random number generator
        double randomValue = Math.random();
        System.out.println("Random value between 0.0 and 1.0: " + randomValue);
    }
}
