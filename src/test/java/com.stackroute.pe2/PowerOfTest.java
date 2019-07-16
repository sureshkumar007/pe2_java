package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTest {

    @Test
    public void powerOfFunctionTest()
    {
        assertEquals("true",PowerOf.powerOfFunction(16));

    }
    @Test
    public void powerOfFunctionTest1()
        {
            assertEquals("false",PowerOf.powerOfFunction(15));

        }
        @Test
        public void powerOfFunctionTest2()
        {
            assertEquals("false",PowerOf.powerOfFunction(0));

        }


    }
