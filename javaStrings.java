public class javaStrings {
    public static void main(String[] args) {
        // Creating string variables
        String greeting = "Hello, World!";
        String name = "Java Programming";

        // Concatenation of strings
        String fullGreeting = greeting + " Welcome to " + name + ".";
        System.out.println(fullGreeting);

        // String length
        int length = fullGreeting.length();
        System.out.println("Length of full greeting: " + length);

        // Accessing characters in a string
        char firstChar = fullGreeting.charAt(0);
        System.out.println("First character of full greeting: " + firstChar);

        // Substring
        String subString = fullGreeting.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + subString);

        // Changing case
        String upperCaseGreeting = fullGreeting.toUpperCase();
        System.out.println("Uppercase Greeting: " + upperCaseGreeting);

        String lowerCaseGreeting = fullGreeting.toLowerCase();
        System.out.println("Lowercase Greeting: " + lowerCaseGreeting);

        //converting to upercase and lowercase and also removing spaces white spaces and comparing the strings
        String modifiedGreeting = fullGreeting.toUpperCase().replace(" ", "");
        System.out.println("Modified Greeting (Uppercase & No Spaces): " + modifiedGreeting);
        boolean isEqual = fullGreeting.equalsIgnoreCase("hello, world! welcome to java programming.");
        System.out.println("Is full greeting equal to 'hello, world! welcome to java programming.' (ignoring case)? " + isEqual);
        boolean isEqual2 = fullGreeting.equals("hello, world! welcome to java programming.");
        System.out.println("Is full greeting equal to 'hello, world! welcome to java programming.' (considering case)? " + isEqual2);
        boolean isEqual3 = fullGreeting.equalsIgnoreCase("hello, world! welcome to java programming.");
        System.out.println("Is full greeting equal to 'hello, world! welcome to java programming.' (ignoring case)? " + isEqual3);
        
    }
}
