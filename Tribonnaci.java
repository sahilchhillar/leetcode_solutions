public class Tribonnaci{
    public static int tribonnaci(int n){
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        int a = 0, b = 1, c = 1;
        int i = 3;
        int res = 0;
        while(i <= n){
            res = a + b + c;
            a = b; b = c; c = res;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(tribonnaci(35));
    }
}