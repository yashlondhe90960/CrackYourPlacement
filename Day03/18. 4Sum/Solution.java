class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length; // size of the array
        List<List<Integer>> res = new ArrayList<>();

        // sort the given array:
        Arrays.sort(nums);

        // Method 2
        HashSet<String> unique = new HashSet<>();

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[left];
                    sum += nums[right];

                    if (sum < target) {
                        left++;
                    }

                    else if (sum > target) {
                        right--;

                    } else {
                        // here it can contains duplicate entires
                        StringBuilder sb = new StringBuilder();
                        sb.append(nums[i]);
                        sb.append(nums[j]);
                        sb.append(nums[left]);
                        sb.append(nums[right]);
                        String code = sb.toString();

                        if (unique.contains(code) == false) {
                            unique.add(code);
                            res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        }

                        left++;
                        right--;
                    }
                }
            }
        }
        return res;

        // Method 1

        // // calculating the quadruplets:
        // for (int i = 0; i < n; i++) {
        // // avoid the duplicates while moving i:
        // if (i > 0 && nums[i] == nums[i - 1]) continue;
        // for (int j = i + 1; j < n; j++) {
        // // avoid the duplicates while moving j:
        // if (j > i + 1 && nums[j] == nums[j - 1]) continue;

        // // 2 pointers:
        // int k = j + 1;
        // int l = n - 1;
        // while (k < l) {
        // long sum = nums[i];
        // sum += nums[j];
        // sum += nums[k];
        // sum += nums[l];
        // if (sum == target) {
        // List<Integer> temp = new ArrayList<>();
        // temp.add(nums[i]);
        // temp.add(nums[j]);
        // temp.add(nums[k]);
        // temp.add(nums[l]);
        // ans.add(temp);
        // k++;
        // l--;

        // // skip the duplicates:
        // while (k < l && nums[k] == nums[k - 1]) k++;
        // while (k < l && nums[l] == nums[l + 1]) l--;
        // } else if (sum < target) k++;
        // else l--;
        // }
        // }
        // }

        // return ans;

    }
}