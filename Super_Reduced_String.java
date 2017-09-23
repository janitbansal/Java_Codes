package placement;
import java.util.*;
public class Super_Reduced_String {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		StringBuilder str=new StringBuilder(s);
		int i=1;
		while(i<str.length())
		{
			char pre=str.charAt(i);
			char next=str.charAt(i-1);
			if(pre==next)
			{
				str=str.deleteCharAt(i);
				str=str.deleteCharAt(i-1);
				i=1;
			}
			
			else
				i++;
		}
		s=str.toString();
		if(s.isEmpty())
		{
			System.out.println("Empty String");
		}
		else
		System.out.println(s);
	
	}
}
