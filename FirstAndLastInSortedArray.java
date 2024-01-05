public class FirstAndLastInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = binarySearch(nums, target, true);
        result[1] = binarySearch(nums, target, false);

        return result;
    }

    public static int binarySearch(int[] nums, int target, boolean leftBias){
        int l = 0, r = nums.length - 1;
        int index = -1;

        while (l <= r){
            int mid = (l + r) / 2;
            if(target < nums[mid]){
                r = mid - 1;
            }else if(target > nums[mid]){
                l = mid + 1;
            }else{
                index = mid;
                if(leftBias){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 8;

        int[] res = searchRange(nums, target);
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]);
        }
    }
}
