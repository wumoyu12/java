package javaPack;

import java.util.Scanner;

public class ArrayChar {

    private char[] letters;
    private int repeatCount;

    public void run() {
        Scanner sc = new Scanner(System.in);

        // enter the number
        System.out.print("Enter a number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Incorrect value has been entered.");
            MainProgram.main(null); // restart
            return;
        }
        repeatCount = sc.nextInt();
        if (repeatCount <= 0) {
            System.out.println("Incorrect value has been entered.");
            MainProgram.main(null); // restart
            return;
        }

        sc.nextLine(); 

        // enter the word
        
        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase(); // all lower case

        if (word.length() == 0) {
            System.out.println("Word cannot be empty.");
            MainProgram.main(null); // restart
            return;
        }

        // put word
        letters = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c < 'a' || c > 'z') {
                System.out.println(c + " is not a letter!");
                MainProgram.main(null); // restart
                return;
            } else {
                System.out.println(c + " is a letter!");
            }
            letters[i] = c;
        }

        // repeat the word
        System.out.println("\nOutput:");
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < repeatCount; j++) {
                System.out.print(letters[i]);
            }
            System.out.println();
        }
    }
}





package javaPack;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to the Letter Repeater Program!");
        System.out.println("This program only accepts lowercase letters a-z.");

        ArrayChar ac = new ArrayChar();
        ac.run();
    }
}
