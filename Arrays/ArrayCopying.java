package Arrays;
import java.util.*;

public class ArrayCopying {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5};
		int[] b1;
		b1 = a1;
		for(int i : b1)
		{
			System.out.println(i);
		}

		int[] c1 = Arrays.copyOf(b1, 5);

		for(int i : c1)
		{
			System.out.println(i);
		}

	}

}
