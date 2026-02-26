public class outerloop { // Good practice: Class names start with Uppercase
    public static void main(String[] args) {
        
        outerloop: // <--- The missing label definition!
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerloop; // Now it knows where to jump to
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        System.out.println("Done!");
    }
}