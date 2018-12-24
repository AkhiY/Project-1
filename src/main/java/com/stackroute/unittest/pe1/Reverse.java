package com.stackroute.unittest.pe1;

public class Reverse
{
    public String ReverseString(String s) {
    String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
                s1 = s1 + s.charAt(i);
                }
                return s1;
                }
                }