import java.util.Scanner;

class QSP32Assgn1_RangeOfLeapYear
{
    public static boolean leapYear(int year)
    {
        if ((year%4==0 && year%100!=0) || year%400==0)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter start year:- ");
        int start = s.nextInt();
        System.out.print("Enter end year:- ");
        int end  = s.nextInt();

        for (int i = start; i<= end; i++)
        {
            if (leapYear(i))
            {
                System.out.println(i);
            }
        }
    }
}
