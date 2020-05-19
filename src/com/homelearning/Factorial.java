package com.homelearning;

public class Factorial {
/*
    static int fact(int n){
        if(n!=0){
            return n * fact(n-1);
        }else{
          return 1;
        }
    }

    public static void main(String[] args){

        int result;
        result = fact(3);
        System.out.println(result);

    }

 */ static int n1=0, n2=1,n3;
 static int fact(int count){
     if(count>0){
         n3 = n1 + n2;
         n1=n2;
         n2=n3;
         System.out.println(n3);
         fact(count-1);
     }else {
         return 0;
     }
     return n3;

 }
     public static void main(String[] args){
     fact(10);

     }
}
