class Solution {
    public int longestConsecutive(int[] nums) {
      if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Boolean> intMap = new HashMap<>(nums.length);
        for (int num : nums) {
            intMap.put(num, true);
        }
        int result = 1;
        for (int num : nums) {
            if (!intMap.containsKey(num)) {
                continue;
            }
            int sum = 1;
            // left
            for (int i = num - 1; intMap.containsKey(i); i--) {
                sum++;
                intMap.remove(i);
            }
            // right
            for (int i = num + 1; intMap.containsKey(i); i++) {
                sum++;
                intMap.remove(i);
            }
            intMap.remove(num);
            result = Math.max(result, sum);
        }
        return result;
    }
}