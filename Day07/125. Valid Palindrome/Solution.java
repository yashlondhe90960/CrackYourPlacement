class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int n = s.length();
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            char currFirst = s.charAt(left);
            char currLast = s.charAt(right);

            if (!Character.isLetterOrDigit(currFirst)) {
                left++;
            } else if (!Character.isLetterOrDigit(currLast)) {
                right--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}