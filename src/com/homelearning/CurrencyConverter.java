package com.homelearning;

public class CurrencyConverter {


        static double[] exchangeRates;


        void setExchangeRates(double[] rates) {
            exchangeRates = rates;
        }

        void updateExchangeRates(int arrayIndex, double newValue){
            exchangeRates[arrayIndex] = newValue;
        }

        double getExchangeRates(int arrayIndex){
            return exchangeRates[ arrayIndex];
        }

        double computeTransferAmount(int arrayIndex, double amount) {
            return amount * getExchangeRates(arrayIndex);
        }



        void printCurrencies(){

            System.out.println("indian rupees:" + exchangeRates[0]);
            System.out.println("dhiram:" + exchangeRates[1]);
            System.out.println("yen:" + exchangeRates[2]);
            System.out.println("dollar:" + exchangeRates[3]);
        }

        public static void main(String[] args){
            CurrencyConverter cc = new CurrencyConverter();
            double[] rates = { 62.0 , 35.0 , 45.0 ,5.0};
            cc.setExchangeRates(rates);
            cc.printCurrencies();

            rates = new double[] {63.0, 36.0, 45.0, 5.0};
            cc.setExchangeRates(rates);
            cc.printCurrencies();

            cc.updateExchangeRates(0,98);
            cc.printCurrencies();

            double amount = cc.computeTransferAmount(2, 56);
            System.out.println("the computed amount:" + amount);
        }

}
