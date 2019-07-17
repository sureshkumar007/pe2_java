package com.stackroute.pe2;


/**
 * Practice Exercise - Question 1
 * Write a Java method to Reverse the given input & Check if it is a Palindrome.
 */
public class PalindromeCheckTest {
    /**
     * Method to check if given string is palindrome. Returns false if
     * null is given as input.
     * @param input Input string to check if it is palindrome
     * @return True if palindrome, False if not palindrome
     */
    public boolean palindromeCheckFunction(String input) {
        if (input != null) {
            /*Initialize a string builder to reverse the string*/
            StringBuilder inputStringBuilder = new StringBuilder(input);
            return input.equalsIgnoreCase(
                    inputStringBuilder.reverse()
                            .toString());
        } else {
            throw new NullPointerException();
        }
    }
}