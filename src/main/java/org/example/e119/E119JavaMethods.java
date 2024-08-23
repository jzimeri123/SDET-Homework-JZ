package org.example.e119;

public class E119JavaMethods {


   public static String sensorLetter(String a, char b){
       String changed="";
       changed=a.replace(b,'*');
       return changed;

   }

    public static void main(String[] args) {
        // Students will write the code here.
        System.out.println(sensorLetter("trick or treat",'t'));

    }

}
