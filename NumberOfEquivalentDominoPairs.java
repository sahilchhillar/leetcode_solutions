import java.util.HashMap;
import java.util.Map;

class NumberOfEquivalenetDominoPairs{
    public static int dominoPairs(int[][] dominoes){
        Map<Integer, Integer> count = new HashMap<>();
        int res = 0;
        for (int[] d : dominoes) {
            int k = Math.min(d[0], d[1]) * 10 + Math.max(d[0], d[1]);
            count.put(k, count.getOrDefault(k, 0) + 1);
        }
        for (int v : count.values()) {
            res += v * (v - 1) / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] dominoes = new int[][]{
            {1,2}, {2,1}, {1,2}, {1,1}, {2,2}
        };
        System.out.println(dominoPairs(dominoes));
    }
}