class Solution {
    public int numFriendRequests(int[] ages) {
       // key:age value:count
        Map<Integer, Integer> map = new HashMap<>(0);
        for (int age : ages) {
            int count = map.getOrDefault(age, 0);
            map.put(age, count + 1);
        }

        int result = 0;
        for (Map.Entry<Integer, Integer> entryA : map.entrySet()) {
            for (Map.Entry<Integer, Integer> entryB : map.entrySet()) {
                int ageA = entryA.getKey();
                int ageB = entryB.getKey();
                int countB = entryB.getValue();
                if (ageA == ageB && countB == 1) {
                    // 自己
                    continue;
                }
                if ((ageA <= 0.5 * ageB + 7)
                        || (ageA > ageB)
                        || (ageA > 100 && ageB < 100)) {
                    // 不符合条件
                    continue;
                }
                if (ageA == ageB) {
                    // 相同年龄，符合条件则两两都符合，A(2,n)
                    int mutli = 1;
                    for (int i = countB; i >= (countB - 2 + 1); i--) {
                        mutli *= i;
                    }
                    result += mutli;
                    continue;
                }
                // ageA:countA
                // ageB:countB
                // N:N关系
                int countA = entryA.getValue();
                result += countA * countB;
            }
        }
        return result;
    }
}