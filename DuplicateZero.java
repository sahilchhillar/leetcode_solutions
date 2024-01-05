public class DuplicateZero {
    // Solution 1 : Brute force
    public static void duplicateZero(int[] nums){        
        int i=0;
        while(i < nums.length){
            if(nums[i] != 0){
                i++; continue;
            }else{
                int l = nums.length - 1;
                while(l > (i+1)){
                    nums[l] = nums[l-1];
                    l--;
                }
                if(i+1 >= nums.length) break;
                nums[i+1] = 0;
                i += 2;
            }
        }

        for(int num : nums){
            System.out.print(num + ", ");
        }
    }

    public static void duplicateZero2(int[] nums){
        int index = 0;
        int n = nums.length;
        int[] temp = nums.clone();

        for(int i=0; index < n; i++){
            nums[index++] = temp[i];
            if(temp[i] == 0 && index < n){
                nums[index++] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0,0,0,0,0};
        duplicateZero(nums);
    }
}
