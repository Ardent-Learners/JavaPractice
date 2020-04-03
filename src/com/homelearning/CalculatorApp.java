package com.homelearning;

public class CalculatorApp {

        int value1;
        int value2;

        public CalculatorApp(int a, int b) {
            value1 = a;
            value2 = b;
        }


        public int sum() {
            return value1 + value2;
        }

        public int sub() {
            return value1 - value2;
        }

        public int mul() {
            return value1 * value2;
        }

        public int div() {
            return value1/value2;
        }

        public static void main(String[] args) {
            CalculatorApp calculatorApp = new CalculatorApp(5,4);

            System.out.println(calculatorApp.sum());
            System.out.println(calculatorApp.sub());
            System.out.println(calculatorApp.mul());
            System.out.println(calculatorApp.div());
        }

    }



