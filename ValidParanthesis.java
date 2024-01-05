import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty())return false;
                char pop = stack.pop();
                if(ch == ')' && pop != '(') return false;
                else if(ch == '}' && pop != '{') return false;
                else if(ch == ']' && pop != '[') return false;
            }
        }

        if(!stack.isEmpty()) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
}
