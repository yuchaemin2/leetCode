import java.util.Scanner;
import java.util.Arrays;

class Solution {
    public static boolean isPalindrome(int x) {
        if (x<0) return false;

        String str = String.valueOf(x);
        int len = str.length();
        
        for(int i=0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-1-i)){
                return false;
            }
        }

        return true;
    }
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean result = isPalindrome(n);
        System.out.println(result);
	}
}