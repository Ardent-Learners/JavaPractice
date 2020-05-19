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
            int[] array = {12,13,14,15,13,18,19};
            String[] s = {"java","C","python","scala","python"};
            CalculatorApp calculatorApp = new CalculatorApp(5,4);

            System.out.println(calculatorApp.sum());
            System.out.println(calculatorApp.sub());
            System.out.println(calculatorApp.mul());
            System.out.println(calculatorApp.div());

            // For Integer
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = i + 1; j < array.length - 1; j++) {
                        if ((array[i] == array[j]) && (i != j)) {
                            System.out.println(array[j] + "");
                        }
                    }
                }

            // For String
                for (int i = 0; i<s.length-1; i++)
                {
                    for (int j = 0; j<s.length; j++)
                    {
                        if (s[i].equals(s[j]) && (i!=j))
                        {
                            System.out.println(s[j] + "");
                        }
                    }
                }
            }

        }





