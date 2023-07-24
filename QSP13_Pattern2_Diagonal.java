class QSP13_Pattern2_Diagonal {
    public static void main(String[] args) {

    // 1. Diagonal top-left to bottom-right
        System.out.println("1. Diagonal top-left to bottom-right");
        for (int i=1; i<6; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if (i>=2 && j<=i-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println("\n");
        }

    // 2. Diagonal Shape
        System.out.println("2. Diagonal Shape");
        for (int i=0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i+j == 3 || i == j) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
