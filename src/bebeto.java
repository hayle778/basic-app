
/*
1. prompt a user
2.add the user no an input to check the program
3.Create the body of the method
4.add 5 from  the user no
5.Then subtract 7 from the user no that we got
6.print out the result
*/

import java.util.Scanner;

public class bebeto {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner( System.in );
        System.out.println( "enter a number: " );
        int userno = keyboard.nextInt(); // introducing the method body with loop
           int M = userno;      // any positive integer
          int N = userno+5;
          int O = (userno+5)*2;
          int P = ((userno+5)*2)-7;


           // print all the body of the method
         System.out.println("="+userno);

         System.out.println("=" + (userno + 5) );
        int MN =keyboard.nextInt();
         System.out.print("="+(userno+5)*2);
          int MNO =keyboard.nextInt();
         System.out.println ("=" + ((userno+5)*2-7));
         int MNOP = keyboard.nextInt();
    }

}