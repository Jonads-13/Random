import java.util.*;

public class ProductionCode
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		//String upper = convertUpper(input);

		//String lower =  convertLower(input);

		String replaced = removeCharacter(input);

		System.out.println(replaced);

		sc.close();

	}

	public static String convertUpper(String p)
	{
		String upper = p.toUpperCase();
		return upper;
	}

	public static String convertLower(String p)
	{
		String lower = p.toLowerCase();
		return lower;
	}

	public static String removeCharacter(String p)
	{
		String newString = "";

		System.out.println("string length is " + p.length());


		for(int i = 0; i < p.length(); i++)
		{
			try
			{
				int parseTry = Integer.parseInt(String.valueOf(p.charAt(i)));
				newString = p.replaceFirst(String.valueOf(p.charAt(i)), "");
				System.out.println("new string = " + newString);
			}
			catch(IllegalArgumentException error)
			{
				System.out.println("i = " + i);
			}
		}
		return newString;
	}
}

