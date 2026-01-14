public class JavaOperators {
    //operators in Java,assignment,arithmetic,comparison,logical
    public static void main(String[] args) {
        // Assignment Operator
        int a = 5;
        int b = 10;
        System.out.println("Assignment: a = " + a + ", b = " + b);

        // Arithmetic Operators
        int sum = a + b;
        int difference = b - a;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println("Arithmetic Operations:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Comparison Operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (b > a);
        boolean isLess = (a < b);
        boolean isGreaterOrEqual = (b >= a);
        boolean isLessOrEqual = (a <= b);

        System.out.println("Comparison Operations:");
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("b > a: " + isGreater);
        System.out.println("a < b: " + isLess);
        System.out.println("b >= a: " + isGreaterOrEqual);
        System.out.println("a <= b: " + isLessOrEqual);

        // Logical Operators
        boolean x = true;
        boolean y = false;

        boolean andResult = x && y;
        boolean orResult = x || y;
        boolean notX = !x;

        System.out.println("Logical Operations:");
        System.out.println("x AND y: " + andResult);
        System.out.println("x OR y: " + orResult);
        System.out.println("NOT x: " + notX);

        //comparison and precedence
        int c = 15;
        boolean complexComparison = (a < b) && (c > b) || (a == 5);
        System.out.println("Complex Comparison Result: " + complexComparison);
    }
}
