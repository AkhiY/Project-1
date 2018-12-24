package com.stackroute.unittest.pe1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AddTest {
    @Test
    public void Numberstest(){
        Add a=new Add();
        int result=a.Numbers(4, new int[]{28, 10, 1, 6});
        assertEquals(45,result);
    }
}