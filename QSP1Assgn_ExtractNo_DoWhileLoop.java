class QSP1Assgn_ExtractNo_DoWhileLoop {
    public static void main(String[] args) {

        int num2 = 6789;
        System.out.println("Given Number is:-" + num2);
        do
        {
            int ext2 = num2%10;
            System.out.println("\tExtracted number is:- " + ext2);
            num2 = num2/10;
        }
        while (num2>0);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}
