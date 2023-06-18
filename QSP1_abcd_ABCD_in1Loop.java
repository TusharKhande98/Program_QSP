class QSP1_abcd_ABCD_in1Loop
{
    public static void main(String[] args)
    {
        for(int i=65; i<=122; i++)
        {
            if(i<97 && i>90)
            {
                System.out.print(" ");
                continue;
            }
            else
            {
                System.out.print((char)i+ " ");
            }
        }
    }
}
