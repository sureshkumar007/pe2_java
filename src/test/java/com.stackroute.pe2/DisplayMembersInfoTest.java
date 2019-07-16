package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DisplayMembersInfoTest
{
    DisplayMember displayMember;
    @BeforeClass
    public void setUp()
    {
       this.displayMember=new DisplayMembers;
    }
    @AfterClass
            public void tearDown()
    {
        displayMember=null;
    }


    //create method for memberName() and it return the string
    @Test

        public void displayMemberNameTest() {
        String Result = displayMember.membersName("Harry Potter");
       // assert
                assertEquals("Harry Potter", Result);
    }
    //
    //act
    //create a method for integer to get the age of the member
    @Test
    public void displayMemberAge() {
        int Result1 = displayMember.membersAge(30);
        //assert
        assertEquals(30, Result1);
    }
    @Test
    public void displayMemberSalary() {
        int Result2 = displayMember.membersSalary(2500.3);
        //assert
        assertEquals(2500.3, Result2, 0);
    }


}

