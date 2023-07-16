class QSP9_PrimeNumberOrNot {
    public static void main(String[] args) {
        int num = 6,  den = 2;
        while (den<num)
        {
            if (num%den == 0)
            {
                break;
            }
            den++;
        }
        if (num == den)
        {
            System.out.println("Its a Prime number");
        }
        else
        {
            System.out.println("Its not a Prime number");
        }
    }
}
