package javaPack;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to my letter counting words!");
        System.out.println("This program will print out each letter of a word n amount of times");

        ArrayChar arrchar = new ArrayChar();
        arrchar.AcceptInfo(); // call AcceptInfo to start the program
    }
}





package javaPack;

import java.util.Scanner;

public class ArrayChar {

    private char[] wordarray;   // Array to store each character of the word
    private int numletters;     // Number of times to repeat each letter

    // Method to accept input from the user
    public void AcceptInfo() {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        numletters = sc.nextInt();
        if (numletters <= 0) {
            System.out.println("Incorrect value has been entered.");
            return;
        }

        sc.nextLine(); // Clear the newline character

        // Prompt user to enter a word
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (word.length() == 0) {
            System.out.println("Word cannot be empty.");
            return;
        }

        // Store each character of the word in the array
        wordarray = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            wordarray[i] = word.charAt(i);

            // Check if the character is a lowercase letter a–z
            if ((int)wordarray[i] <= 96 || (int)wordarray[i] >= 123) {
                System.out.println(wordarray[i] + " is not a letter!");
            } else {
                System.out.println(wordarray[i] + " is a letter!");
            }
        }

        // Print each letter numletters times
        System.out.println("\nOutput:");
        for (int i = 0; i < wordarray.length; i++) {
            for (int j = 0; j < numletters; j++) {
                System.out.print(wordarray[i]);
            }
            System.out.println(); // Move to next line after each letter
        }
    }
}
