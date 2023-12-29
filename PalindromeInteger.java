public class PalindromeInteger {
    public static int reverseInt(int x){
        int x_new = 0;
        int pop;
        while(x > 0){
            pop = x%10;
            x /= 10;
            x_new = x_new*10 + pop;
        }

        return x_new;
    }
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        return x == reverseInt(x);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(122));
    }
}
