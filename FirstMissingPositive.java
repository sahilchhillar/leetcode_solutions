import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
    public static int missingPositive(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int num : nums){
            if(num > max){
                max = num;
            }if(num < min){
                min = num;
            }
        }

        int res = Integer.MIN_VALUE;
        if(max < 0){
            return 1;
        }
        
        for(int i=1; i<=max; i++){
            if(i > 0 && !set.contains(i)){
                res = i;
                break;
            }
        }

        if(res == Integer.MIN_VALUE){
            res = max + 1;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-5};
        System.out.println(missingPositive(nums));
    }
}
