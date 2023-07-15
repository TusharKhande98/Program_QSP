import java.util.Scanner;
class QSP7Assgn_ProdSumCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    // 1. Product of digits
        System.out.println("\n1. Product of digits");
        System.out.print("\tInput a no. to get its product:-");
        int num1 = s.nextInt();
        int prod1 = 1;

        while (num1>0)
        {
            int extNum1 = num1%10;
            prod1*= extNum1;
            num1/= 10;
        }
        System.out.println("\tProduct of no. is:- " +prod1);

    // 2. Sum of even & odd digits
        System.out.println("\n2. Sum of even & odd digits");
        System.out.print("\tInput a number:-");
        int num2 = s.nextInt();

        int evSum1 = 0, odSum1 = 0;
        while (num2!=0)
        {
            int extNum2 = num2%10;
            if (extNum2%2 == 0)
            {
                evSum1 = evSum1 + extNum2;
            }
            else
            {
                odSum1 += extNum2;
            }
            num2/=10;
        }
        System.out.println("\tSum of even digits is:- " + evSum1);
        System.out.println("\tSum of odd digits is:-  "+ odSum1);

    // 3. Count  of even & odd digits
        System.out.println("\n3. Count  of even & odd digits");
        System.out.print("Input a number:- ");
        int num3 = s.nextInt();
        int evCount3 = 0, odCount3 = 0;

        while (num3>0)
        {
            int ext3 = num3%10;
            if (ext3%2==0)
            {
                evCount3++;
            }
            else
            {
                odCount3++;
            }
            num3/=10;
        }
        System.out.println("Count of even digits is:- " + evCount3);
        System.out.println("Count of odd digits is:- " + odCount3);

    // 4. Product of even & odd digits
        System.out.println("\n4. Product of even & odd digits");
        System.out.print("Input a number:- ");
        int num = s.nextInt();
        int evProd = 1, odProd = 1;

        for (int a=num; a>0; a/=10)
        {
            int ext = a%10;
            if (ext%2==0)
            {
                evProd*=ext;
            }
            else
            {
                odProd*=ext;
            }
            num/=10;
        }
        System.out.println("Product of even digits is:- " + evProd);
        System.out.println("Product of odd digits is:- " + odProd);
    }
}
