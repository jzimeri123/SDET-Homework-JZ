package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("In:");
        String word= input.nextLine();
        String onlyVowels="";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                onlyVowels=onlyVowels+word.charAt(i);
            }

        }
        System.out.println(onlyVowels);


    }
}
