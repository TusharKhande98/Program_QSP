import java.util.Scanner;
class QSP3_PalindromeNo_Scanner_ForWhileLoop {
    public static void main(String[] args) {

    // 1. Palindrome with For loop
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num1 = s1.nextInt();
        int rev1 = 0;
        for (int a = num1; a>0; a/=10)
        {
            int rem1= a%10;
            rev1 = (rev1*10) + rem1;
        }
        if (num1==rev1)
        {
            System.out.println("Its a palindrome number");
        }
        else
        {
            System.out.println("Not a palindrome no.");
        }
        System.out.println(" ");

    // 2. Palindrome with While loop
        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num2 = s2.nextInt();
        int actNum = num2;
        int rev2 = 0;

        while(num2>0)
        {
            int rem2= num2%10;
            rev2 = (rev2*10) + rem2;
            num2/=10;
        }
        if (num2==actNum)

        {
            System.out.println("Its a palindrome number");
        }
        else
        {
            System.out.println("Not a palindrome no.");
        }
    }
}
