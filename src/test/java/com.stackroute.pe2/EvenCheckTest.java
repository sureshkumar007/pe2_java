package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class EvenCheckTest
{

    EvenCheck evenCheck;
    @BeforeClass
    //object is created here and memory was created
    public void setDown()
    {
       this.evenCheck=new EvenCheck();
    }

    //clearing object to null
    @AfterClass
    public void tearDown()
    {
        evenCheck=null;
    }
    @Test
    //assert
    public void evenCheckEquals()
    {
        String string=evenCheck.evenCheckFunction(6)
        assertEquals("true",string);
    }
    @Test
            public void evenCheckFalse()
    {
        //arrange
        String string=evenCheck.evenCheckFunction(7);
        //assert
        assertEquals("false",string);
    }
    @Test
    public void evenCheckZero()
    {
        //arrange
        String string=evenCheck.evenCheckFunction(0);
        //assert
        assertEquals("false",string);

    }


}
