import java.util.Scanner;
class QSP11_CheckPrimeOrNot_Printfactors {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int num = s.nextInt();
        int den = 2;
        while (den<num)
        {
            if (num%den == 0)
            {
                break;
            }
            den++;
        }
        if (num == den)
        {
            System.out.println("Its a Prime number");
            System.out.println("So, the factors are 1 & "+num);
        }
        else
        {
            System.out.println("Not a prime number");
        }
    }
}
