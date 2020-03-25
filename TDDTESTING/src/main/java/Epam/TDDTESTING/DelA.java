package Epam.TDDTESTING;

public class DelA 
{
	public static String del(String s)
	{
		String te=s.substring(0,2);
		return te.replaceAll("A","")+s.substring(2);
	}

}
