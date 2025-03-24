package SlidingWindowAnd2Pointer.VARIABLE_LENGTH_SLIDING_WINDOW;

public class MaxPeopleForKWeightBus {

    public static void main(String[] args) {
        int[] weights = {1,5,7,2,9};
        int maxWeight = 10;

        int maxPeopleCanRide = maxPeople(weights, maxWeight);
        System.out.println("Max people can ride: " + maxPeopleCanRide);

    }

    public static int maxPeople(int[] arr,int maxWeight){
        int n =arr.length;
        int sum = 0;
        int left = 0;
        int ans = 0;
        for(int right = 0;right<n;right++){
            sum+=arr[right];

            while(sum>maxWeight){
                sum-=arr[left];
                left++;
            }

            ans = Math.max(ans,right-left+1);
            //Ekkada "right-left+1" no of people ni denote chesthundhi.
        }

        return ans;
    }
    
}
