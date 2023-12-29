import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumberCombination {
    public static List<String> phoneNumberCombination(String digits){
        Map<Character, List<String>> map = new HashMap<>();
        map.put('2', Arrays.asList(new String[]{"a","b","c"}));
        map.put('3', Arrays.asList(new String[]{"d","e","f"}));
        map.put('4', Arrays.asList(new String[]{"g","h","i"}));
        map.put('5', Arrays.asList(new String[]{"j","k","l"}));
        map.put('6', Arrays.asList(new String[]{"m","n","o"}));
        map.put('7', Arrays.asList(new String[]{"p","q","r","s"}));
        map.put('8', Arrays.asList(new String[]{"t","u","v"}));
        map.put('9', Arrays.asList(new String[]{"w","x","y","z"}));

        if(digits.length() == 0) return null;
        List<String> result = map.get(digits.charAt(0));
        for(int i=0; i<digits.length()-1; i++){
            result = phoneNumberHelper(result, map.get(digits.charAt(i+1)));
        }

        return result;
    }

    public static List<String> phoneNumberHelper(List<String> l1, List<String> l2){
        List<String> result = new ArrayList<>();
        for(String s1: l1){
            for(String s2: l2){
                result.add(s1+s2);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(phoneNumberCombination("23"));
    }
}
