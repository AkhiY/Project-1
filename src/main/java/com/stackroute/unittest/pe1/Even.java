package com.stackroute.unittest.pe1;

public class Even
{
    public String Evenornot(int num) {
        if ((num > 20) && (num < 30)) {
            if (num % 2 != 0) {
                return "Tom";
            } else {
                return "Jerry";
            }
        }
        else
        {
            System.out.println("Invalid Number");
        }
        return "success";
    }
}