package com.homelearning;

public class SumOfArray {

    public  static  void main(String[] args){
        int[] a = {10,40,30,5,10,20};
        int b = 0;

        for(int i =0; i < a.length; i++){
            b = b + a[i];
        }
        System.out.println("The sum of numbers are:" +b);

    }


}
