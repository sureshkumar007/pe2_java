package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;


public class PalindromeCheckTest {
    // PalindromeCheck p1=new PalindromeCheck();


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
