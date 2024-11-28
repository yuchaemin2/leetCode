import java.util.Scanner;
import java.util.ArrayList;

class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break; // Exit loop on empty input line
            }
            list.add(line);
        }

        // Convert ArrayList to String array
        String[] strs = list.toArray(new String[0]);

        String pr = longestCommonPrefix(strs);
        System.out.print(pr);


    }
}