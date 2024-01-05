import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        helper(candidates, target, 0, ds, result);
        return result;
    }

    public static void helper(int[] candidates, int target, int pos, List<Integer> ds, List<List<Integer>> res){
        if(target == 0){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=pos; i<candidates.length; i++){
            if(i > pos && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;

            ds.add(candidates[i]);
            helper(candidates, target - candidates[i], i + 1, ds, res);
            ds.remove(ds.size()-1);
        }
    }
    
    public static void main(String[] args) {
        int[] candidates = new int[]{10,1,2,7,6,1,5};
        int target = 8;

        System.out.println(combinationSum(candidates, target));
    }
}
