class Main
{
    public static void main(String args[])
{
    for(int i = 0; i<=5;i++)
    {
        for(int j = i; j<=5;j++)
        {
            System.out.print("     ");
        }
       for(int x = i; x >=0;x--)
       {
           System.out.print("  *  ");
       }
       for(int y = 1; y <=i;y++)
       {
           System.out.print("  *  ");
       }
       System.out.println( );
    }
}
}