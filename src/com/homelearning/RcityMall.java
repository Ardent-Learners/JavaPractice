package com.homelearning;

public class RcityMall {
    String name;
    String phone;
    double finalBill;
    boolean isPaymentProcessed;
    Store[] item;
    Store[] store;


    RcityMall(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
        this.finalBill = 0.0;
    }


    private void addShoppingItems(Store[] store){
        this.item = store;
    }

    private double beforeGstBill(double[] amount, Store name, double previousBill) {
        if (previousBill == 0) {
            System.out.println("your previous bill is : +0.0");
        } else {
            System.out.println("your previos bill is :" + previousBill);
        }

        double sum = 0.0;

        for(double amt: amount){
            sum = sum + amt;
        }

        switch( name.getName()){
            case "Nike" : return previousBill + sum - (sum * 0.30);
            case "Adidas" : return  previousBill + sum - (sum * 0.15);
            case "Lee" : return  previousBill + sum - (sum * 0.28);
            case "Zara" : return previousBill + sum - (sum *0.40);

        }
        return 0.0;

    }

    private double finalBill(double amount){
        this.finalBill = (amount * 0.18) + amount;
        return this.finalBill;
    }

    private boolean isPaymentProcessed(double amount){
        this.finalBill = this.finalBill - amount;
        if(finalBill ==0) {
        isPaymentProcessed = true;
            return isPaymentProcessed;
        }
        return isPaymentProcessed;
        }


        public static void main(String[] args){
        RcityMall rcityMall = new RcityMall("Hamid","9766912252");

            Store nike = new Store("Nike");
            Store adidas = new Store("Adidas");
            Store lee = new Store("Lee");
            Store zara = new Store("Zara");

            System.out.println("***** WELCOME TO RCITY MALL *****");

            System.out.println("***** Entering The Stores *****");

            System.out.println("***** Entering The NIKE Store *****");

            double nikeBill = rcityMall.beforeGstBill(new double[]{1299, 2499, 4578, 1244}, nike, 0.0);
            System.out.println(" your bill from nike store is:" + nikeBill);

            System.out.println("***** Entering The  ZARA Store *****");
             double zaraBill = rcityMall.beforeGstBill(new double[]{1299, 3400, 2499}, zara, nikeBill);


            double finalBill = rcityMall.finalBill(zaraBill) ;

            System.out.println("YOUR FINAL BILL IS :" +finalBill);
            boolean isBillClear = rcityMall.isPaymentProcessed(finalBill);
            if(isBillClear==true){
                System.out.println("get lost");

            }else
            {
                System.out.println("clear your bill");
            }

        }

}
