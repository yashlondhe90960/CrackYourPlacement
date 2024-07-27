class Solution {
    public static long[] productExceptSelf(int arr[], int n) {
        long[] prod = new long[n];

        if (n == 1) {
            prod[0] = 1;
            return prod;
        }

        long temp = 1;

        for (int i = 0; i < n; i++)
            prod[i] = 1;

        for (int i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }

        temp = 1;

        for (int i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }

        return prod;
    }
}