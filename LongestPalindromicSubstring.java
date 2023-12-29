public class LongestPalindromicSubstring {
    public static void longestPalindromicSubstring(String s){
        String res = "";
        int len = 0;

        for(int i=0; i<s.length(); i++){
            // Odd length String
            int l = i, r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > len){
                    len = r-l+1;
                    res = s.substring(l, r+1);
                }
                l--; r++;
            }

            // Even length String
            l = i; r = i+1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r-l+1 > len){
                    len = r-l+1;
                    res = s.substring(l, r+1);
                }
                l--; r++;
            }
        }

        System.out.println(res);
    }

    public static void longestPalindromicSubstring1(String s){
        boolean[][] dp = new boolean[s.length()][s.length()];
        int len = 0;
        String res = "";
        for(int g=0; g<s.length(); g++){
            for(int i=0, j=g; j<dp.length; i++, j++){
                if(g == 0){
                    dp[i][j] = true;
                }else if(g == 1){
                    dp[i][j] = s.charAt(i) == s.charAt(j);
                }else{
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i+1][j-1];
                }

                if(dp[i][j] && (j-i+1 > len)){
                    len = j-i+1;
                    res = s.substring(i, j+1);
                }
            }
        }

        System.out.println(res);
    }

    public static void main(String[] args) {
        longestPalindromicSubstring("cbbd");
    }
}
