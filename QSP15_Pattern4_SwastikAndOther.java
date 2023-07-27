class QSP15_Pattern4_SwastikAndOther {
    public static void main(String[] args) {

    //1. Swastik Pattern
        System.out.println("1. Swastik Pattern:- ");
        for (int i=0; i<9; i++)
        {
            for (int j=0; j<9; j++)
            {
                if (j==4 || i==4 || i==0 && j>4 || j==0 && i<4 || i==8 && j<4 || j==8 && i>4)
                {
                    System.out.print("*" + " ");
                }
                else
                {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\n");

    //2. Square, plus, triangle  Pattern
        System.out.println("2. It includes pattern like Square, plus & triangle:- ");
        for (int i=0; i<11; i++)
        {
            for (int j=0; j<11; j++)
            {
                if (i==j || i+j==10 || j==0  || i==0 || i==10 || j==10 || i==5 || j==5)
                {
                    System.out.print("*" + " ");
                }
                else
                {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
