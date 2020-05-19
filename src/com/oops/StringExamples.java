package com.oops;

public class StringExamples {
    public static void main(String[] args){

        String name = new String("Java");

        CustomisedString customisedString = new CustomisedString("Java");
        customisedString.length();
        int index = customisedString.indexOf('a');
        int value = 10;

        Integer value1 = new Integer(10);
        name.length();
        int index1 = name.indexOf('a');
      name.startsWith("H");
        /*  String s = "Hamid";
        System.out.println(s.equalsIgnoreCase("HAMID"));
        System.out.println(s.equals("HamId"));
        System.out.println(s.charAt(3));
        System.out.println(s.compareTo("HAMID"));
        System.out.println(s.compareToIgnoreCase("HAMID"));
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("H"));
        System.out.println(s.charAt(2));
        System.out.println(s.startsWith("H"));
        System.out.println(s.substring(3));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.replaceAll("a","A"));
*/
        int year = 2020, month = 05, day = 04;
        int hour = 05, minute = 47, second = 10;
        String dateStr  = new StringBuilder()
                .append(year).append("-").append(month).append("-").append(day)
                .append("\n").append(hour).append("-").append(minute).append("-").append(second).toString();
        System.out.println(dateStr);
    }
}
