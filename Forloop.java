public class Forloop {
    public static void main(String[] args) {
        // For loop example
        System.out.println("For loop from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // For loop with a step
        System.out.println("\nFor loop from 0 to 10 with a step of 2:");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        // For loop iterating over an array
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println("\nIterating over an array of fruits:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
