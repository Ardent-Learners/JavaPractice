package com.homelearning;

public class ShoppingMall {

    String name;
    String phoneNumber;
    boolean isPaymentProcessed;
    Store[] shoppingItems;
    double finalAmount;


    ShoppingMall(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.finalAmount = 0.0;
    }

    private void addShoppingItems(Store[] store) {
        this.shoppingItems = store;
    }

    private double beforeGstBill(double[] amount, Store store, double previousAmount) {

        if(previousAmount == 0.0) {
            System.out.println("Previous amount is Zero. Calculating the amount from first store");
        } else {
            System.out.println("Previous balance is: " + previousAmount);
        }

        double sum = 0.0;
        for(double amt : amount) {
            sum = sum + amt;
        }

        switch (store.getName()) {
            case "Nike" : return previousAmount + sum - (sum * 0.5);
            case "Addidas" : return previousAmount + sum - (sum * 0.7);
            case "Reebok" : return previousAmount + sum - (sum * 0.3);
            case "Zara" : return previousAmount + sum - (sum * 0.1);
        }

        return 0.0;
    }

    private double finalBill(double amount) {
        this.finalAmount = (amount * 0.18) + amount;
        return finalAmount;
    }

    private boolean processPayment(double payment) {
        this.finalAmount = this.finalAmount - payment;

        if(finalAmount == 0) {
            isPaymentProcessed = true;
            return isPaymentProcessed;
        }
        return isPaymentProcessed;
    }

    public static void main(String[] args) {
        System.out.println("***** Welcome to Pheniox Mall *****\n");
        ShoppingMall phenix = new ShoppingMall("Rohit", "39939339");

        Store nike = new Store("Nike");
        Store addidas = new Store("Addidas");
        Store reebok = new Store("Reebok");
        Store zara = new Store("Zara");

        phenix.addShoppingItems(new Store[] {nike, addidas});

        System.out.println("***** Entered into Nike Store for Shopping *****");
        double nikeBill = phenix.beforeGstBill(new double[] {100, 200, 300}, nike, 0.0);
        System.out.println("Bill from Nike Store is: " + nikeBill);

        System.out.println("\n\n\n***** Entered into Addidas Store for Shopping *****");
        double addidasBill = phenix.beforeGstBill(new double[] {200, 300, 400}, addidas, nikeBill);
        System.out.println("Bill from Addidas Store is: " + addidasBill);


        System.out.println("\n\n\n***** Reached Main Bill Counter for Final Bill Generation *****");
        double billAmount = phenix.finalBill(addidasBill);
        System.out.println("Final Bill Amount: " + billAmount);

        System.out.println("\n\n***** Processing Payment Now *****");
        boolean processPayment = phenix.processPayment(billAmount);

        if(processPayment) {
            System.out.println("GET the FUCK OUT OF HERE. Come back again!!!!");
        } else {
            System.out.println("Please clear the bill Moron!!!!");
        }


    }
}
