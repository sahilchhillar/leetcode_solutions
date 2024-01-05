public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val) continue;
            else nums[index++] = nums[i];
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,2,2,2,3,3,4};
        int val = 2;
        int index = removeElement(nums, val);

        for(int i=0; i<index; i++){
            System.out.print(nums[i]);
        }
    }
}
