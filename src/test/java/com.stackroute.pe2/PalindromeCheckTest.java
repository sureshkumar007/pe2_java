package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class PalindromeCheckTest {
    // PalindromeCheck p1=new PalindromeCheck();
    //creating reference variable for the palindrome class

    PalindromeCheck palindromeCheck;
    //creating memory to the reference variable;

    @BeforeClass
    public void setUp()
    {
        this.palindromeCheck=new PalindromeCheck();
    }
    @AfterClass
    public void tearDown()
    {
        palindromeCheck=null;
    }


    @Test
    public void palindromeCheckTest() {
        //assert
        assertEquals("true", PalindromeCheck.palindromeCheckFunction(""));
    }

    @Test
    public void shouldRecognizeOneCharacterPalindrome() {
        assertEquals(true, PalindromeCheck.palindromeCheckFunction("a"));
    }

    @Test
    public void shouldRecognizeTwoCharacterPalindrome() {
        assertEquals(true, PalindromeCheck.palindromeCheckFunction("aa"));
    }
}
