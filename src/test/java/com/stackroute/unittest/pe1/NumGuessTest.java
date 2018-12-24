package com.stackroute.unittest.pe1;



import org.junit.Test;



import static org.junit.Assert.*;



public class NumGuessTest {

    NumGuess obj =new NumGuess();

    @Test

    public void guessNumbe()



    {

        String result = obj.guessNumber(15);

        assertEquals("Number guessed is equal to original number     ",result);

    }

    @Test

    public void guessNum()



    {

        String result = obj.guessNumber(25);

        assertEquals("Number guessed is more than original number     ",result);

    }

    @Test

    public void guessNumber()



    {

        String result = obj.guessNumber(10);

        assertEquals("Number guessed is less than original number     ",result);

    }



}