import java.util.*;
public class Permutations
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int userNum, rMax; 
		long nFact, rFact, rFact2, p;
		boolean close = false;

		System.out.println("Please input the number of elements for the array between 5 and 50: ");
		userNum = sc.nextInt();

		while(!close)
		{
			if((userNum >= 5) || (userNum <= 50))
			{
				close = true;
			}
			else
			{
				close = false;
			}
		}

		System.out.println("Please enter the maximum number of elements that should be selected: ");
		rMax = sc.nextInt();

		close = false;
		
		while(!close)
		{
			if((rMax >= 2) || (rMax <= userNum))
			{
				close = true;
			}
			else
			{
				close = false;
			}

		}

		long[] theArray = new long[(rMax-1)];

		rFact2 = userNum - rMax;

		for(int i = 0; i < (rMax-1); i++)
		{
			nFact = factorialIterative(userNum);

			rFact = factorialIterative(rFact2); 

			p = nFact/rFact;

			theArray[i] = p;
			System.out.println(theArray[i] + " ");
		}
		sc.close();
	}

	public static long factorial(long aParam)
	{
		long fact = 0;
		for(long  pi = 1; pi < (aParam-1); pi++)
		{
			fact = pi * (pi - 1);
		}
		return fact;
		
	}
	public static long factorialIterative ( long n )
	{
    		long r = 1;
    		for ( long i = 1; i <= n; i++ )
    		{
        		r*=i;
    		}
   		 return r;
	}

}			




