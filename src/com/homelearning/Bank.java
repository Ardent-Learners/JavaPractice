package com.homelearning;

    public class Bank {

        String name;
        String emailid;
        String phone;
        String address;
        String accountType;
        long miniBalance;
        long currentBalance;


        public Bank(String name, String emailid, String phone, String address, String accountType, long miniBalance)
        {
            this.name = name;
            this.emailid = emailid;
            this.phone = phone;
            this.address = address;
            this.accountType = accountType;
            this.miniBalance = miniBalance;
            this.currentBalance = this.miniBalance;

        }

        // where are you printing the current balance?
        long currentBalance(){
            return this.currentBalance;
        }


        // Change the logic for deposit amount, if a person is depositing any amount then current balance should be updated
        void  depositAmount(long depositAmount) {
            this.currentBalance = this.currentBalance + depositAmount;
        }

        // Change the logic here. if a person is widthrawing any amount the  current balance should be updated
        void WithdrawlAmount( long withdrawlAmount)
        {
            this.currentBalance = this.currentBalance - withdrawlAmount;
        }


        void printData(){

            System.out.println("****** Welcome to SBI Bank ******");  // Wrong sout/message
            System.out.println("\n");
            System.out.println("name:" + name + "\nemailid:" + emailid + "\nphone:"
                    + phone + "\naddress:" + address + "\naccountType:" + accountType + "\ncurrent Balance:=" + currentBalance );

            System.out.println( "\n Your account is successfully created");
        }


        public static void main(String[] args){
            Bank sbi = new Bank("Hamid", "hamid460@ymail.com", "9766912252", "pwc", "saving", 2000);
            sbi.printData();
            sbi.depositAmount(1000);
            sbi.printData();

            sbi.WithdrawlAmount(500);
            sbi.printData();


            System.out.println("The final current balance in my account is: " + sbi.currentBalance());
        }
    }


