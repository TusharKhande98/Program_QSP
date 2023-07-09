import java.util.Scanner;
class QSP6_Factorial {
    public static void main(String[] args) {

    // 1. factorial using While loop
        System.out.println("\n1. factorial using While loop");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number to get its factorial:- ");
        int actNum1 = s.nextInt();
        int num1 = actNum1;

        int fact1 = 1;
        while (num1>0)
        {
            fact1 = fact1 * num1;
            num1--;
        }
        System.out.println("factorial of " + actNum1 +" is---> "  + fact1);


    // 2. factorial using Do-While loop
        System.out.println("\n2. factorial using Do-While loop");
        System.out.print("Enter a number to get its factorial:- ");
        int actNum = s.nextInt();
        int num = actNum;

        int fact = 1;
        do
        {
            fact = fact * num;
            num--;
        }
        while (num>0);
        System.out.println("factorial of " + actNum +" is---> "  + fact);


    // 3. factorial using For loop
        System.out.println("\n3. factorial using For loop");
        System.out.print("Enter a number to get its factorial:- ");
        int actNum3 = s.nextInt();
        int num3 = actNum3;

        int fact3 = 1;
        for (int i=num3; i>0; i--)
        {
            fact3 = fact3 * i;

        }
        System.out.println("factorial of " + actNum3 +" is---> "  + fact3);
    }
}
