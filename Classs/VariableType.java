public class VariableType {
    public static void main(String[] args){
   int myNumber = 45;
    myNumber = 40 ;
    System.out.println(myNumber);
    final int number1 = 739;
    System.out.println(number1);
        int a =10 , b= 50 , c = 100;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a + b + c);

        byte value = 1;
        System.out.println(value);

        int num1 , num2 , num3 ;
        num1 = 10;
        System.out.print(num1);
        //This is comment line 
        /*This is multi line comment ........
         import  java.util.ArrayList;
         import java.util.lang.*;
         import java.io;

        */

        int ticket = 1000;
        System.out.println("The ticket Prise is : " + ticket);

         char words1= '$';
         char word1= 'P';

        System.out.println("This is a First Word: " + words1 + "\n "+"This is a second Word: " + word1);
        /*Escape Sequences 
         * \n- NEW line 
         * \t - tab 
         * \"" - double quote
         * \'' =single qoute
         * \\ = single slash
         * \b - backSlash
         * \r -return text at the point
         * \f - return feed at a point
        */
        String s;
        System.out.println("Hello\n World!");
        System.out.println("Hello\t World!");
        System.out.println("Hello\" World!\"");
        System.out.println("Hello \'World!\'");
        System.out.println("Hello \\World!\\");
        System.out.println("Hello \bWorld!\b");
        System.out.println("Hello World!\rhiiii");
        System.out.println("Hello \fWorld!");


        System.out.println("Hello java");


        float nums = 5.89f;
       
        System.out.println((int)nums);
    }
}
