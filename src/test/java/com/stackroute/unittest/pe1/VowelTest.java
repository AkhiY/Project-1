package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.*;


public class VowelTest {

    @Test
    public void CheckTest()
    {
        Vowel obj = new Vowel();
        String result = obj.VowelorCons("a");
        assertEquals("vowel",result);
    }


    @Test
    public void CheckTest1()
    {
        Vowel obj1 = new Vowel();
        String result =obj1.VowelorCons("@");
        assertEquals("consonant",result);
    }
}