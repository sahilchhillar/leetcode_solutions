public class SearchInsertPosition {
    public static int searchPosition(int[] nums, int target){
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int mid = (l+r) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        System.out.println(searchPosition(nums, target));
    }
}
