import java.util.Scanner;

class QSP32Assgn2_RangeOfPalindromeNo
{
    public static boolean palindromeNo(int num)
    {
        int rev  = 0, temp = num;
        while (temp>0)
        {
            rev = rev*10 +(temp%10);
            temp/=10;
        }
        if (num==rev)
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
        System.out.print("Enter start no:- ");
        int start = s.nextInt();
        System.out.print("Enter end no:- ");
        int end  = s.nextInt();

        for (int i=start; i<=end; i++)
        {
            if (palindromeNo(i))
            {
                System.out.print(i + " ");
            }
        }
    }
}
