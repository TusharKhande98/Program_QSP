class QSP25_VariablesInMethod2
{
    public static void main(String[] args)
    {
        System.out.println("same name of variable can be declared but in different methods.");
        boolean a = true;
        System.out.println("Value of 'a' is--> " + a);
        a();
    }
    public static void a()
    {
        int a = 12345;
        System.out.println("Value of 'a' is--> "+ a);
        b();
    }

    public static void b()
    {
        int a = 1234567890;
        System.out.println("Value of 'a' is--> "+ a);
    }
}