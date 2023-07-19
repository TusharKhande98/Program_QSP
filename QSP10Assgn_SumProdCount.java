import java.util.Scanner;
class QSP10Assgn_SumProdCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    // 1. Even & odd factors of a number
        System.out.println("1. Even and odd factors of a number");
        System.out.print("\tEnter a number:- ");
        int n1 = s.nextInt();
        int den1 = 1;
        while (den1<=n1)
        {
            if (n1%den1==0)
            {
                if (den1%2==0)
                {
                    System.out.println("\tEven factors of " + n1 + " is:- " + den1);
                }
                else
                {
                    System.out.println("\tOdd factors of " + n1 + " is:- " + den1);
                }
            }
            den1++;
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*");

    // 2. Sum of factors of a given number
        System.out.println("2. Sum of factors of a number");
        System.out.print("\tEnter a number:- ");
        int n2 = s.nextInt();
        int den2 = 1, sum2 = 0;
        while (den2<=n2)
        {
            if (n2%den2==0)
            {
                sum2 = sum2 + den2;
            }
            den2++;
        }
        System.out.println("\tSum of all factors is:- "+ sum2);
        System.out.println("*-*-*-*-*-*-*-*-*-*");


    // 3. Product of factors of a number
        System.out.println("3. Product of factors of a number");
        System.out.print("\tEnter a number to get its factor's product:- ");
        int n3 = s.nextInt();
        int den3 = 1, prod3 = 1;
        while (den3<=n3)
        {
            if (n3%den3==0)
            {
                prod3 = prod3 * den3;
            }
            den3++;
        }
        System.out.println("\tProduct of factors is:- "+ prod3);
        System.out.println("*-*-*-*-*-*-*-*-*-*");

    // 4. Sum of even & odd factors of a number
        System.out.println("4. Sum of even & odd factors of a number");
        System.out.print("\tEnter a number:- ");
        int n4 = s.nextInt();
        int den4 = 1, evSum = 0, odSum = 0;
        while (den4<=n4)
        {
            if (n4%den4==0)
            {
                if (den4%2==0)
                {
                    evSum = evSum + den4;
                }
                else
                {
                    odSum = odSum + den4;
                }
            }
            den4++;
        }
        System.out.println("\tSum of even factors:- " + evSum);
        System.out.println("\tSum of odd factors:- " + odSum);
        System.out.println("*-*-*-*-*-*-*-*-*-*");

    // 5. Count of even & odd factors of a number
        System.out.println("5. Count of even & odd factors of a number");
        System.out.print("\tEnter a number:- ");
        int n5 = s.nextInt();
        int den5 = 1, evCount = 0, odCount = 0;
        while (den5<=n5)
        {
            if (n5%den5==0)
            {
                if (den5%2==0)
                {
                    evCount++;
                }
                else
                {
                    odCount++;
                }
            }
            den5++;
        }
        System.out.println("\tTotal of even factors are:- " + evCount);
        System.out.println("\tTotal of odd factors are:- " + odCount);
        System.out.println("*-*-*-*-*-*-*-*-*-*");
    }
}