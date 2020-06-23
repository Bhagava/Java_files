package java_programmes;
import java.util.*;
public class MethodsDemo {
	static int FirstNumber;
	static int SecondNumber;
	public static void main(String []args){
		new MethodsDemo().Input();
	}
	public void Printsum(int result)
	{
		System.out.println(result);
	}
	public void sum()
	{
		Printsum( FirstNumber+SecondNumber);
		
	}
	public void Input()
	{
		Scanner sc = new Scanner(System.in);
		FirstNumber = sc.nextInt();
		SecondNumber = sc.nextInt();
		sc.close();
		sum();
	}
}
