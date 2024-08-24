package org.example.e122;

public class E122Variables {
    String countryName;
    String capital;
    int populationSize;

    // Declare 3 instance variables: name of the countryName, capital, and populationSize

    // Create a method to display values of instance variables

    public static void main(String[] args) {
        E122Variables s=new E122Variables();
        s.countryName="USA";
        s.capital="Washington DC";
        s.populationSize=330000000;

        System.out.println("The capital of "+s.countryName+" is "+s.capital+" and population is "+s.populationSize);


        //The capital of USA is Washington DC and population is 330000000

        E122Variables n=new E122Variables();
        n.countryName="Kazakhstan";
        n.capital="Astana";
        n.populationSize=18500000;

        System.out.println("The capital of "+n.countryName+" is "+n.capital+" and population is "+n.populationSize);
//The capital of Kazakhstan is Astana and population is 18500000





        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Execute the method to display values for the first instance
        // Assign values to variables for the second instance
        // Execute the method to display values for the second instance
    }
}
