public class iftest 
{
    public static void main(String[] args)
    {
        int i = 0;

        if(--i<=0)
        {
            System.out.println(i);
            i = 7;
        }

        System.out.println(i);
    }
}
