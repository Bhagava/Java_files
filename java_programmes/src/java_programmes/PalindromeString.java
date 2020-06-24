package java_programmes;
import java.util.*;
public class PalindromeString {
	public static void main(String[] args)
	{
		int flag=0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int k=str.length()-1;
		for(int i=0 ; i<str.length()/2 ; i++)
		{
			if(str.charAt(i)==str.charAt(k))
			{
				flag=0;
				k--;
			}
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		sc.close();
	}
}
