public class RemoveDuplicatesFromArray {
    public static void removeDuplicates(int[] nums){
        int prev = nums[0];
        int index = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] == prev) continue;
            else{
                nums[index] = nums[i];
                prev = nums[index];
                index++;
            }
        }

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0};
        removeDuplicates(nums);
    }
}
