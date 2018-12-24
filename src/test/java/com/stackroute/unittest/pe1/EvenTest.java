package com.stackroute.unittest.pe1;


import com.stackroute.unittest.pe1.Even;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenTest {

    @Test
    public void Evenornot()
    {
        Even obj = new Even();
        String result = obj.Evenornot(25);
        assertEquals("Tom",result);
    }
}