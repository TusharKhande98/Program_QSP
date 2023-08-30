import java.util.Scanner;
class QSP21Assgn_StrongNumber {
    public static void main(String[] args) {

//     145--> factorial of single digits--> !1 + !4 +!5 = 145 or not if it is then its strong no
//     5x4x3x2x1 = 120 & 4x3x2x1 = 24 & 1x1 = 1
//     1 + 24 + 120 =145---> its a strong number

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no:- ");
        int num = s.nextInt();
        int temp = num, sum = 0;

        while (temp!=0)
        {
            int rem = temp %10;
            int fact = 1;
            for (int i=rem; i>0; i--)
            {
                fact *= i;
            }
            sum = sum + fact;
            temp/=10;
        }

        if (num == sum)
        {
            System.out.println("Its a strong number");
        }
        else
        {
            System.out.println("Not a strong number");
        }
    }
}
