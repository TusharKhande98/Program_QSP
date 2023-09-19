class QSP25_VariablesInMethod1
{
    public static void main(String[] args)
    {
        System.out.println("We cant access local variable of 1 method from another method.");
        a();
    }

    private static void a()
    {
        int a = 10; // its a local variable which don't have access from another outside method as below--> method b();
        System.out.println("Value of 'a' is "+ a);
        b();
    }

    private static void b()
    {
//        System.out.println("Value of 'a' is "+ a); // can't access another method's local variable
// we will get CTE as--> can't find symbol.
    }

}
