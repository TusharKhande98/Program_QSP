class QSP2Assgn_ReverseNo_DoWhileForLoop {
    public static void main(String[] args) {

    // 1. Reverse with Do-While loop
        int num1 = 1234;
        int rev1 = 0;
        do
        {
            int ext1 = num1%10;
            rev1 = (rev1*10) + ext1;
            num1 = num1/10;
        }
        while (num1>0);
        System.out.println("Reverse value of 1234 is:- " + rev1);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");

    // 2. Reverse with For loop
        int rev2 = 0;
        int a2 = 2468;
        // if we assign value to num3 in below for loop, we cant able to use it outside a block.
        // Here assign value to 'a3', so we can use it in for loop & outside for loop also.
        for (int num2=a2; num2>0; num2 = num2/10)
        {
            int ext2 = num2%10;
            rev2 = (rev2*10) + ext2;
        }
        System.out.println("Reverse value of 2468 is:- " + rev2);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}
