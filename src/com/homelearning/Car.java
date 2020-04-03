package com.homelearning;

public class Car {

    String modelName;
    long price;
    String carType;
    String color;

    public Car(){

    }

    public Car(String modelName, long price) {
        this.modelName = modelName;
        this.price = price;
    }

    public void printCar() {
        System.out.println("Model Name: " + modelName + " Price: " + price + " Car Type: " + carType + " Color: " + color);
    }

    public void setCarValue(String carType, String color) {
        this.carType = carType;
        this.color = color;

    }


    public static void main(String[] args) {
        Car bmw = new Car("BMW", 4000000);
        bmw.setCarValue("Sedan", "Red");

        bmw.printCar();
        System.out.println("\n");
        Car audi = new Car("AUDI", 5000000);
        audi.setCarValue("Hatchpack", "Silver ");

        audi.printCar();
    }

}
