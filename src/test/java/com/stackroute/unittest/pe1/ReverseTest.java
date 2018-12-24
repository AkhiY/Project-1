package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test

    public void rev()
    {
        Reverse rev = new Reverse();
        String result = rev.ReverseString("akhila");
        assertEquals("alihka",result);
    }

}