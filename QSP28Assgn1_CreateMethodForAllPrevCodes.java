class QSP28Assgn1_CreateMethodForAllPrevCodes
{
// 1. Method for finding HCF
        public static void hcf (int n1, int n2)
        {
            int hcf = n1<n2? n1:n2;
            for ( ; ; )
            {
                if(n1%hcf == 0 &&  n2%hcf == 0)
                {
                    System.out.println("HCF of " + n1 + " & " +n2 + " is " + hcf);
                    break;
                }
                --hcf;
            }
        }

// 2. Method for finding LCM
        public static void lcm (int n1, int n2)
        {
            int lcm = n1>n2? n1:n2;
            for (;;)
            {
                if(lcm%n1 == 0 &&  lcm%n2 == 0)
                {
                    System.out.println("LCM of " + n1 + " & " +n2 + " is " + lcm);
                    break;
                }
                lcm++;
            }
        }

// 3. Method to calculate Power
        public static void power (int base, int power)
        {
            int res = 1;
            for (int i = 0; i<power; i++)
            {
                res *= base;
            }
            System.out.println(base + " to the power " + power + " is " + res);
        }

// 4. Method to find no. is Prime Number or not
        public static void primeNo (int num)
        {
            int den = 2;
            while (den<num)
            {
                if (num%den == 0)
                {
                    System.out.println(num + " is not a prime no.");
                    break;
                }
                den++;
            }
            if (den==num)
            {
                System.out.println(num + " is a prime no.");
            }
        }

// 5. Method to find no. is Odd Number or not
        public static void odd (int num)
        {
            if (num%2 == 0)
            {
                System.out.println(num + " is a even no.");
            }
            else
            {
                System.out.println(num + " is a odd no.");
            }
        }

// 6. Method to find no. is even Number or not
        public static void even (int num)
        {
            if (num%2 == 0)
            {
                System.out.println(num + " is an even no.");
            }
            else
            {
                System.out.println(num + " is not an even no.");
            }
        }

// 7. Method to find factors of a no.
        public static void factors (int num)
        {
            int den = 1, count = 0, temp = num;
            while (den<=temp)
            {
                if (temp%den == 0)
                {
                    System.out.println(den + " is a factor of " + num);
                    count++;
                }
                den++;
            }
            System.out.println("There are total " + count + " factors of " + num);
        }

// 8. Method to find count of digits from a number
        public static void digits (int num)
        {
            int temp=num, count=0;
            while (temp!=0)
            {
                temp/=10;
                count++;
            }
            System.out.println(num + " has " + count + " digits.");
        }

// 9. Method to find number is palindrome or not
        public static void palindrome (int num)
        {
            int rem=0, temp=num, res=0;
            while (temp!=0)
            {
                rem = temp%10;
                res = (rem*10) + rem;
                temp/=10;
            }
            if (res==num)
            {
                System.out.println(num + " is a palindrome number");
            }
            else
            {
                System.out.println(num + " is not a palindrome number");
            }
        }

// 10. Method to find number is co-prime or not
        public static void coPrime (int n1, int n2)
        {
            int hcf = n1<n2? n1:n2;
            for ( ; ; )
            {
                if(n1%hcf == 0 &&  n2%hcf == 0)
                {
                    break;
                }
                --hcf;
            }
            if (hcf==1)
            {
                System.out.println(n1+ " and " +n2 + " are co-prime number");
            }
            else
            {
                System.out.println(n1+ " and " +n2 + " are not co-prime number");
            }
        }

        public static void main(String[] args)
        {
            primeNo(73);
            coPrime(5,7);
            odd(1);
            hcf(9,7);
            lcm(9,7);
            even(10);
            power(139,5);
            digits(145);
            factors(12);
            palindrome(131);
        }
}