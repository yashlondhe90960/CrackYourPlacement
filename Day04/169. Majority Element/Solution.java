class Solution {
    public int majorityElement(int[] nums) {
        // int n = nums.length;
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0;i<n;i++){
        // int value = map.getOrDefault(nums[i], 0);
        // map.put(nums[i], value+1);
        // }

        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        // if(entry.getValue() > (n/2)){
        // return entry.getKey();
        // }
        // }
        // return -1;

        // int n =nums.length;
        // for(int i=0;i<n;i++){
        // int cnt = 0;
        // for(int j=0;j<n;j++){
        // if(nums[i]==nums[j]) cnt++;
        // }

        // if(cnt > (n/2)) return nums[i];

        // }

        // return -1;

        int res = 0;
        int majority = 0;
        for (int n : nums) {
            if (majority == 0) {
                res = n;
            }

            majority += n == res ? 1 : -1;
        }
        return res;
    }
}