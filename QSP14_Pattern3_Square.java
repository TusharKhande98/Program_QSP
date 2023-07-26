class QSP14_Pattern3_Square {
    public static void main(String[] args) {

    //1. Square border
        System.out.println("1. Square border:- ");
        for (int i=0; i<6; i++)
        {
            for (int j=0; j<6; j++)
            {
                if (i==0 || j==0 || i==5 || j==5) // subtract 1 from our i or j's value 6-1=5
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


    //2. Square border & middle border
        System.out.println("2. Square border and Middle border:- ");
        for (int i=0; i<9; i++) // for middle border take odd no. to get perfect o/p
        {
            for (int j=0; j<9; j++)
            {
                if (i==0 ||  i==8 || j==0 || j==8 || i==4 || j==4)
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
