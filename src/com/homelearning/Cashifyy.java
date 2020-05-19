package com.homelearning;
import java.util.Date;


public class Cashifyy {
    String city;
    String name;
    String email;
    String phone;
    double price;
    boolean isPaymentProcessed;

    public Cashifyy(String city, String name,String email, String phone){
    this.city = city;
    this.name = name;
    this.email = email;
    this.phone = phone;
    }


    private double getSalePrice(String city, String makeAndModel, String varient, boolean faceId, boolean fingerPrint,
                                boolean bodyIssue, boolean screenIssue, boolean ogAccessories, boolean ogBox,
                                boolean warranty){

        System.out.println("***** Sell your Mobile Phone for instant cash *****");
        System.out.println("***** #Maximum Value" + "  " + "#Safe & Hassle-free" + "  " + "#Free Doorstep Pickup *****");
        System.out.println("------ Pick our Sell your Phone Service ------");
        System.out.println();
        double salePrice = getPrice(makeAndModel, varient);

        System.out.println("Base Price of Apple Phone is :" +salePrice);
        System.out.println("Calculating the price of phone based on checking the checklist criteria:");
        System.out.println("makeAndMdel" + " " +  "varient" + " " + "faceId" + " " + "fingerPrint" + " " +
         "bodyIssue" + " " + "screenIssue" + " " + "ogAccessories" + " " + "ogBox" + " " +
         "warranty");

        if(faceId || fingerPrint){
            salePrice += 1500;
        }else{
            salePrice -= 1500;
        }

        if(screenIssue || bodyIssue){
            salePrice -= 2500;
        }else{
            salePrice += 2500;
        }

        if (ogAccessories & ogBox) {
            salePrice += 3000;
        }else{
            salePrice -=2500;
        }

        if(warranty){
            salePrice += 2000;
        }else {
            salePrice -= 2000;
        }
        return salePrice;

    }


    private static double repairPhone( String makeAndModel, boolean screen, boolean mic, boolean reciever, boolean aux,
                                       boolean chargingPort, boolean battery) {

        System.out.println("***** Repair Your Phone At DoorStep ***** ");
        System.out.println("***** @ Trained Professionals" + " "+ "@ Doorstep Service" +" " + "@ 6-months warranty ***** ");

        double repairCost = 0.0;

        System.out.println("------ Pick our Repair Service ------");


        repairCost += screen ? 1299.0 : 0.0;
        repairCost += mic ? 699.0 : 0.0;
        repairCost += reciever ? 699.0 : 0.0;
        repairCost += aux ? 599.0 : 0.0;
        repairCost += chargingPort ? 599.0 : 0.0;
        repairCost += battery ? 2199.0 : 0.0;


    return repairCost;
    }




    private double getPrice(String makeAndModel, String varient) {

        switch (makeAndModel) {
            case "Apple Iphone Xs" : return 40000.0;
            case "Xiaomi Mi A1" : return 7000.0;
            case "OnePLus 7T" : return 18000.0;
            case "Xiaomi Poco F1" : return 12000.0;
        }
        return 0.0;
    }


    public double getBuyPrice(Phone phones){

        System.out.println("***** Buy Phone At Most Affordable Price ***** ");
        System.out.println("***** @ Almost New Device" + " "+ "@ Doorstep Service" +" " + "@ 6-months warranty ***** ");
        phones.showMobile();
        this.price = phones.getPrice();
        return this.price;
    }


    private boolean isPaymentProcessed(double amount){
        this.price = this.price - amount;
        if(price ==0) {
            isPaymentProcessed = true;
            return isPaymentProcessed;
        }
        return isPaymentProcessed;
    }



    void printUserProfile(){
        System.out.println("City:" + city +" " + "Name:" + name +" " + "Email-id:" + email +" " +
                "Phone no:" + phone );
    }



    public static void main(String[] args){
       // String[] city = {"PUNE", "MUMBAI", "DELHI", "BANGLORE", "HYDRABAD"};
        Cashifyy cashifyy = new Cashifyy("PUNE", "Hamid","khanham4@gmail.com","9766912252");
        Date date;
        cashifyy.printUserProfile();

        Phone apple = new Phone("Iphone 7 Plus","Refurbished",64,23999.0);
        Phone apple1 = new Phone("Apple Iphone Xs","Refurbished",256,56999.0);
        Phone apple2 = new Phone("Apple Iphone 6s","Open-Box",64,16499.0);
        Phone apple3 = new Phone("Apple Iphone 5s", "New",32,9999.0);
        Phone onePlus = new Phone("OnePLus 3T", "New",64,11099.0);
        Phone onePlus1 = new Phone("OnePLus 5T","Refurbished", 64,14028.0);
        Phone onePlus2 = new Phone("OnePLus 7T", "New",64,11099.0);
        Phone onePlus3 = new Phone("OnePLus 7Pro", "Open-Box",64,11099.0);
        Phone xiaomi = new Phone("Xiaomi Mi A1","Refurbished", 64,8999.0);
        Phone xiaomi1 = new Phone("Xiaomi Mi A2", "New",128,11299.0);
        Phone xiaomi2 = new Phone("Xiaomi Poco F1", "Open-Box",64,12899.0);

        Phone[] phones = {apple,apple1,apple2,apple3,onePlus,onePlus1,onePlus2,onePlus3,xiaomi,xiaomi1,xiaomi2};

        System.out.println("\n-------- WELCOME TO CASHIFY --------\n");


        System.out.println("---------- SELLING BOOTH ----------");
        double salePrice = cashifyy.getSalePrice("Pune", "Apple Iphone Xs", "64", false,false,
                false, true,true,true,false);

        System.out.println("the price of phone is:"+salePrice);
        System.out.println("\n");

        System.out.println("---------- REPARING BOOTH ----------");
        double repair =  repairPhone("Apple",true,true, false,true,false,false);
        System.out.println("Adding repairing service to cart ");
        System.out.println("Your repairing Cost is:" + repair);
        System.out.println("\n");

        System.out.println("---------- BUY PHONE BOOTH ----------");


       double buyPrice = cashifyy.getBuyPrice(apple);
        System.out.println("the price of the phone is " + buyPrice);

       boolean isBillClear = cashifyy.isPaymentProcessed(buyPrice);
        if(isBillClear==true){
            System.out.println("Congratulations !!! Successfully purchased the phone");

        }else
        {
            System.out.println("pay the remaining amount to buy this phone");
        }


    }
}



class Phone {
    String name;
    int varient;
    double price;
    String status;


    public Phone(String name, String status, int varient, double price){
        this.name = name;
        this.status =status;
        this.varient = varient;
        this.price = price;
    }
    public String getName(){return this.name;}

    public double getPrice() {return price;}

    public void showMobile() {
        System.out.println("Phone :-" + name + " " + "Status:-" + status + " " + "Varient:-" + varient + " " + "Price:-" + price);
    }






}

