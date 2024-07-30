class Solution {
    // Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int arr[]) {
        // Code here
        int n = arr.length;
        int[] sorted = Arrays.copyOf(arr, n);
        Arrays.sort(sorted);

        HashMap<Integer, Integer> originalIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            originalIndex.put(arr[i], i);
        }

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int j = i;
                int cycleSize = 0;

                while (!visited[j]) {
                    visited[j] = true;
                    j = originalIndex.get(sorted[j]);
                    cycleSize++;
                }

                swaps += cycleSize - 1;
            }
        }

        return swaps;
    }

}

