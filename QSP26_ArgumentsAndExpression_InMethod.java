class QSP26_ArgumentsAndExpression_InMethod
{
    public static void main(String[] args)
    {
        add(23+7,47);
        sub(47/2-1,14-4);
        mult(3,9);
        div(111, 12);
    }

    public static void add(int a, int b)
    {
        int sum = a+b;
        System.out.println("Addition of "+ a+ " & " +b+" is:- " + sum);
    }
    public static void sub(int a, int b)
    {
        int sub = a-b;
        System.out.println("Subtraction of "+ a+ " & " +b+" is:- " + sub);
    }
    public static void mult(int a, int b)
    {
        int multiply = a*b;
        System.out.println("Multiplication of "+ a+ " & " +b+" is:- " + multiply);
    }

    public static void div(float a, float b)
    {
        float division  = a/b;
        System.out.println("Division of "+ a+ " & " +b+" is:- "  + division);
    }
}