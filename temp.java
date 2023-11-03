import java.util.*;
public class temp
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double num, ans;
		System.out.print("Please enter the Celsius value: ");
		num = sc.nextDouble();
		ans = (num * 9)/5 + 32;
		System.out.println(num + " degrees Celsius " + "is " + ans + " degrees Farenheit");
		sc.close();
	}
}
