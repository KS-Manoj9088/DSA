import java.util.*;
import CommonMethods.commonMethods;

public class PrintSubSequencesWithSumK {
    private ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
    private int sum = 0; // shared class-level sum

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array :- ");
        int n = sc.nextInt();
        System.out.println("Enter the required target sum :- ");
        int target_sum = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Read Array Values :- ");
        commonMethods cm = new commonMethods();
        cm.readArrayValues(arr, n);

        PrintSubSequencesWithSumK ps = new PrintSubSequencesWithSumK();
        ps.printSubSequencesWithSumK(0, arr, new ArrayList<>(), target_sum);

        System.out.println("Subsequences with sum " + target_sum + " :");
        System.out.println(ps.list1);
        sc.close();
    }

    public void printSubSequencesWithSumK(int index, int[] arr, ArrayList<Integer> res, int target) {
        if (index == arr.length) {
            if (sum == target) {
                list1.add(new ArrayList<>(res));
            }
            return;
        }

        // Include current element
        sum += arr[index];               // update shared sum
        res.add(arr[index]);
        printSubSequencesWithSumK(index + 1, arr, res, target);

        // Backtrack after including
        sum -= arr[index];               // revert shared sum
        res.remove(res.size() - 1);

        // Exclude current element
        printSubSequencesWithSumK(index + 1, arr, res, target);
    }
}
