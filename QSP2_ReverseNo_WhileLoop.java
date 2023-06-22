class QSP2_ReverseNo_WhileLoop {
    public static void main(String[] args) {

        int num1 = 12345;
        int rev1 = 0;
        System.out.println("Given Number is:-" + num1);
        while (num1>0)
        {
            int ext1 = num1%10;
            rev1 = (rev1*10) + ext1;
            num1 = num1/10;
        }
        System.out.println("Reverse number  is:- " + rev1);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}
