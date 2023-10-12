import java.util.Scanner;
class QSP31_CountOfPrimeDigit_FromNo
{
    public static boolean checkPrime (int num)
    {
        if (num==1) // if we don't want to consider 1 as prime so put this block, otherwise remove it..
        {
            return false;
        }
        else
        {
            if (num==2)  // new change start
            {
                return  false;
            }  // new change end
            for (int i=2; i<num; i++)  // if num=2, so i<num->2<2-> which become false. So instead of giving false it become true & count will increase.
            {
                if (num%i==0)
                {
                    return false;
                }
            }
            return true;
        }
    }

    public static int countPrimeDigit(int num)
    {
        int count = 0;
        while (num!=0)
        {
            int rem = num%10;
            boolean ans = checkPrime(rem);
            if (ans)
            {
                count++;
            }
            num/=10;
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no:- ");
        int ip = s.nextInt();
        System.out.println(countPrimeDigit(ip));
    }
}