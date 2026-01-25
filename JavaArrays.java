public class JavaArrays {
    public static void main(String[] args) {
        // Example of a simple Java array
        int[] numbers = {1, 2, 3, 4, 5}; // Declaration and initialization of an array

        // Accessing array elements
        System.out.println("First element: " + numbers[0]); // Accessing the first element

        // Looping through the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Using enhanced for loop
        System.out.println("Array elements using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Multi-dimensional array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing elements in a multi-dimensional array
        System.out.println("Element at row 1, column 2: " + matrix[1][2]);

        // Looping through a multi-dimensional array
        System.out.println("Matrix elements:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


        //Java Arrays Loop
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        System.out.println("Fruits in the array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
