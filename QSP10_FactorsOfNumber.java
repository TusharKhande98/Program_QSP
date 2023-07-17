class QSP10_FactorsOfNumber {
    public static void main(String[] args) {

        int num =14, den = 1;
        System.out.print("Factors of " + num + " are:- ");
        while(den<=num)
        {
            if (num%den == 0)
            {
                System.out.print(" " + den);
            }
            den++;
        }
        System.out.println(" ");

    // SAME PROGRAM WITH LITTLE CHANGE:- o/p will same but iteration inside loop will reduce by 50%
    // And last value will not print---. reason unknown
        int num1 =14, den1 = 1;
        System.out.print("Factors of " + num1 + " are:- ");

        while(den1<=num1/2)
        {
            if (num1%den1 == 0)
            {
                System.out.print(" " + den1);
            }
            den1++;
        }
    }
}
