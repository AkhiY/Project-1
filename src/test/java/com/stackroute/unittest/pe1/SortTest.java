package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test

    public void NonIncr()
    {
        Sort obj = new Sort();
        int result = obj.Order(234534);
        assertEquals(544332,result);
    }
}