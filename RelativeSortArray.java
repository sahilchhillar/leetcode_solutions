import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeSortArray {
    // Brute force solution
    public static void sortArray1(int[] arr1, int[] arr2){
        Map<Integer, Integer> map = new HashMap<>();
        for(int arr : arr1){
            map.put(arr, map.getOrDefault(arr, 0)+1);
        }

        int k = 0;
        int numElements = 0;
        for(int arr : arr2){
            int num = map.get(arr);
            map.remove(arr);
            while(num > 0){
                arr1[k++] = arr;
                num--;
                numElements++;
            }
        }

        int[] remaining = new int[arr1.length - numElements];
        int i=0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();

            while(val > 0){
                remaining[i++] = key;
                val--;
            }
        }

        Arrays.sort(remaining);
        for(int rem : remaining){
            arr1[k++] = rem;
        }

        for(int arr : arr1){
            System.out.print(arr + ", ");
        }
    }

    // Optimised solution
    public static void sortArray2(int[] arr1, int[] arr2){
        int[] nums = new int[1001];
        for(int arr : arr1){
            nums[arr]++;
        }

        int index = 0;
        
        //sorting arr1 based on arr2
        for(int arr : arr2){
            while(nums[arr] > 0){
                arr1[index++] = arr;
                nums[arr]--;
            }
        }

        for(int i=0; i<nums.length; i++){
            while(nums[i] > 0){
                arr1[index++] = i;
                nums[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int[] arr2 = new int[]{2,42,38,0,43,21};
        
        sortArray1(arr1, arr2);
    }
}
