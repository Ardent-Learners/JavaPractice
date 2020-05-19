package com.homelearning;

public class SwitchCalci {
    public int operation(int a, int b, String operator){
        switch(operator){
            case "+" : return a + b;
            case  "-" : return a - b;
            case "/" : return a / b;
            case "*" : return a * b;
        }
     return 0;
    }

    public static  void main(String[] args){
        SwitchCalci switchCalci = new SwitchCalci();
        int o = switchCalci.operation(8,2,"+");
        System.out.println(o);
    }
}
