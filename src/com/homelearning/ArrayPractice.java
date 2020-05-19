package com.homelearning;

public class ArrayPractice {


    public static void main(String[] args) {

        int[] a = {18,25,20};
        int[] b = {20,30,40,90};


        int a_length = a.length;
        int b_length = b.length;
        int c_length = a_length + b_length;
        int[] c = new int[c_length];

        for (int i = 0; i<a.length; i++) {

             c[i] = a[i];

        }
        for(int i= 0; i<b.length; i++){
            c[a_length + i] = b[i];
        }

        for(int i = 0; i<c.length; i++){
            System.out.println(c[i]);
        }



    }

}

