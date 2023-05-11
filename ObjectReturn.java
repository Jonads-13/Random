import java.util.HashMap;
import java.util.Map;

public class ObjectReturn 
{
    private static Map<String, PInteger> integers = new HashMap<>();
    public static void main(String[] args)
    {
        initIntegers();

        PInteger num1 = getInteger("1");
        PInteger num2 = getInteger("1");

        num1.setValue(5);

        System.out.println(num1.toString() + " " + num2.toString());
    }

    public static void initIntegers()
    {
        integers.put("1", new PInteger(1));
        integers.put("2", new PInteger(2));
    }

    public static PInteger getInteger(String num)
    {
        return integers.get("1");
    }

    
}
