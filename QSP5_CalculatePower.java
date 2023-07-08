import java.util.Scanner;
class QSP5_CalculatePower {
    public static void main(String[] args) {

    // 1. Calculate power of a no. using while loop
        System.out.println("1. Calculate power of a no. using while loop");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a base value:- ");
        int base1 = s.nextInt();
        System.out.print("Enter a power value:- ");
        int pow1 = s.nextInt();
        int raise1 = pow1;
        int ans1 = 1;
        while (raise1>0)
        {
            ans1 = ans1 * base1;
            raise1--;
        }
        System.out.println("\t-==>" + base1 + " is to the power " + pow1 + " = " + ans1);

    // 2. Calculate power of a no. using For loop
        System.out.println("\n2. Calculate power of a no. using for loop");
        System.out.print("Enter a base value:- ");
        int base2 = s.nextInt();
        System.out.print("Enter a power value:- ");
        int pow2 = s.nextInt();
        int raise2 = pow2;
        int ans2 = 1;

        for (int i=0; i<raise2; i++)
        {
            ans2 = ans2 * base2;
        }
        System.out.println("\t-==>" + base2 + " is to the power " + pow2 + " = " + ans2);


    // 3. Calculate power of a no. using Do-while loop
        System.out.println("\n3. Calculate power of a no. using Do-while loop");
        System.out.print("Enter a base value:- ");
        int base3 = s.nextInt();
        System.out.print("Enter a power value:- ");
        int pow3 = s.nextInt();

        int raise3 = pow3;
        int ans3 = 1;
        do
        {
            ans3 = ans3 * base3;
            raise3--;
        }
        while (raise3>0);
        System.out.println("\t==>" + base3 + " is to the power " + pow3 + " = " + ans3);
    }
}
