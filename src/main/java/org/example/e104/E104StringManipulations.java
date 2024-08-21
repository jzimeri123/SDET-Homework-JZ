package org.example.e104;

import java.sql.SQLOutput;
import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String[] names= new String[5];

        System.out.println("Print 5 names");

        for (int i = 0; i < 5; i++) {
            names[i]= input.next(String.valueOf(i));

        }
        System.out.println(names);






    }
}


