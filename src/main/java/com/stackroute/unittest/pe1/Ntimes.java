package com.stackroute.unittest.pe1;

public class Ntimes
{

    public int loop(int n)

    {

        int i,j;

        System.out.println("Enter a number");

        for(i=1;i<=n;i++)

        {

            for(j=1;j<=i;j++)

            {

                System.out.print(i);

            }

        }

        return i;

    }

}