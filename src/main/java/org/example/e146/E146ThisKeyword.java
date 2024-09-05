package org.example.e146;

public class E146ThisKeyword {

    public static void main(String[] args) {

    }
}

class Employee{
    private String name;
    private String lastName;
    private int employeeId;
    private String startDate;
    private int salary;

    public Employee(){
        this.name=null;
        this.lastName=null;
        this.employeeId=0;
        this.startDate=null;
        this.salary=0;
        }

        public Employee(String name, String lastName, int employeeId, String startDate,int salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
        }

        public void printDetails(){
            System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
        }

    }



