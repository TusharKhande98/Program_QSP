import java.util.Scanner;
class QSP4Assgn_RangeCount_Codes {
    public static void main(String[] args) {

    // 1. Count of Digits in a number
        System.out.println("1. Count of digits in a number");
        Scanner s = new Scanner(System.in);
        System.out.print("\tEnter a number:- ");
        int num1 = s.nextInt();
        int count1 = 0;
        while (num1!=0)
        {
            num1 = num1/10;
            count1++;
        }
        System.out.println("\tTotal count of number is:- " + count1);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-");

    // 2. Range of Leap year using for loop
        System.out.println("2. Range of Leap year");
        System.out.print("\tEnter start year:- ");
        int start1 = s.nextInt();
        System.out.print("\tEnter end year:- ");
        int end1 = s.nextInt();
        System.out.println("\tLeap year are as below between this range:- ");
        for (int a1 = start1; a1<=end1; a1++)
        {
            if ((a1%4==0 && a1%100!=0) || (a1 % 400 == 0))
            {
                System.out.print(" " + a1);
            }
        }
        System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-");


    // 3. Even leap year between a range
        System.out.println("3. Even leap year between a range");
        System.out.print("\tEnter start year:- ");
        int start2 = s.nextInt();
        System.out.print("\tEnter end year:- ");
        int end2 = s.nextInt();
        for (int a2 = start2; a2<=end2; a2++)
        {
            // only 1 extra condition we need to apply here
            if (a2 % 4 == 0 && (a2 % 100 != 0 || a2 % 400 == 0))
            {
                System.out.println("\tEven leap year between this range is:- "+ a2);
            }
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-");


    // 4. Count of Even-Odd leap year between a range
        System.out.println("4. Count of Even-Odd leap year between a range");
        System.out.print("\tEnter start year:- ");
        int stYear = s.nextInt();
        System.out.print("\tEnter end year:- ");
        int edYear = s.nextInt();

        int evLeap = 0, odLeap = 0;
        for (int year = stYear; year<=edYear; year++)
        {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            {
                if (year%2==0)
                {
                    evLeap++;
                }
                else
                {
                    odLeap++;
                }
            }
        }
        System.out.println("\tCount of Even years is:- " + evLeap);
        System.out.println("\tCount of Odd years is:- " + odLeap);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-");
    }
}
