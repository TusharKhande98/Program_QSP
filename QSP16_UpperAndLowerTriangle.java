class QSP16_UpperAndLowerTriangle {
    public static void main(String[] args) {

    //1. Upper left triangle border:-  by previous methods
        System.out.println("1. Upper left triangle border:- by previous methods-->(if condition)");
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<4; j++)
            {
                if (i==j ||  i==6 || i==3 || j==0) // observe here how to do calculation for i&j from above initialized value
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
        System.out.println();

    //2. Upper left triangle :- by new method
        System.out.println("2. Upper  left triangle:- by new method -->(which is easier to understand than previous & short also\nIt control the loop itself to generate the o/p without giving any conditions.)");
        for (int i=0; i<4; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println(" " + " ");
        }
        System.out.println();

    //3. lower left triangle :- by new method
        System.out.println("3. Lower left triangle:-");
        for (int i=0; i<4; i++)
        {
            for (int j=4; j>i; j--)
//            for (int j=0; j<4-i; j++)     can use any 1 logic here
            {
                System.out.print("*" + " ");
            }
            System.out.println(" " + " ");
        }
        System.out.println();

    //4. Upper triangle:-
        System.out.println("4. Upper right triangle:-");
        int no=4;
        for (int i=0; i<no; i++)
        {
            for (int space=0; space<no-i-1; space++)
            {
                System.out.print(" " + " ");
            }
            for (int start=0; start<=i; start++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

    //5. Upper triangle:- same o/p with different logic
        System.out.println("5. Upper right triangle:-same o/p as above with different logic");
        int num=4;
        for (int i=0; i<num; i++)
        {
            for (int j=0; j<num; j++)
            {
                if (j<num-i-1)
                {
                    System.out.print(" " + " ");
                }
                else
                {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

    //6. Lower right triangle:-
        System.out.println("6. Lower right triangle:-");
        int numb = 4;
        for (int i=0; i<numb; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print(" " + " ");
            }
            for (int j=0; j<numb-i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}