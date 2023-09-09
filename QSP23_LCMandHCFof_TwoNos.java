import java.util.Scanner;
class QSP23_LCMandHCFof_TwoNos {
    public static void main(String[] args) {

    // 1. LCM of 2 numbers
        Scanner s = new Scanner(System.in);
        System.out.println("1. LCM of 2 numbers");
        System.out.print("Enter first no:- ");
        int n1 = s.nextInt();
        System.out.print("Enter second no:- ");
        int n2 = s.nextInt();

        int lcm = n1>n2 ? n1:n2;
        while (true)
        {
            if (lcm%n1==0 && lcm%n2==0)
            {
                System.out.println(lcm);
                break;
            }
            lcm++;
        }

    // 2. HCF of 2 numbers
        System.out.println("2. HCF of 2 numbers");
        System.out.print("Enter first no:- ");
        int no1 = s.nextInt();
        System.out.print("Enter second no:- ");
        int no2 = s.nextInt();
        int hcf = n1<n2 ? n1:n2;

        for ( ; ;)  // reason unknown--> why its blank?
        {
            if (no1%hcf==0 && no2%hcf==0)
            {
                System.out.println("HCF of " + no1 + " & " + no2 + " is " + hcf);
                break;
            }
            hcf--;
        }
    }
}
