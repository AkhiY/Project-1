package com.stackroute;



import com.stackroute.unittest.pe1.Ntimes;
import org.junit.Test;



import static org.junit.Assert.*;



public class NtimesTest {



    Ntimes obj = new Ntimes();



    @Test



    public void loop() {

        int result = obj.loop(5);

        assertEquals(6, result);

    }



}