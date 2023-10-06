// some errors in output solve it later

import java.util.Scanner;
class QSP28Assgn2_LengthConverter
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length in centi-meters:- ");
        double len = s.nextDouble();
        centimeterToMeter(len);
    }

    public static void centimeterToMeter(double length)
    {
        double meter = length/100.0;
        System.out.println("\tLength in meter:-  " + meter);
        meterToKilometer(length);
    }

    public static void meterToKilometer(double length)
    {
        double kilometer = length/100000.0;
        System.out.println("\tLength in kilometer:-  " + kilometer);
        kilometerToInch(length);
    }

    public static void kilometerToInch(double length)
    {
        double inch = length*0.394;
        System.out.println("\tLength in inches:-  " + inch);

    }
}
