package com.stackroute.pe2;

import static org.junit.Assert.*;

public class DisplayMembersInfoTest
{
    //act
    DisplayMembersInfo obj=new DisplayMembersInfo();
    String Result=obj.membersName("Harry Potter");
    //assert
    assertEquals("Harry Potter", Result);
    //act
    int Result1 = obj.membersAge(30);
    //assert
    assertEquals(30, Result1);
    int Result2 = obj.membersSalary(2500.3);
    //assert
    assertEquals(2500.3,Result2,0);
}

