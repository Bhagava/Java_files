package java_programmes;

class Calculate
{
	public String add(String... values)
	{
		String total = null;
		for(String value : values)
		{
			total = total+value;
		}
		return (total);
	}
}

public class VaribleArgsMethod {
	public static void main(String[] args)
	{
		Calculate cal = new Calculate();
		System.out.println(cal.add("bhagavan","is","a","bad","boy"));
	}

}
