public class ContainerWithMostWater {
    public static int maxArea(int[] nums) {
        int l = 0, r = nums.length - 1;
        int maxArea = 0;
        while (l < r){
            int width = r - l;
            int height = Math.min(nums[l], nums[r]);
            int area = width * height;
            maxArea = Math.max(maxArea, area);
            if(nums[l] < nums[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}
