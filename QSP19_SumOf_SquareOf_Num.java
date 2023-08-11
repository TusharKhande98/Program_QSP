import java.util.Scanner;

class QSP19_SumOf_SquareOf_Num {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no:- ");
        int num = s.nextInt();
        int sum = 0;

        while (num!=0)
        {
            int rem = num%10;
//            sum += rem * rem;
            sum = sum + (rem*rem);
            num/=10;
        }
        System.out.println(sum);
    }
}
