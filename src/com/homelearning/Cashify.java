package com.homelearning;

public class Cashify {

    /*String phoneNo;
    String city;
    Service[] service;
    private double salePriceOfPhone;


    Cashify(String city, String phoneNo){
    this.phoneNo = phoneNo;
    this.city = city;
    }



   /* public double getSalePrice(String mobileBrand, String model, int varient, boolean fingerprint, boolean faceId, boolean wirlessCharging, boolean networkIssues,
                                boolean screenIssue, boolean bodyDamage, boolean warranty, boolean ogCharger, boolean ogEarphones, boolean bill, boolean ogBox){

       /* double salePriceOfPhone = getPrice(mobileBrand,model,varient);

        if(fingerprint || faceId)
        {
            salePriceOfPhone = salePriceOfPhone + 3000;
        }else {
            salePriceOfPhone = salePriceOfPhone - 4000;
        }


        if(wirlessCharging)
        {
            salePriceOfPhone = salePriceOfPhone + 3000;
        }else{
            salePriceOfPhone =  salePriceOfPhone - 2900;
        }

        if (networkIssues && (screenIssue || bodyDamage)){
            salePriceOfPhone = salePriceOfPhone -2800;
        }else{
            salePriceOfPhone = salePriceOfPhone + 1200;
        }

        //return ogBox || ogCharger ? +1500 : -1800;

        return warranty ? 2000 : 2200;


    }




    private double getRepairPhone(String city, String mobileBrand, String model, boolean screen, boolean mic,
                                  boolean speaker, boolean receiver, boolean auxJack, boolean battery, double previousBill,
                                    double[] amount){
        if (previousBill == 0) {
            System.out.println("your previous bill is : +0.0");
        } else {
            System.out.println("your previos bill is :" + previousBill);
        }

        double sum = 0.0;

        for(double amt: amount){
            sum = sum + amt;
        }

        String name;
        switch(name){
            case "Screen" : return previousBill + sum + 2199;
            case "Battery" : return previousBill + sum + 1299;
            case "Mic" : return previousBill + sum + 599;
            case "Reciever" : return previousBill + sum + 599;
            case "ChargingJack" : return previousBill + sum + 599;
            case "AuxJack" : return previousBill + sum + 599;
        }

        return 0.0;

    }


    /*private double getPrice(String mobileBrand, String model, int varient)
    {
        switch(name.getName()){
        case "Sellphone" :return this.salePrice;
    }

*/

    public static void main(String[] args) {
        int[] a = {2, 4, 7, 56, 8, 0, 9};
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i])
                {
                  max = a[i];
                }
        }


        for (int i = 1; i < a.length; i++) {
            if (min > a[i])
            {
                min = a[i];
            }

        }

        System.out.println(max);
        System.out.println(min);
    }
}


