
public class arrays {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // Modifying an element in the array
        numbers[1] = 25;
        System.out.println("Modified second element: " + numbers[1]);

        // Looping through the array
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //2d and 3d arrays can be declared and initialized similarly, using nested curly braces for 2d and 3d arrays.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // 3d array example
        int[][][] threeDArray = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };
    }
}
 