package com.oops;

public class CustomisedString {

    public char value[];
    public int index;

    public CustomisedString(String original) {
        // assign value to char value[]
    }

    public int length() {
      return value.length;

    }

     int indexOf(char character) {
        if (value.length > 0) {
            for(int i = 0; i <= value.length; i++) {
                if (value[i] == character) {
                    return i;
                }
            }
            return -1;
        }
    return 0;
    }

    boolean startsWith(char character){
        if(value.length>0){
                value[0]=character;
                return true;
            }
        return false;
    }

    int charAt(int index){
        {    char character = 'c';
            value[index]==character;
            return character;
        }
        return -1;
    }



}
