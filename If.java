public class If {
    public static void main (String[] args) {
        int number = 10;

        // Simple if statement
        if (number > 5) {
            System.out.println("The number is greater than 5.");
        }

        // If-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // If-else-if ladder
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
