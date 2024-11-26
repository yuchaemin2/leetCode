import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(sc.hasNext()){
            if(sc.hasNextInt()){
                list.add(sc.nextInt());
            }
        }

		int[] nums = list.stream().mapToInt(i -> i).toArray();
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }

        sc.close();
        
	}
}