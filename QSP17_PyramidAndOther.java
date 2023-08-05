class QSP17_PyramidAndOther {
    public static void main(String[] args) {

    // 1. Pyramid Pattern
        System.out.println("1. Pyramid Pattern");
        int n = 3;
        for (int i=0; i<n; i++)
        {
            for (int space=0; space<n-i-1; space++)
            {
                System.out.print(" " + " ");
            }
            for (int star=0; star<=2*i; star++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

    // 2. Other pattern
        System.out.println("2. Other Pattern");
        int no = 5, star1 = 0, space1 = n/2;
        for (int i=0; i<no; i++)
        {
            for (int j=0; j<=space1; j++)
            {
                System.out.print(" " + " ");
            }
            for (int j=0; j<=star1; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();

            if (i<n/2)
            {
                space1--;
                star1+=2;
            }
            else
            {
                space1++;
                star1-=2;
            }
        }
    }
}
