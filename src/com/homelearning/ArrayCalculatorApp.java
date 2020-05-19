package com.homelearning;

public class ArrayCalculatorApp {

    public int sum(int[] a){
        int b = 0;
        for(int i =0; i<a.length; i++ ){
           b = b + a[i];
        }
        return b;
    }

    public int sub(int[] a){
        int s = 0;
        for(int i=0; i<a.length; i++){
            s = a[i] - s;
        }
        return s;

    }

    public int mul(int[] a){
        int m = 1;
        for(int i=0; i<a.length; i++){
            m = m * a[i];
        }

        return m;
    }

    public int div(int input, int[] a){
        int d = 0;
        for(int i=0; i<a.length; i++){
            d = d + a[i];
        }

        return d/input;
    }

    public static void main(String [] args) {
        int[] array = {10,20,30,4,55,32};

        ArrayCalculatorApp aca = new ArrayCalculatorApp();

        System.out.println(aca.sum(array));
        System.out.println(aca.sub(array));
        System.out.println(aca.mul(array));
        System.out.println(aca.div(6, array));
    }
}
