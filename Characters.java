public class Characters {
    
    public static void main(String[] args) {
        char letterA = 'A';
        char letterB = 'B';

        // Display characters
        System.out.println("Character A: " + letterA);
        System.out.println("Character B: " + letterB);

        // Character arithmetic
        char nextLetter = (char) (letterA + 1);
        System.out.println("Next letter after A: " + nextLetter);

        // Comparing characters
        boolean isEqual = (letterA == letterB);
        System.out.println("Is A equal to B? " + isEqual);

        boolean isGreater = (letterB > letterA);
        System.out.println("Is B greater than A? " + isGreater);
    }
}



