import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrance {
    public static boolean uniqueOccurrance(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        Set<Integer> set = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(set.contains(entry.getValue())) return false;
            set.add(entry.getValue());
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(uniqueOccurrance(nums));
    }
}
