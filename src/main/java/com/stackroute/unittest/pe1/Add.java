package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Add {
    public static int Numbers(int n,int a[]){


        int sum=0;

        for(int i=0;i<n;i++){
            sum+=a[i];

        }
        return sum;
    }


}