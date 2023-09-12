import java.util.Scanner;
class QSP23Assgn_CoprimeNeonSpyDuckBuzzNo {
    public static void main(String[] args) {

    // 1. Co-Prime number
        System.out.println("1. Co-Prime number");
        Scanner s = new Scanner(System.in);
        System.out.print("\tEnter first no:- ");
        int no1 = s.nextInt();
        System.out.print("\tEnter second no:- ");
        int no2 = s.nextInt();

        int hcf = no1<no2 ? no1:no2;
        for ( ; ;)  // reason unknown--> why its blank?
        {
            if (no1%hcf==0 && no2%hcf==0)
            {
                break;
            }
            hcf--;
        }
        if (hcf==1)
        {
            System.out.println("\t" + no1 + " & " + no2 + " are co-prime number");
        }
        else
        {
            System.out.println("\tNot a co-prime number");
        }
        System.out.println();

    // 2. Number is neon or not ---> [square of 9 = 81  &  8+1 = 9]
        System.out.println("2. Number is neon or not");
        System.out.print("\tEnter a no:- ");
        int num1 = s.nextInt();
        int sqr = num1*num1, sum = 0;
        while (sqr!=0)
        {
            int rem = sqr%10;
            sum += rem;
            sqr /= 10;
        }
        if (sum == num1)
        {
            System.out.println("\t" + num1 + " is the neon number");
        }
        else
        {
            System.out.println("\tNot a neon number");
        }
        System.out.println();

    // 3. Number is spy or not ---> [1+1+2+4 = 8  &  1x1x2x4 = 8]
        System.out.println("3. Number is spy or not");
        System.out.print("\tEnter a no:- ");
        int num3 = s.nextInt();
        int sum3 = 0, prod3 = 1, temp3 = num3;
        while (temp3!=0)
        {
            int rem3 = temp3%10;
            sum3 += rem3;
            prod3 *=rem3;
            temp3 /= 10;
        }
        if (sum3 == prod3)
        {
            System.out.println("\t" + num3 + " is a spy number");
        }
        else
        {
            System.out.println("\tNot a spy number");
        }
        System.out.println();

    // 4. Number is buzz or not ---> [no which ends with 7 or divisible by 7 only]
        System.out.println("4. Number is buzz or not");
        System.out.print("\tEnter a no:- ");
        int num4 = s.nextInt();
        int temp4 = num4;
        if (temp4 % 10 == 3  ||  temp4 % 7 == 0)
        {
            System.out.println("\t" + num4 + " is a buzz number");
        }
        else
        {
            System.out.println("\tNot a buzz number");
        }
        System.out.println();

        // CHECK BELOW CODE PROPERLY AGAIN

    // 5. Number is duck or not ---> [no. containing '0' except at starting position]
        System.out.println("5. Number is duck or not");
        System.out.print("\tEnter a no. without a zero in the beginning:- ");
        int num5 = s.nextInt();
        int temp = num5;
        while (num5!=0)
        {
            int rem5 = num5%10;
            if (rem5 == 0)
            {
                System.out.println("\t" + temp + " is a duck number");
                break;
            }
            num5 /= 10;
        }
        if (num5==0)
        {
            System.out.println("\tNot a duck number");
        }
    }
}

