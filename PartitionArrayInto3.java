public class PartitionArrayInto3 {
    public static boolean partitionArray(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        if(sum % 3 != 0) return false;

        int target = sum / 3, count = 0, accum = 0;
        for(int num : nums){
            if(count == 2) return true;
            accum += num;
            if(accum == target){
                count++; accum = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,2,1,-6,6,-7,9,1,2,0,1};
        System.out.println(partitionArray(nums));
    }
}
