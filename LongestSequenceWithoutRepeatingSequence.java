import java.util.HashSet;
import java.util.Set;

public class LongestSequenceWithoutRepeatingSequence {
    public static int longestSequenceWithoutRepeatingSequence(String string){
        Set<Character> set = new HashSet<>();
        int l = 0, res = 0;
        for(int i=0; i<string.length(); i++){
            while(set.contains(string.charAt(i))){
                set.remove(string.charAt(l++));
            }
            set.add(string.charAt(i));
            res = Math.max(res, (i-l+1));
        }
        return res;
    }
    
    public static void main(String[] args) {
        
    }
}
