ppackage com.stackroute.pe2;

/**
 * Practice Exercise - Question 2
 * Write a Java method to check if a given number is power of 4
 */
public class PowerOfTest {

    /**
     * Checks if a given number is power of 4 by calculating the Log of the
     * number to the base 4 and check if the result is integer or not.
     * @param number to check if it's a power of 4
     * @return True if the given number is a power of 4 or else false
     */
    public boolean powerOfFunctionTest(int number) {
        double logOfNumber = Math.log(number)/Math.log(2);
        return logOfNumber == Math.floor(logOfNumber);
    }
}
