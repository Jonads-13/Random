import java.util.*;

public class ArraySearchTest 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int[] list = new int[5];
        int c = 0;
        System.out.println("Enter number: ");
        while (c < 5 && s.hasNext()) {
            int n = s.nextInt();
            boolean has = n >= 10 && n <= 100;
            for (int i = 0; i <= c && !has; ++i)
                if (list[i] == n)
                    has = true;
            if (!has) {
                System.out.println("It has been entered.");
                list[c++] = n;
            }
        }
        System.out.println("Result = " + Arrays.toString(list));
        s.close();
    }
}
