package com.homelearning;

public class TestingPassVariable {

    int age;

    void updateId(int age){
        age = 40;
    }

    void update (TestingPassVariable t ){
        t.age = 50;
    }

    public  static  void main(String[] args){
        TestingPassVariable tp = new TestingPassVariable();
        tp.age = 25;
        int id = 25;
        tp.updateId(id);
        System.out.println(id);

        tp.update(tp);
        System.out.println(tp.age);
    }

}
