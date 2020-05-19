package com.homelearning;

public class Average {
    public static void main(String[] args){
        int[] a = {10,20,33,4,56,7,8};
        int b = 0;

        for(int i = 0; i<6; i++)
        {
            b = b + a[i];

        }

        System.out.println("sum of the numbers:" +b);

    }


}
