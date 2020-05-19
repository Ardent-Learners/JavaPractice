package com.homelearning;


public class ReportCard {

    String name;
    int standard;
    char division;
    int rollNo;
    Subject[] subject;
    double marks;
    float percentage;
    char grades;


    public ReportCard(String name, int standard, char division, int rollNo, Subject[] subject,
                      double marks, float percentage, char grades){
        this.name = name;
        this.standard = standard;
        this.division = division;
        this.rollNo = rollNo;
        this.subject= subject;
        this.marks = marks;
        this.percentage = percentage;
        this.grades = grades;

    }

    void totalMarks(Subject[] subject){
    }

    void printPercentage()
    {
        // return this.percentage;
    }

    void setSubject(int marks, String name){
        /*Subject english = new Subject(88,"English");
        Subject hindi = new Subject(92, "Hindi");
        Subject maths = new Subject(81,"Maths");
        Subject science = new Subject(83, "Science");
        Subject fineArts = new Subject(99,"FineArts");
        subject[0]= english;
        subject[1]= hindi;
        subject[2]= maths;
        subject[3]= science;
        subject[4]= fineArts;*/


    }



    public static void main(String[] args){

        /*Subject english = new Subject(88,"English");
        Subject hindi = new Subject(92, "Hindi");
        Subject maths = new Subject(81,"Maths");
        Subject science = new Subject(83, "Science");
        Subject fineArts = new Subject(99,"FineArts");
        Subject[] subjects = {english,hindi,maths,science,fineArts}

        ReportCard reportCard = new ReportCard("Hamid",12,'A',
                33, new Subject[](english,hindi,maths,science,fineArts));


        if (percentage>=90 && percentage<=99){
            System.out.println("Outstanding: A+ ");
        }
        if (percentage>=80 && percentage<=89){
            System.out.println("Excellent: A ");
        }
        if (percentage>=70 && percentage<=79){
            System.out.println("Very Good: B+ ");
        }
        if (percentage>=60 && percentage<=69){
            System.out.println("Pass: C ");
        }
        if (percentage<=59){
            System.out.println("Need Improvemenr: ");
        }*/


    }




}
