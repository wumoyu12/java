package javaPack;

import java.util.Scanner;

public class TimeChecker {

    private int hour; // store user input hour

    // Method to accept input from the user
    public void acceptInfo() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Prompt user to enter an hour
            System.out.print("Enter an hour (0-23): ");
            hour = sc.nextInt();

            // Validate input
            if (hour < 0 || hour >= 24) {
                System.out.println("Incorrect value has been entered. Please try again.\n");
                continue; // return to beginning of loop
            }

            // Call timeOfDay and print result
            String result = timeOfDay(hour);
            System.out.println("Time of day: " + result);
            break; // exit loop when valid input
        }

        sc.close();
    }

    // Method to determine time of day using switch + if
    public String timeOfDay(int hour) {
        switch (hour) {
            case 0:
                return "midnight";
            case 12:
                return "noon";
            case 18:
                return "dusk";
            default:
                if (hour > 0 && hour < 12) {
                    return "morning";
                } else if (hour > 12 && hour < 18) {
                    return "afternoon";
                } else if (hour > 18 && hour < 24) {
                    return "evening";
                } else {
                    return "Invalid hour"; // should never happen
                }
        }
    }
}



package javaPack;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to the Time of Day Checker!");
        System.out.println("This program will tell you the time of day based on 24-hour input.");

        TimeChecker checker = new TimeChecker();
        checker.acceptInfo(); // call acceptInfo to start the program
    }
}
