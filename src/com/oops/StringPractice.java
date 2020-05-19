package com.oops;
import java.lang.String;

public class StringPractice {
     public static void main(String[] args){
         char[] c ={'h','a','m','i','d'};
         String str = new String(c);
         String str1 = new String(c,2,3);

         System.out.println(str.length());

     }
}

