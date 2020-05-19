package com.homelearning;

import java.time.LocalDate;

public class CarValuation {


    private double getSalePrice(String makeAndModel, int yearOfManufactured, double drivenKms,
                             int hasAirbags, boolean hasEbd, boolean hasAbs, boolean hasSunroof, boolean hasRearCamera,
                             boolean hasAutoAc, boolean hasAccidentalRecord){


        System.out.println("***** Welcome to Car Dekho *****");
        System.out.println("\n");
        System.out.println("***** Finding Your Right Car value *****");

        double salePrice = getPrice(makeAndModel, yearOfManufactured);

        int currentYear = LocalDate.now().getYear();
        int ageOfCar = currentYear - yearOfManufactured + 1 ;

        System.out.println("Calculating age of your Car:");
        System.out.println("Age of car:" + ageOfCar);


        if(ageOfCar<=5){
            salePrice = salePrice - (ageOfCar * 0.05);
        }else {
            return salePrice * (ageOfCar * 0.05);
        }

        System.out.println("\nsalePrice after depreciation: " + salePrice);

        System.out.println("\n\ncalculating car value after looking kms driven");

        if(drivenKms<5000){
            salePrice = salePrice - 20000.0;
        }else{
            salePrice = salePrice - 55000.0;
        }

        System.out.println("\nsalePrice of car after " + drivenKms + " KMS driven is: " + salePrice);
        System.out.println("\n\nchecking advance features of car");

        if((hasAirbags >=2 && hasEbd && hasAbs)){

        } else {
            salePrice = salePrice - 50000.0;
        }


        System.out.println("\nafter checking airbags, abs, ebd in car value of your car is: " + salePrice);

        System.out.println("looking for luxury features");

        if(hasAutoAc && (hasRearCamera || hasSunroof)){
            salePrice = salePrice + 5500.0;
        }
        System.out.println("salePrice after accounting for luxury features: " + salePrice);


        System.out.println("checking accidental history of car");
        if(hasAccidentalRecord){
            salePrice = salePrice - 95000.0;
        }
        System.out.println("salePrice after accounting for accidentalHistory: " + salePrice);


        return salePrice;
    }

    private double getPrice(String makeAndModel, int yearOfManufactured) {
        if (makeAndModel.equalsIgnoreCase("BMW M8 grand Coupe")) {
            return 998000.0;
        } else if (makeAndModel.equalsIgnoreCase("Audi R8")) {
            return 850000.0;
        } else if (makeAndModel.equalsIgnoreCase(" Mercedes Maybach")) {
            return 914000.0;
        }
        return 0.0;

    }

    public static void main(String[] args){
        CarValuation carValuation = new CarValuation();

        double salePrice = carValuation.getSalePrice("BMW M8 grand Coupe",2018,100,6,
                true, true, true, true, true, true);

        System.out.println("Final Sale Price of your car is: " + salePrice);



    }

}


