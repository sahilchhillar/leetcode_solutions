import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumAbsoluteDifference {
    public static void minDiff(int[] nums){
        Arrays.sort(nums);
        
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        int minimumDiff = Integer.MAX_VALUE;

        for(int i=0; i<nums.length-1; i++){
            int diff = Math.abs(nums[i] - nums[i+1]);
            if(diff <= minimumDiff){
                minimumDiff = diff;
                List<Integer> temp = Arrays.asList(nums[i], nums[i+1]);
                if(map.get(minimumDiff) == null){
                    List<List<Integer>> list = new ArrayList<>();
                    list.add(temp);
                    map.put(minimumDiff, list);
                }else{
                    List<List<Integer>> updatedList = map.get(minimumDiff);
                    updatedList.add(temp);
                    map.put(minimumDiff, updatedList);
                }
            }
        }

        System.out.println(map.get(minimumDiff));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,8,-10,23,19,-4,-14,27};
        minDiff(nums);
    }
}
