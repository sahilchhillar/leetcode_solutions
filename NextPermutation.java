public class NextPermutation {
    public static void reverseArray(int[] nums, int start, int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void nextPermutation(int[] nums){
        int index = -1;
        int size = nums.length;

        // find the break point from the end
        for(int i=size-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        // if no break point it means, that is the last permutation, so reverse the array and return
        if(index == -1){
            reverseArray(nums, 0, size-1);
            return;
        }

        // find the smallest greatest element from the remaning array and swap
        for(int i=size-1; i > index; i--){
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        // reverse the remainin array and return
        reverseArray(nums, index+1, size-1);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,1,2};
        nextPermutation(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
