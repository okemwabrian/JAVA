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

// Switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
                break;
        }
////Java Short Hand If...Else (Ternary Operator)
        int number = 8;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result);



        // While loop statement
        int count = 0;
        while (count < 3) {
            System.out.println("Count is: " + count);
            count++;

            //Nested Ternary
            int score = 85;
            String grade = (score >= 90) ? "A" :
                    (score >= 80) ? "B" :
                            (score >= 70) ? "C" :
                                    (score >= 60) ? "D" : "F";
            System.out.println("The grade is: " + grade);

        }
        //Java Nested If
        int age = 25;
        if (age >= 18) {
            if (age < 65) {
                System.out.println("Adult");
            } else {
                System.out.println("Senior Citizen");
            }
        } else {
            System.out.println("Minor");
        }
        System.out.println("Done");
        System.out.println("This is the end of the program.");
        System.out.println("Goodbye!");




        //Java If ... Else Examples
        int temperature = 30;
        if (temperature > 30) {
            System.out.println("It's a hot day.");
        } else if (temperature >= 20) {
            System.out.println("It's a warm day.");
        } else {
            System.out.println("It's a cold day.");
        }




        //Countdown Example
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }

                //Countdown Example to happy new year
                int year = 2024;
                for (int i = 10; i > 0; i--) {
            System.out.println("Countdown: " + i);
        }
        System.out.println("Happy New Year " + year + "!");
        



    }
}
