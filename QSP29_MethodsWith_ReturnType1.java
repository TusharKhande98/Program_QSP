class QSP29_MethodsWith_ReturnType1
{
    public static int charToAscii(char ch) // 2. after 'method statement call' it will start execute & value 'a' will pass to  var 'ch'.
    {
        int res = ch; // 3. that char value is store in 'int' datatype, so it will typecast it  implicitly.
        return res; // 4. whatever variable/value we write here that will return to a line in which function is called.(res send to line-11).
    }
    // NOTE:- if we write 121 then it will send to print line so it will print 121.

    public static void main(String[] args) // execution starts from here
    {
        System.out.println(charToAscii('a'));  // 5. after returning value from function, it will print here.
        // 1. first method statement call will happen, then main method execution will paused.
    }
}