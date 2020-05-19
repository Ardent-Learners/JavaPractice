package com.homelearning;


public class TernaryExample {


    public void checkingService(Service1 name){

        switch(name.getName()){
            case "Screen":
                System.out.println("screen repairing cost 2499");break;
            case "Battery":
                System.out.println("Battery repairing cost is 1699");
            case "Mic":
                System.out.println("Mic repairing cost is 699");
            case "ChargingPort":
                System.out.println("Charging port repairing cost is 699");
        }



    }

    public static void main(String[] args){

        TernaryExample ternaryExample = new TernaryExample();
        Service1 Screen = new Service1("Screen");
        Service1 Battery = new Service1("Battery");
        Service1 Mic = new Service1("Mic");
        Service1 ChargingPort = new Service1("ChargingPort");

        Service1[] typeOfService = new Service1[]{Screen, Battery, Mic, ChargingPort};

        ternaryExample.checkingService(Screen);

   /*      int x= 2;
         switch(x++){
             case 1 :
                 System.out.println("value is 1");break;
             case 2:
                 System.out.println("value is 2");
             case 3:
                 System.out.println("value is 3");
             case 4:
                 System.out.println("value is 4");break;

                 default:
                     System.out.println("error found" );
         }*/



     }

}

 class Service1{
    String typeOfService;
    public Service1(String typeOfService){
        this.typeOfService = typeOfService;
    }
    public String getName(){return this.typeOfService;}

}