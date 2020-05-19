package com.homelearning;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args){
        int[] array1 ={123,456,786,987,235,999,197,311};
        String[] array2 ={"java","php","scala","kotlin","c","c#","ruby","kafka"};
        String[] array3 ={"h","a","c","b","e","q","i"};

        Arrays.sort(array1);
        Arrays.sort(array2);
        Arrays.sort(array3);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
    }
}
