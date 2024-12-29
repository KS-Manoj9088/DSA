package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubArraySum {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		ArrayList<Integer> l1 = new ArrayList<>();
		for(int i = 0;i < a.length;i++)
		{
			int sum = 0;
			for(int j = i;j<a.length;j++)
			{
				sum+=a[j];
				l1.add(sum);
			}
		}
		Collections.sort(l1);
		System.out.println(l1);
		for(int i = 0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		System.out.println(Collections.min(l1));
		if(l1!=null)
		{
			System.out.println("true");
		}
		
		
		ArrayList<Integer> b1 = new ArrayList<Integer>();
		//Collections.addAll(b1,a);
		
		

	}

}
