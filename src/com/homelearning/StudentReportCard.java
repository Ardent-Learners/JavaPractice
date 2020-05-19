package com.homelearning;

public class StudentReportCard {

    String name;
    int rollNo;
    int standard;
    double[] marks;
    double percentage;
    char grade;
    Subject[] subject;
    String result;


    public StudentReportCard(String name, int rollNo, int standard, Subject[] subjects) {
        this.name = name;
        this.rollNo = rollNo;
        this.standard = standard;
        subject = subjects;
        this.percentage = 0.0;
        this.grade = '_';
        this.result = null;

    }

    void updateMarks(double[] marks) {
        if (this.subject.length == marks.length) {
            this.marks = marks;
        } else {
            System.out.println("Subject are not equal to Marks");
        }

    }

    void calculatePercentage() {
        System.out.println("***** Calculating the Percentage *****");
        double sum = 0.0;

        for(double mark : marks) { // forEach loop
            sum = sum + mark;
        }

        this.percentage = sum/ marks.length;
    }

    void calculateGrade() {
        System.out.println("***** Calculating the Grade *****");
        if (percentage > 90.0 && percentage <= 100.0) {
            this.grade = 'O';
        } else if (percentage > 80.0 && percentage <= 90.0) {
            this.grade = 'A';
        } else if (percentage > 70.0 && percentage <= 80.0) {
            this.grade = 'B';
        } else if (percentage > 60.0 && percentage <= 70.0) {
            this.grade = 'C';
        } else {
            this.grade = 'F';
        }
    }

    void calculateResult() {
        System.out.println("***** Final Result has been decided *****");
        if (grade == 'F') {
            result = "FAIL";
        } else {
            result = "PASS";
        }
    }

    void printReportCard() {
        System.out.println("Name: " + name + " Roll No. " + rollNo + " Class: " + standard + " Percentage: " + percentage
        + " Grade: " + grade + " Final Result: " + result);
    }


    public static void main(String[] args) {
        Subject english = new Subject("English");
        Subject hindi = new Subject("Hindi");
        Subject math = new Subject("Math");
        Subject science = new Subject("Science");
        Subject sst = new Subject("SST");

        System.out.println("**** Creating a Report Card *****");

        StudentReportCard hamid = new StudentReportCard("Hamid", 1, 10,
                new Subject[] {english, hindi, math, science, sst});

        System.out.println("***** Report has been created *****");

        System.out.println("***** Final exams have been conducted *****");
        System.out.println("***** Updating the marks in the Report Card *****");
        hamid.updateMarks(new double[] {70, 88, 98,96, 81});
        System.out.println("***** Marks are updated now in the Report Card *****");

        hamid.calculatePercentage();
        hamid.calculateGrade();
        hamid.calculateResult();

        System.out.println("***** Displaying the Report Card *****");
        hamid.printReportCard();

    }



}
