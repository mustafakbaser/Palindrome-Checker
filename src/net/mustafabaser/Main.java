package net.mustafabaser;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean palindrome = true;

        System.out.print("Enter a word to check palindrome (case sensitive): ");
        String word = scanner.next();

        for (int i = 0; i < (word.length() / 2); i++) {
            if (!word.substring(i, i + 1).equals(word.substring(word.length() - i - 1, word.length() - i))) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("'" + word + "' is palindrome!");
        } else {
            System.out.println("'" + word + "' is not palindrome!");
        }
    }
}