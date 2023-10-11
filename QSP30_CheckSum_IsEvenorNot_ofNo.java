import java.util.Scanner;
class QSP30_CheckSum_IsEvenorNot_ofNo
{
    public static int sumOfDigits(int num)
    {
        int sum = 0;
        while (num!=0)
        {
            sum+= num%10;
            num/=10;
        }
        return sum;
    }

    public static boolean checkEvenOdd(int num)
    {
        if (num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no:- ");
        int ip = s.nextInt();
        int sum = sumOfDigits(ip);
        boolean ans = checkEvenOdd(sum);

        if (ans)
        {
            System.out.println("Sum of digit is even");
        }
        else
        {
            System.out.println("Sum of digit is odd");
        }
    }
}