public class fizzbuzz
{
    public static void main(String[] args)
    {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        fizzbuzzEval(arr);
    }

    private static void fizzbuzzEval(int[] arr)
    {
        boolean printed = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%3 == 0)
            {
                System.out.print("fizz");
                printed = true;
            }

            if(arr[i]%5 == 0)
            {
                System.out.print("buzz");
                printed = true;
            }

            if(!printed)
            {
                System.out.print(i);
            }

            printed = false;
            System.out.println();
        }
    }
}