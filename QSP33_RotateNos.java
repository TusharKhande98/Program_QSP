import java.util.Scanner;
class QSP33_RotateNos
{
    public static int count(int num)
    {
        int ct = 0;
        while (num!=0)
        {
            ct++;
            num/=10;
        }
        return ct;
    }

    public static int power(int base, int raise)
    {
        int pow=1;
        for (int i=0; i<raise; i++)
        {
            pow*=base;
        }
        return pow;
    }

    public static int rotate (int num)
    {
        int ct = count(num);
        int position = power(10, ct-1);
        int last = num%10;
        num/=10;
        int ans = (last*position) + num;
        return ans;
    }
    // same above method we can write in short without declaring extra variable.
    public static int rotate1 (int num)
    {
        return (num%10 * power(10, count(num)-1)) +(num/10);
    }

    // something change in answer
    public static int rotate2 (int num)
    {
        int ans = 0;
        int count  = count(num)-1;
        int position = power(10, count);
        for (int i=0; i<count; i++)
        {
            int last = num%10;
            num/=10;
            ans = (last*position) + num;
            System.out.println(ans);
            num=ans;
        }
        return ans;
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no:- ");
        int ip = s.nextInt();
        System.out.println(rotate2(ip));
    }
}