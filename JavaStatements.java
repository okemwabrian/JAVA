public class JavaStatements {
    public static void main(String[] args) {
        // Example of a simple Java statement
        int x = 5; // Declaration and initialization statement
        int y = 10; // Declaration and initialization statement
        int sum = x + y; // Expression statement

        System.out.println("The sum of x and y is: " + sum); // Method call statement

        // Conditional statement
        if (sum > 10) {
            System.out.println("The sum is greater than 10.");
        } else {
            System.out.println("The sum is 10 or less.");
        }

        // Loop statement
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
