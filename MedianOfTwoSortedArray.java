public class MedianOfTwoSortedArray {
    public static double medianOfSortedArray(int[] nums1, int[] nums2){
        int[] res = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while(i != nums1.length && j != nums2.length){
            if(nums1[i] <= nums2[j]){
                res[k++] = nums1[i++];
            }else{
                res[k++] = nums2[j++];
            }
        }

        while(i != nums1.length){
            res[k++] = nums1[i++];
        }

        while(j != nums2.length){
            res[k++] = nums2[j++];
        }

        if(k % 2 == 0){
            return (res[k/2] + res[k/2-1]) / 2.0;
        }else{
            return res[k/2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};

        System.out.println(medianOfSortedArray(nums1, nums2));
    }
}
