import java.util.Scanner;

class QSP21_CountOfNum_thenPowerThatDigit {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter no:- ");
        int num = s.nextInt();
        int count = 0;
        int temp = num;

        while (temp!=0)
        {
            temp/= 10;
            count++;
        }
        int sum = 0;

        for (int i = num; i!=0; i/=10)
        {
            int rem = i%10;
            int pow = 1;

            for (int j=0; j<count;j++)
            {
                pow *= rem;
            }
            sum += pow;
        }
        System.out.println(sum);
    }
}
