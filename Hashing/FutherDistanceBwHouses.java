package Hashing;

public class FutherDistanceBwHouses{
    public static void main(String[] args) {
        int arr[] = {1,8,3,8,3};

        int maxDistance = new FutherDistanceBwHouses().maxDistance(arr);
        System.out.println("Maximum distance between two houses is " + maxDistance);
    }

    public int maxDistance(int[] colors) {
        int maxDist = 0;
        for(int i = 0; i < colors.length-1; i++){
            for(int j = 0; j < colors.length; j++){
                if(colors[i]!=colors[j]){
                    int dist = Math.abs(j-i);
                    maxDist = Math.max(dist, maxDist);
                }
            }
        }
        return maxDist;
    }

    public int maxDistance2(int[] colors) {            //My Solution
        int distStart = 0;
        int distEnd = 0;

        int len = colors.length;
        for(int i = 0; i < len; i++){
            for(int j = len-1; j >= 0; j--){
                if(colors[j]!=colors[i]){
                    distStart = Math.abs(i-j);
                    break;
                }
            }
            break;
        }

        for(int i = len-1; i>=0; i--){
            for(int j = 0; j < len; j++){
                if(colors[i]!=colors[j]){
                    distEnd = Math.abs(i-j);
                    break;
                }
            }
            break;
        }

        return Math.max(distStart, distEnd);
    }

    public int maxDistance3(int[] colors) {
        int n = colors.length;

        // Check max distance from the first house
        int dist1 = 0;
        for (int j = n - 1; j > 0; j--) {
            if (colors[j] != colors[0]) {
                dist1 = j; // Distance from index 0 to j
                break;
            }
        }

        // Check max distance from the last house
        int dist2 = 0;
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                dist2 = n - 1 - i; // Distance from i to last index
                break;
            }
        }

        return Math.max(dist1, dist2);
    }
}