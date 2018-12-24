package com.stackroute.unittest.pe1;
import org.junit.Test;
import java.lang.String;
import java.util.Stack;

import static org.junit.Assert.*;
public class StackRouteTest {
    StackRoute s=new StackRoute();

    @Test

    public void stackRoute()

    {

        String result = s.stackRoute("akhila",2);

        assertEquals("akhilaalal",result);

    }

}