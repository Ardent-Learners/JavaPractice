package com.homelearning;

public class FirstByLast {

    public static void main(String[] args){

        float[] array1 ={16,3,5,6,3,6,9};

        float a;

           if (array1[array1.length-1]==0 )
           {


               System.out.println("error 404!!!!:");
           }

           else
               {
                   a = array1[0] / array1[array1.length-1];
                   System.out.println("dividing first element by last element give:"+a);

               }
       }
}



