import java.util.HashMap;
import java.util.Map;

public class MinimumCostToMoveChips {
    public static int minCost(int[] positions){
        Map<Integer, Integer> map = new HashMap<>();
        for(int pos : positions){
            map.put(pos, map.getOrDefault(pos, 0)+1);
        }

        int evenCost = 0, oddCost = 0;

        // Check for even cost
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey()%2 == 1){
                evenCost += entry.getValue();
            }
        }

        // Check for odd cost
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getKey()%2 == 0){
                oddCost += entry.getValue();
            }
        }

        return Math.min(evenCost, oddCost);

    }

    public static void main(String[] args) {
        int[] positions = new int[]{2,1000000000};
        System.out.println(minCost(positions));
    }
}
