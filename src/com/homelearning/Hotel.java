package com.homelearning;

public class Hotel {

    String name;
    String email;
    String phone;
    String gender;
    String address;
    long currentBill;
    int x;

    public Hotel( String name, String email, String phone, String gender, String address, long roomRent){
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
        this.currentBill = roomRent;
    }

    void hotelService(long amount){
        this.currentBill = this.currentBill + amount;
    }

    void checkOut(int x){
        this.currentBill =  this.currentBill - x;
        System.out.println("Your current bill is now: " + currentBill());
        System.out.println("**** Thanks for visiting ****");
    }


    long currentBill()
    {
        return this.currentBill;
    }

    void printData(){
        System.out.println("***** Welcome to Oberoi Hotel *****");
        System.out.println("Name:" + name + "\nemail:" + email + "\nphone:" + phone +
                "\ngender:" + gender + "\naddress:" + address + "\ncurrentbill:" + currentBill);

    }

    public static void main(String[] args) {
        Hotel oberoi = new Hotel("Hamid", "hamid460@gmail.com", "9766912242",
                "male", "pwc", 3000);
        oberoi.printData();
        oberoi.currentBill();
        oberoi.hotelService(700);
        oberoi.printData();
        System.out.println("***** Now Proceed to Check-out *****");
        oberoi.checkOut(3700);

    }

}
