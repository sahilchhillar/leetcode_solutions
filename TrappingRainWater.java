public class TrappingRainWater {
    public static int trappingRainWater(int[] height){
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        
        // finding the maximum left height to trap water
        maxLeft[0] = 0;
        int maxLeftYet = maxLeft[0];
        for(int i=1; i<height.length; i++){
            maxLeftYet = Math.max(maxLeftYet, height[i-1]);
            maxLeft[i] = maxLeftYet;
        }

        //finding the maximum right height to trap water
        maxRight[height.length-1] = 0;
        int maxRightYet = maxRight[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            maxRightYet = Math.max(maxRightYet, height[i+1]);
            maxRight[i] = maxRightYet;
        }

        int[] trapWater = new int[height.length];
        for(int i=0; i<height.length; i++){
            trapWater[i] = Math.max(Math.min(maxLeft[i], maxRight[i]) - height[i], 0);
        }

        int sum = 0;
        for(int i=0; i<trapWater.length; i++){
            sum += trapWater[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] height = new int[]{4,2,0,3,2,5};
        System.out.println(trappingRainWater(height));
    }
}
