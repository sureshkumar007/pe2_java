package com.stackroute.pe2;

import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

public class FileReaderLengthTest
{
    FileReaderLength fileReaderLength=new FileReaderLength();
    @Test
    public void function()
    {
        String string=fileReaderLength.functionMain("input.txt");
        assertEquals("HELLO",string);
    }
    @Test
    public void function1()
    {
        String string=fileReaderLength.functionMain("abd");
        assertEquals("false",string);
    }

}
