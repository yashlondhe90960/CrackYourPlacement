class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int left = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, left, i);
                left++;
            }
        }

    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}