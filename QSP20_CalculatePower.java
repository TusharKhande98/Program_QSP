import java.util.Scanner;
class QSP20_CalculatePower {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no:- ");
        int num = s.nextInt();
        System.out.print("Enter the power:- ");
        int raise = s.nextInt();
        int sum = 0;

        while (num!=0)
        {
            int rem = num%10;
            int pow = 1;

            for (int i = 0; i<raise; i++)
            {
                pow *= rem;
            }
            sum += pow;
            num/=10;
        }
        System.out.println(sum);

    }
}
