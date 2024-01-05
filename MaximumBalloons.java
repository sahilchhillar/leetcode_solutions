import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumBalloons {
    public static void maximumBalloons(String text){
        Map<Character, Integer> map = new HashMap<>();

        Set<Character> set = new HashSet<>();
        set.add('b');
        set.add('a');
        set.add('l');
        set.add('o');
        set.add('n');

        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(set.contains(ch)){
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
