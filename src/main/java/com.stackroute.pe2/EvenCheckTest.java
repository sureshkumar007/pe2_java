

package com.stackroute.pe2;

/**
 * Practice Exercise - Question 5
 * Write a boolean method called isEven() in a class called EvenNumTest, which takes
 * an int as input and returns true if the input is even. The signature of the method is as
 * follows: public static boolean isEven(int number)
 */
public class EvenCheckTest {
    /**
     * Checks if given number is even or not. Throws null pointer exception
     * if null is given. Returns false if value is less than or equal to 0.
     * Integer is used instead of int to handle null values as well.
     * @param number Integer to check if even or not
     * @return True or False based on number
     */
    public boolean evenCheck(Integer number) {
        /*Check if number is not null*/
        if (number != null) {
            if (number > 0) {
                return (number % 2) == 0;
            } else {
                return false;
            }
        } else {
            /*Throw NullPointerException if number is null*/
            throw new NullPointerException();
        }
    }
}