package org.example.e131;

public class E131StaticKeyword {

    public static String thirdLetter(String s){
        String newString="";
        for (int i = 0; i < s.length(); i=i+3) {
            newString=newString+s.charAt(i);
        }
        return newString;
    }


    public static void main(String[] args) {
        E131StaticKeyword.thirdLetter("hello there");

    }
}
