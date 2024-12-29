package arrays;
import java.util.*; 

public class kThfactor {
	public static void main(String[] args)
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		int n = 4;
		int k = 4;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				l1.add(i);
			}
		}
		
		System.out.println(l1.size());
		
		if(l1.size()>=k)
		{
			//System.out.println(-1);
		}
		
		System.out.println(l1);
		
		//System.out.println(l1.get(k));
	}
		// TODO Auto-generated method stub

	

}
