import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.get(complement) != null){
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;

        int[] result = twoSum(nums, target);
        for (int res : result) {
            System.out.println(res);
        }
    }
}