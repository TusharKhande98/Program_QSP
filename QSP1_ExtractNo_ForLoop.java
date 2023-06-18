class QSP1_ExtractNo_ForLoop {
    public static void main(String[] args) {

        int a = 12345;
        System.out.println("Updated value is:-" + a);
        for (int num3=a; num3>0; num3 =num3/10)
        {
            int ext3 = num3%10;
            System.out.println("\tExtracted number is:- " + ext3);
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}
