public class JavaScope {
    // Class scope variable (instance variable)
    int classScopeVariable;
    
    public static void main(String[] args) {
        // Demonstrating variable scope in Java

        // Local variable
        int localVar = 10;
        System.out.println("Local Variable: " + localVar);

        // Block scope
        {
            int blockVar = 20;
            System.out.println("Block Variable: " + blockVar);
        }
        // Uncommenting the next line will cause a compilation error
        // System.out.println("Block Variable outside block: " + blockVar);

        // Method scope
        printMethodScope();

        // Class scope
        JavaScope js = new JavaScope();
        js.classScopeVariable = 30;
        System.out.println("Class Scope Variable: " + js.classScopeVariable);
    }
    
    // Method demonstrating method scope
    public static void printMethodScope() {
        int methodVar = 25;
        System.out.println("Method Variable: " + methodVar);
    }
}
