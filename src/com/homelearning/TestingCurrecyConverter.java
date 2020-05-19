package com.homelearning;

public class TestingCurrecyConverter {

    double x;
    static double[] exchangeRates;

    void setExchangeRates(double[] rates){exchangeRates = rates;}

    void updateCurrency(int arrayIndex, double newValue){

        if(arrayIndex<=exchangeRates.length-1){
            exchangeRates[arrayIndex] = newValue;
            System.out.println("this index exists");
        }
        else { System.out.println("this index doesnot exists"); }

    }

    void updateArray(double number) {

        exchangeRates[0]= exchangeRates[0] * number;
        exchangeRates[1] = exchangeRates[1] * number;



    }

    void printCurriencies(){

        System.out.println("rupee:" + exchangeRates[0]);
        System.out.println("dollar:" + exchangeRates[1]);
        System.out.println("yen:" +exchangeRates[2]);
        System.out.println("dhiram:" +exchangeRates[3]);
    }

    public static  void main(String [] args){
       TestingCurrecyConverter tc = new TestingCurrecyConverter();
        double[] rates = {64.0, 2.3, 45.0, 78.0};
        tc.setExchangeRates(rates);
        tc.printCurriencies();

        tc.updateCurrency(5,74.2);
        tc.printCurriencies();

        tc.updateArray(3);
        tc.printCurriencies();
    }
}

