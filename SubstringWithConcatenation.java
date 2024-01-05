import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenation {
    public static boolean checkForWords(String subString, Map<String, Integer> cloneMap, int length){
        Map<String, Integer> newMap = new HashMap<>();
        int i=0;

        while(i < subString.length()){
            String str = subString.substring(i, i+length);
            newMap.put(str, newMap.getOrDefault(str, 0)+1);
            i += length;
        }

        System.out.println("\nSubString Map: ");
        newMap.forEach((key, val) -> {
            System.out.println(key + " -> " + val);
        });

        // Check if the maps match
        for(Map.Entry<String, Integer> entry : newMap.entrySet()){
            String key = entry.getKey();
            Integer val = entry.getValue();

            if(!cloneMap.containsKey(key) || cloneMap.get(key) != val){
                return false;
            }
        }

        return true;
    }

    public static void substringWithConcatenation(String s, String[] words){
        int count = words.length;
        int length = words[0].length();

        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        System.out.println("Actual Map: ");
        map.forEach((key, val) -> {
            System.out.println(key + " -> " + val);
        });

        int i = 0;
        List<Integer> result = new ArrayList<>();
        while(i < s.length() - (count*length)+1){
            String subString = s.substring(i, i + (count*length));
            Map<String, Integer> clone = map;
            if(checkForWords(subString, clone, length)){
                result.add(i);
                i += length;
            }else{
                i++;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String[] words = new String[]{"word","good","best","good"};

        substringWithConcatenation(s, words);
    }
}
