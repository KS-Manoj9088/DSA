package Recursion.RecursionBasics;

public class basics {
    
    public static void main(String[] args){
        //printNnumbers(1); 

        int n = 5;

        /*
         *          for(int i = 0;i<n;i++){
                         System.out.println(fibo(i)+" ");
                     }
         
                     //System.out.println(fibo(4));

                     int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10};
                     int target = 9;
                     int res = binarySearchRecursion(arr,0,arr.length-1,target);
                     System.out.println("Element is present at index "+res); 
         * 
         */

         //function1ton(n);
         //functionnto1(n);
            functionBoth(n);

    }

    public static void printNnumbers(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printNnumbers(n+1);
    }

    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static int binarySearchRecursion(int[] arr,int low,int high,int target){
        if(low>high){
            return -1;
        }

        int mid = low + (high-low) /2;
        if(arr[mid] == target){
            return mid;
        }
        if(target<arr[mid]){
            return binarySearchRecursion(arr, low, mid-1, target);
        }

        return binarySearchRecursion(arr, mid+1, high, target);
    }

    public static void function1ton(int n){
        if(n==0){
            return;
        }
        function1ton(n-1);
        System.out.println(n);
    }

    public static void functionnto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        functionnto1(n-1);
    }

    public static void functionBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        functionBoth((n-1));
        System.out.println(n);
    }
}
