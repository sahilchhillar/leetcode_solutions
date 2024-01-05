public class SearchInRotatedSortedArray {
    public static int searchInSortedArray(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;

            // left sub-array
            if(nums[left] <= nums[mid]){
                if(target > nums[mid] || target < nums[left]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }

            // right sub-array
            else{
                if(target < nums[mid] || target > nums[right]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 9;

        System.out.println(searchInSortedArray(nums, target));
    }
}
