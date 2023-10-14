import java.util.Scanner;
class QSP32_MethodToPrint_EvenNo
{
    public static boolean checkEven(int num)
    {
        if (num%2==0)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter start value:- ");
        int start = s.nextInt();
        System.out.print("Enter end value:- ");
        int end = s.nextInt();

        for (int i=start; i<=end; i++)
        {
            if (checkEven(i))
            {
                System.out.println(i);
            }
        }
    }
}