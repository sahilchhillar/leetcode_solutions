import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    private static void backtrack(List<String> result, StringBuilder current, int open, int close, int n) {
        if(open == close && open == n){
            result.add(current.toString());
            return;
        }

        if(open < n){
            current.append("(");
            backtrack(result, current, open+1, close, n);
            current.deleteCharAt(current.length()-1);
        }

        if(close < open){
            current.append(")");
            backtrack(result, current, open, close+1, n);
            current.deleteCharAt(current.length()-1);
        }
    }
    
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(""), 0, 0, 2);
        System.out.println(result);
    }
}
