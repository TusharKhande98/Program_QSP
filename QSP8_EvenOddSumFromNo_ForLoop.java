import java.util.Scanner;
class QSP8_EvenOddSumFromNo_ForLoop {
    public static void main(String[] args) {
        int num = 2587123, evSum = 0, odSum = 0;
        for (int i=num; i!=0; i=i/10)
        {
            int rem = i%10;
            if (i%2==0)
            {
                evSum+=rem;
            }
            else
            {
                odSum+=rem;
            }
         }
        System.out.println("Even digits sum from a no is:- " + evSum);
        System.out.println("Odd digits sum from a no is:- " + odSum);
        System.out.println("**********************************************");


        // BELOW CODE IS DONE AS PRACTISE
        System.out.print("Enter a number to even& odd digit's sum from that number:-");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int evsum1 = 0, odsum1=0;
        while (num1!=0)
        {
            int rem = num1%10;
            if (rem%2==0)
            {
                evsum1+=rem;
            }
            else
            {
                odsum1+=rem;
            }
            num1/=10;
        }
        System.out.println("Even digits sum from a no is:- " + evsum1);
        System.out.println("Odd digits sum from a no is:- " + odsum1);
    }
}
