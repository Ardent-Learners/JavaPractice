package com.homelearning;

import java.sql.SQLOutput;

public class NewPostPaidConnection {

    String name;
    String email;
    String address;
    char gender;
    String phone;
    long adharId;
    double currentBill;
    double bill;
    double[] usagecharges;
    double b =0;
    boolean paymentStatus = false;

    public  NewPostPaidConnection(String name, String email, String address, char gender, String phone, long adharId,
                                  double plan){
        this.name = name;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
        this.adharId = adharId;
        this.currentBill = plan;
    }

    public void charges(double[] usagecharges)
    {
        for(int i=0; i<usagecharges.length; i++)
        {
            b = b + usagecharges[i];
        }

        this.currentBill = this.currentBill + b;

        System.out.println(b);
    }

    public double generateBill()
    {
        this.currentBill = (this.currentBill * 0.18) + this.currentBill;
        return this.currentBill;

    }

    double outstandingBill()
    {
        return this.currentBill;
    }

    boolean processPayment(double amount){
        this.currentBill = this.currentBill - amount;
        System.out.println("pending bill is:" + this.currentBill);
        if(this.currentBill == 0)
        {
            paymentStatus = true;
            return paymentStatus;
        }
        return paymentStatus;
    }


    void printData(){
        System.out.println("Name:" + name + "\nEmail:" + email + "\nAddress:" + address + "\nGender:" + gender +
                "\nPhone:" + phone + "\nAdharid:" + adharId + "\nCurrentBill:" + currentBill);

    }




    public static  void main(String[] args){
        NewPostPaidConnection airtel = new NewPostPaidConnection("Hamid","khanham4@gmail.com","Pride World City",
                'M', "9766912252", 3240056,899.0);

        System.out.println("****** GETTING YOUR PROFILE ******");
        System.out.println("\n");
        airtel.printData();

        System.out.println("****** PROCESSING BILL STATUS ******");
        System.out.println("****** CALCULATING CHARGES ******");

        airtel.charges(new double[]{78.0, 99.9, 345.0, 67.2, 43.2, 2.2, 198.34, 56.76, 23.89,257.0});

        System.out.println("TOTAL CHARGES ON THE YOUR PLAN IS:" + airtel.outstandingBill());

        double generateBill = airtel.generateBill();

        System.out.println("The generated bill is: " + generateBill);

        boolean billclear = airtel.processPayment(generateBill);

        if( billclear == true){
            System.out.println("GET THE FUCK OUT OF HERE !!!!!HAPPY TO SERVE YOU");
        }else{
            System.out.println("clear the bill");
        }

    }
}
