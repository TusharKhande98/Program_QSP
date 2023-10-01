// it cuts the decimal values
import java.util.Scanner;
class QSP28_DecimalCutter
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value:- ");
        double ip = s.nextDouble();

        cutDecimal(ip, 2);
    }

    public static void cutDecimal(double num, int count)
    {
        double x = 1;
        for (int i=0; i<count; i++)
        {
            x = x*10;
        }
        int temp = (int) (num * x);
        System.out.println(temp/x);
    }
}