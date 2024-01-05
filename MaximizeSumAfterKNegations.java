import java.util.Arrays;

public class MaximizeSumAfterKNegations {
    public static int maximizeSum(int[] nums, int k){
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0 && k > 0){
                nums[i] = -nums[i];
                k--;
            }
        }

        int sum = 0, min = Integer.MAX_VALUE;
        for(int num : nums){
            min = Math.min(min, num);
            sum += num;
        }
        return sum - (k%2) * min * 2;
    }

    public static void main(String[] args) {
        
    }
}
