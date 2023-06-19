class QSP1_ExtractNo_WhileLoop {
    public static void main(String[] args) {

        int num1 = 12345;
        System.out.println("Given Number is:-" + num1);
        while (num1>0)
        {
            int ext1 = num1%10;
            System.out.println("\tExtracted number is:- " + ext1);
            num1 = num1/10;
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}
