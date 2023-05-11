import java.util.*;

public class stackinvert 
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> newStack = new Stack<>();

        for(int i = 0; i < 10; i++)
        {
            stack.add(i);
        }



        for(int i = 0; i < stack.size(); i++)
        {
            System.out.println(stack.elementAt(i));
        }

        System.out.println("\n\n");
        
        int length = stack.size();
        for(int i = 0; i < length; i++)
        {
            newStack.add(stack.pop());
        }
        
        for(int i = 0; i < newStack.size(); i++)
        {
            System.out.println(newStack.elementAt(i));
        }

    }


}
