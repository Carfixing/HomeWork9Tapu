package q1calculate;

import java.util.Scanner;

public class Q1Main extends Q1Calculator {

    //main method
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        Q1Calculator obj = new Q1Calculator();


        while(true){
        System.out.println("Please enter the 1st number : ");
        int a = scr.nextInt();

        System.out.println("Please enter the 2nd number : ");
        int b = scr.nextInt();

        System.out.println("Please enter the symbol(+,-,*,/) : ");
        char ch = scr.next().charAt(0);

        obj.calculateResult(a,b,ch);

            System.out.print("Would you like do more calculation ? please enter 'Y' or 'N'  : ");
            char verification = scr.next().charAt(0);
            if (verification =='N' || verification =='n') {
                break;
            }
        }
    }
}

