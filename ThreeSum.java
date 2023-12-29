import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        // Take a value and use 2 sum on the other part of the list
        // List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];

            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            // Use 2 sum approach on the remaining array as it is sorted
            int l = i+1, r = nums.length-1;
            while (l < r){
                int sum = num + nums[l] + nums[r];
                if(sum == 0){
                    Integer[] arr = new Integer[]{nums[i], nums[l], nums[r]};
                    List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
                    res.add(list);
                    l++;
                    while (nums[l] == nums[l-1] && l < r){
                        l++;
                    }
                }else if(sum > 0){
                    r--;
                }else if(sum < 0){
                    l++;
                }
            }
        }
        // System.out.println(res);
        
        List<List<Integer>> result = new ArrayList<>(res);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,0,1,1,2};
        System.out.println(threeSum(nums));
    }
}
