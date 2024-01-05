import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        helper(0, candidates, target, result, ds);
        return result;
    }

    public static void helper(int index, int[] candidates, int target, List<List<Integer>> result, List<Integer> ds){
        if(index == candidates.length){
            if(target == 0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }

        if(candidates[index] <= target){
            ds.add(candidates[index]);
            helper(index, candidates, target - candidates[index], result, ds);
            ds.remove(ds.size()-1);
        }

        helper(index + 1, candidates, target, result, ds);
    }

    public static void main(String[] args) {
        int[] candidates = new int[]{2,3,6,7};
        int target = 7;

        System.out.println(combinationSum(candidates, target));
    }
}
