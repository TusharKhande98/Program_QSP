import java.util.Scanner;
class QSP18_RangeOf_PrimeNo {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter starting no:-");
        int start = s.nextInt();
        System.out.println("Enter ending no:-");
        int end = s.nextInt();

        for (int i = start; i<end; i++)
        {
            int j;
            for (j = 2; j<i; j++)
            {
                if (i%j==0)
                {
                    break;
                }
            }
            if (i==j)
            {
                System.out.print(i + " ");
            }
        }
    }
}
