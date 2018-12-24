
package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;
import java.lang.String;

public class CapitalTest {

    @Test
    public void Check()
    {
        Capital obj = new Capital();
        String result = obj.Check('A');
        assertEquals("Upper case letter",result);
    }
}