class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, 1 + map.getOrDefault(i, 0));
        }

        for (int count : map.values()) {
            if (count % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}