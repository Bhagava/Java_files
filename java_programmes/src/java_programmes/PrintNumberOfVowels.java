package java_programmes;
import java.util.*;
public class PrintNumberOfVowels {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] str1 = str.split(str, 'a'|'e'|'i'|'o'|'u'|'A'|'E'|'I'|'O'|'U');
		System.out.println(str1.length+1);
		sc.close();
	}
}
