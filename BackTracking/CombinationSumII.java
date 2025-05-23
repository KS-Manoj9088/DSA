import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumII{
    public static void main(String[] args) {
        // Remove Duplicate Arrays making to our required target
        int[] arr = new int[]{10, 1, 2, 7, 6, 1,5};
        int target = 8;
        List<List<Integer>> res_list = combinationSum2(arr, target);
        System.out.println(res_list.toString());
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> outerset = new HashSet<>();
        Arrays.sort(candidates); // Sorting helps in avoiding duplicate combinations
        findCombinations(0, target, candidates, outerset, new ArrayList<>());
        return new ArrayList<>(outerset);
    }

    public static void findCombinations(int index, int target, int[] arr, Set<List<Integer>> outer, List<Integer> inner) {
        if (target == 0) {
            outer.add(new ArrayList<>(inner)); // Copy to avoid mutation issues
            return;
        }

        if (index >= arr.length) return;

        // Pick element
        if (arr[index] <= target) {
            inner.add(arr[index]);
            findCombinations(index + 1, target - arr[index], arr, outer, inner);
            inner.remove(inner.size() - 1); // Backtrack
        }

        // Skip duplicates
        while (index + 1 < arr.length && arr[index] == arr[index + 1]) {
            index++;
        }

        // Don't pick element
        findCombinations(index + 1, target, arr, outer, inner);
    }
}