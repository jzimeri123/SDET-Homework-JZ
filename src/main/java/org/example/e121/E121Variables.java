package org.example.e121;

public class E121Variables {
    int i;
    double d;
    char c;


    // Declare 3 instance variables: integer, double, and char

    public static void main(String[] args) {
        E121Variables n1=new E121Variables();
        n1.i=10;
        n1.d=10.23;
        n1.c='a';

        System.out.println(n1.i);
        System.out.println(n1.d);
        System.out.println(n1.c);


        E121Variables n2=new E121Variables();
        n2.i=100;
        n2.d=100.23;
        n2.c='s';

        System.out.println(n2.i);
        System.out.println(n2.d);
        System.out.println(n2.c);

        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance
    }
}
