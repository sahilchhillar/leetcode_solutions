public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs[0].length(); i++){
            char ch = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(strs[j].length() <= i || strs[j].charAt(i) != ch){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flower"};
        System.out.println(longestCommonPrefix(strs));
    }
}
