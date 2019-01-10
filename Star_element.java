package placement;
import java.util.*;
public class Star_element {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int j=0;j<t;j++)
	{
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=-1;
		int max_i=0,limit;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
			if(a[i]>max)
			{
				max=a[i];
				max_i=i;
			}
			else if(a[i]==max)
			{
				max=a[i];
				max_i= -1;
			}
		}
		int superstar;
		if(max_i==-1)
		{
			superstar=-1;
			limit=0;
		}
		else
		{
			superstar=max;
			limit=max_i;
		}
			int maxi=a[n-1]-1;
			Stack<Integer> s=new Stack<Integer>();
			
			for(int k=n-1;k>=limit;k--)
			{
				if(a[k]>maxi)
				{
					maxi=a[k];
					s.push(a[k]);
				}
			}
			while(!s.isEmpty())
			{
				System.out.print(s.pop()+" ");
			}
		System.out.println();
		System.out.print(superstar);
		
	}
}
}
