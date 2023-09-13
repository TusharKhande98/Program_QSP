import java.util.Scanner;
class QSP24_Fibonacci_RangeOfFibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 1. Fibonacci series
        System.out.println("1. Fibonacci series");
        System.out.print("\tEnter the number of fibonacci value:- ");
        int ip = s.nextInt();
        int count=0;
        int n1=0, n2=1, n3;
        while (count<ip)
        {
            n3 = n1+n2;
            System.out.print("\t"+n1 + " ");
            n1=n2;
            n2=n3;
            count++;
        }
        System.out.println();


   // 2. Check no. is fibonacci or not
        System.out.println("2. Check no. is fibonacci or not");
        System.out.print("\tEnter a number:- ");
        int ip1 = s.nextInt();
        int no1=0, no2=1, no3;
        while (true)
        {
            no3 = no1+no2;
            if (no1 == ip1)
            {
                System.out.println("\t" + no1 + " is a fibonacci number.");
                break;
            }
            else if(no1>ip1)
            {
                System.out.println("\tNot a fibonacci number.");
                break;
            }
            no1=no2;
            no2=no3;
        }
        System.out.println();


    // 3. Range of Fibonacci series:- it will print fibo. nos between inputted range.
        System.out.println("3. Fibonacci series between range");
        System.out.print("\tEnter the start number:- ");
        int start = s.nextInt();
        System.out.print("\tEnter the end number:- ");
        int end = s.nextInt();
        int num1=0, num2=1, num3;
        while (start<=end)
        {
            while (true)
            {
                num3 = num1 + num2;
                if (num1 == start)
                {
                    System.out.print("\t"+num1 + " ");
                    break;
                }
                else if(num1>start)
                {
                    break;
                }
                num1 = num2;
                num2 = num3;
            }
            start++;
        }
    }
}
