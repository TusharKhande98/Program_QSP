class QSP7_SumOfDigits {
    public static void main(String[] args) {

        int num = 123, sum = 0;
        while (num!=0)
        {
            int ext = num%10;
            sum = sum + ext;
            num = num/=10;
        }
        System.out.println(sum);
    }
}
