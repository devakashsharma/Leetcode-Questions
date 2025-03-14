import java.util.HashMap;

public class Q4_containsDuplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Integer> hMap = new HashMap<>();
            for (int num : nums) {
                if (hMap.containsKey(num) && hMap.get(num) >= 1) {
                    return true;
                }

                hMap.put(num, hMap.getOrDefault(num, 0) + 1);
            }

            return false;
        }
    }
}
