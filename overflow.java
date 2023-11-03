import java.util.Scanner;
public class overflow {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();
        short num2 = sc.nextShort();
        short factor = sc.nextShort();
        short result = calc(num, num2, factor);
        System.out.println(result);
        sc.close();
    }

    public static short calc(short num1, short num2, short factor)
    {
        final int result = valid(num1 + valid(num2 * factor));
        return (short)result;
    }

    public static int valid(int value) throws ArithmeticException
    {
        if(value < Short.MIN_VALUE || value > Short.MAX_VALUE)
        {
            throw new ArithmeticException("Value too big for type short: " + value);
        }
        return value;
    }
}
