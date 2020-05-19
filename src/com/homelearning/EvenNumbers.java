package com.homelearning;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] array1 = {2, 32, 83, 14, 9, 46};

        for (int a : array1) {
            if (a % 2 == 0) {

                System.out.println("the even  numbers are:" + a);
            } else {
                System.out.println("the odd numbers are:" + a);

            }

        }
    }
}
