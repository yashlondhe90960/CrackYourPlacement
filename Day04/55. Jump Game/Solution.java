class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;

        }
        // dp solution
        int[] dp = new int[nums.length];
        for (int i = 1; i < nums.length; i++) { // start from 1 bcoz already frm index 0
            dp[i] = Math.max(dp[i - 1], nums[i - 1]) - 1;

            if (dp[i] < 0) {
                return false;

            }
        }
        return true;

    }
}

// Greedy solution
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int finalPos = n - 1;

        for (int idx = n - 2; idx >= 0; idx--) {
            if (idx + nums[idx] >= finalPos) {
                finalPos = idx;
            }
        }
        return finalPos == 0;
    }
}

// normal method
// if(nums==null || nums.length==0)
// return false;

// int reach=0;
// for(int i=0;i<nums.length;i++)
// {
// if(reach>=nums.length-1 || reach<i){
// break;

// }
// reach=Math.max(reach,i+nums[i]);
// }
// return reach >= nums.length-1;
