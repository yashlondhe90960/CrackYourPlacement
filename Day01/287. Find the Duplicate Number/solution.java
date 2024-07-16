class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];

        } while(slow != fast);

        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];

        }
        return slow;

        // Arrays.sort(nums);
        // for(int i=1; i<nums.length;i++){
        //     if(nums[i] == nums[i-1]){
        //         return nums[i];

        //     }
        // }

        // return 0;




        // int n = nums.length;
        // int[] freq = new  int[n+1];
        
        // for(int i=0;i<n;i++){
        //     if(freq[nums[i]] == 0) {
        //         freq[nums[i]] += 1;
        //     } else {
        //         return nums[i];
        //     }
        // }
        // return 0;

    }
}