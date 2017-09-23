package placement;
import java.util.*;
public class Caesar_Cipher {
static public void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
			int s=sc.nextInt();
			String str=sc.next();
			char arr[]=new char[s];
	    	arr=str.toCharArray();
		    if(str.length()==s)
		    {
		    	int k=sc.nextInt();
		    
		    for(int i=0;i<s;i++)
		    {
		    	if(arr[i]=='-')
		    	{
		    		System.out.println("-");
		    	}
		    	else
		    	{
		    	int num=(int)arr[i];
		    	num=num+k;
		    	System.out.print((char)num);
		    	}
		    }
		    }
}
}
