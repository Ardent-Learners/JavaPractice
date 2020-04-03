package com.homelearning;

public class Hiring {

    String name;
    String emailid;
    String phone;
    String pincode;
    String country;
    String state;
    String city;
    String jobexp;
    String qualification;
    String gender;
    String cgpa;
    String hobbies;
    String currentsalary;
    String expectedsalary;

    public Hiring(String name, String emailid, String phone, String pincode, String country,
                  String state, String city, String jobexp, String qualification, String gender,
                  String cgpa, String hobbies, String currentsalary, String expectedsalary){

        this.name = name;
        this.emailid = emailid;
        this.phone = phone;
        this.pincode = pincode;
        this.country = country;
        this.state = state;
        this.city = city;
        this.jobexp = jobexp;
        this.qualification = qualification;
        this.gender = gender;
        this.cgpa= cgpa;
        this.hobbies = hobbies;
        this.currentsalary = currentsalary;
        this.expectedsalary = expectedsalary;


    }

    public Hiring(String name, String emailid, String phone, String pincode, String country,
                  String state, String city, String qualification,String cgpa, String hobbies,
                  String expectedsalary){
        this.name = name;
        this.emailid = emailid;
        this.phone = phone;
        this.pincode = pincode;
        this.country = country;
        this.state = state;
        this.city = city;
        this.qualification = qualification;
        this.cgpa= cgpa;
        this.hobbies = hobbies;
        this.expectedsalary = expectedsalary;

    }


    void printData(){
        System.out.println("Name:"+name+ "\nemailid:"+emailid+"\nphone:"+phone+"\npincode:"+pincode
                +"\ncountry:"+country+"\nstate:"+state+"\ncity:"+city+"\njobexp:"+jobexp+"\nqualification:"
                +qualification+"\ngendre:"+gender+"\ncgpa:"+cgpa+"\nhobbies:"+hobbies+"\ncurrentsalary:"+currentsalary
                +"\nexpectedsalary:"+expectedsalary);

    }


    void setData(String gender,String hobbies, String currentsalary){
        this.gender = gender;
        this.hobbies = hobbies;
        this.currentsalary = currentsalary;

    }


    public static void main(String[] args){
        Hiring h = new Hiring("hamid","hamid460@gmail.com","9766912252","412105",
                "india","maharashtra","pune","btech in comp science",
                "8", "learning tech. and startups","12lakh");

        h.printData();
        h.setData("male", "sleeping", "50lakh");
        h.printData();

        System.out.println("\n\n");

        Hiring h1 = new Hiring("rohit", "ardent.me2@gmail.com", "9599902064", "412105", "india", "maharashtra",
                "pune", "10", "btech in comp science", "male", "8",
                "learning and exploring new tech", "12l", "30l");
        h1.printData();
    }

}

