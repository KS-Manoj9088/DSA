package Arrays;


public class plusone {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		//Scanner sc = new Scanner(System.in);
		
		   int sum =0;
		   int j = 0;
	        for(int i =arr.length-1;i>=0;i--)
	        {
	            sum+=arr[j]*Math.pow(10,i);
	            j++;
	        }
	        
	        System.out.println(sum+1);
	        
	        sum+=1;
	        int k = 0; 
	    	int len = Integer.toString(sum).length(); 
	    	int[] a = new int[len]; 
	    	while(sum!=0) 
	    	{ 
	    		a[len-k-1] = sum%10; 
	    		sum/=10; 
	    		k++; 
	    	} 
	    	
	    	for(int i : a)
	    	{
	    		System.out.println(i);
	    	}

	}

}
