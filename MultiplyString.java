import java.util.ArrayList;
import java.util.List;

public class MultiplyString {
    public static void multiple(int num1, int num2){

    }

    public static String multiplyString(String num1, String num2){
        List<Long> nums = new ArrayList<>();
        for(int i=num2.length()-1; i>=0; i--){
            int n1 = num2.charAt(i) - '0';
            int carry = 0;
            Long number = 0L;
            int j = num1.length()-1;
            int pow = 0;
            while(j >= 0 || carry != 0){
                int n2 = j >= 0 ? num1.charAt(j) - '0' : 0;
                int val = n1 * n2 + carry;
                carry = val / 10;
                val %= 10;
                val = val * (int) Math.pow(10, pow);
                number = val + number;
                pow++;
                j--;
            }
            nums.add(number);
        }

        Long res = 0L;
        for(int i=0; i<nums.size(); i++){
            res += nums.get(i) * (int) Math.pow(10, i);
        }

        return Long.toString(res);
    }

    public static void main(String[] args) {
        String num1 = "881095803", num2 = "61";
        System.out.println(multiplyString(num1, num2));
    }
}
