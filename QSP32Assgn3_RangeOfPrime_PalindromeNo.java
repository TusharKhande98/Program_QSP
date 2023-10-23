import java.util.Scanner;

class QSP32Assgn3_RangeOfPrime_PalindromeNo
{
    public static boolean checkPalindrome(int num)
    {
        int rev  = 0, org = num;
        while (num>0)
        {
           int rem = num%10;
           rev = rev * 10 + rem;
            num/=10;
        }
        if (org==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static boolean checkPrime(int num)
    {
        if (num == 1  ||  num == 0)
        {
            return false;
        }
        else
        {
            for (int i=2; i<num; i++)
            {
                if (num%i==0)
                {
                    return false;
                }
            }
            return true;
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
            if (checkPalindrome(i))
            {
                if (checkPrime(i))
                {
                    System.out.print(i + " ");
                }
            }
        }
    }

}
