import java.util.HashMap;

public class D101_pairsArr {
    class Solution {
        public boolean divideArray(int[] nums) {
            HashMap<Integer, Integer> hMap = new HashMap<>();
            for (int num : nums) {
                hMap.put(num, hMap.getOrDefault(num, 0) + 1);
            }

            for (int count : hMap.values()) {
                if (count % 2 != 0) {
                    return false;
                }
            }

            return true;
        }
    }
}