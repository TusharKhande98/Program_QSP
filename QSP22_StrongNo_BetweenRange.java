import java.util.Scanner;
class QSP22_StrongNo_BetweenRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter start no:- ");
        int start = s.nextInt();
        System.out.print("Enter end no:- ");
        int end = s.nextInt();

        while (start<end)
        {
            int temp = start;
            int rem = 0,  sum = 0;
            while (temp>0)
            {
                rem = temp%10;
                int fact = 1;
                for (int i=1; i<=rem; i++)
                {
                    fact *= i;
                }
                sum += fact;
                temp /= 10;
            }
            if (sum == start)
            {
                System.out.println(sum + " is a strong number.");
            }
            start++;
        }
    }
}
