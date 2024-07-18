class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n == 0)
            return 0;

        HashMap<Integer, Integer> mymap = new HashMap<>();
        mymap.put(0, 1);

        int currSum = 0;
        int count = 0;

        for (int num : nums) {
            currSum += num;
            if (mymap.containsKey(currSum - k)) {
                count += mymap.get(currSum - k);

            }
            mymap.put(currSum, mymap.getOrDefault(currSum, 0) + 1);
        }

        return count;

    }
}