public class NeedleInHaystack {
    public static int needleInHaystack(String needle, String haystack){
        if(needle.length() > haystack.length()){
            return -1;
        }
        
        int i = 0;
        int needleLength = needle.length();
        while(i <= (haystack.length() - needleLength)){
            String str = haystack.substring(i, i+needleLength);
            if(str.equals(needle)){
                return i;
            }
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(needleInHaystack(needle, haystack));
    }
}
