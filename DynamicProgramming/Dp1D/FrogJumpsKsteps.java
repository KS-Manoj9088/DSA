package DynamicProgramming.Dp1D;

public class FrogJumpsKsteps{
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int k = 3;

        int findEnergyRequired = new FrogJumpsKsteps().findMinimumEnergy(arr, k);
        System.out.println(findEnergyRequired);
    }

    public int findMinimumEnergy(int[] arr,int k){
        int[] dp =new int[arr.length];
        if(k == 0) return 0;
        dp[0] = 0;
        for(int i = 1;i < arr.length; i++){
            int minValue = Integer.MAX_VALUE;
            for(int j = 1;j <=k; j++){
                if(i-j>=0){
                    int jumpEnergyReq = dp[i-j] + Math.abs(arr[i]-arr[i-j]);
                    minValue = Math.min(jumpEnergyReq, minValue);
                }
            }
            dp[i] = minValue;
        }

        return dp[arr.length-1];
    } 
}